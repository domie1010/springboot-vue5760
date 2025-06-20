
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 疫苗接种
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/yimiaoYuyue")
public class YimiaoYuyueController {
    private static final Logger logger = LoggerFactory.getLogger(YimiaoYuyueController.class);

    private static final String TABLE_NAME = "yimiaoYuyue";

    @Autowired
    private YimiaoYuyueService yimiaoYuyueService;


    @Autowired
    private TokenService tokenService;

    @Autowired
    private ChatService chatService;//疫情咨询
    @Autowired
    private DakaService dakaService;//疫情数据
    @Autowired
    private DictionaryService dictionaryService;//字典
    @Autowired
    private FengkongService fengkongService;//隔离信息
    @Autowired
    private ForumService forumService;//交流论坛
    @Autowired
    private GonggaoService gonggaoService;//通知公告
    @Autowired
    private JiaoyuService jiaoyuService;//防疫宣传
    @Autowired
    private WangfanYuyueService wangfanYuyueService;//上报信息
    @Autowired
    private YimiaoService yimiaoService;//疫苗
    @Autowired
    private YonghuService yonghuService;//用户
    @Autowired
    private UsersService usersService;//管理员


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        CommonUtil.checkMap(params);
        PageUtils page = yimiaoYuyueService.queryPage(params);

        //字典表数据转换
        List<YimiaoYuyueView> list =(List<YimiaoYuyueView>)page.getList();
        for(YimiaoYuyueView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        YimiaoYuyueEntity yimiaoYuyue = yimiaoYuyueService.selectById(id);
        if(yimiaoYuyue !=null){
            //entity转view
            YimiaoYuyueView view = new YimiaoYuyueView();
            BeanUtils.copyProperties( yimiaoYuyue , view );//把实体数据重构到view中
            //级联表 疫苗
            //级联表
            YimiaoEntity yimiao = yimiaoService.selectById(yimiaoYuyue.getYimiaoId());
            if(yimiao != null){
            BeanUtils.copyProperties( yimiao , view ,new String[]{ "id", "createTime", "insertTime", "updateTime", "username", "password", "newMoney", "yonghuId"});//把级联的数据添加到view中,并排除id和创建时间字段,当前表的级联注册表
            view.setYimiaoId(yimiao.getId());
            }
            //级联表 用户
            //级联表
            YonghuEntity yonghu = yonghuService.selectById(yimiaoYuyue.getYonghuId());
            if(yonghu != null){
            BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createTime", "insertTime", "updateTime", "username", "password", "newMoney", "yonghuId"});//把级联的数据添加到view中,并排除id和创建时间字段,当前表的级联注册表
            view.setYonghuId(yonghu.getId());
            }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody YimiaoYuyueEntity yimiaoYuyue, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,yimiaoYuyue:{}",this.getClass().getName(),yimiaoYuyue.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("用户".equals(role))
            yimiaoYuyue.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<YimiaoYuyueEntity> queryWrapper = new EntityWrapper<YimiaoYuyueEntity>()
            .eq("yimiao_id", yimiaoYuyue.getYimiaoId())
            .eq("yonghu_id", yimiaoYuyue.getYonghuId())
            .in("yimiao_yuyue_yesno_types", new Integer[]{1,2})
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        YimiaoYuyueEntity yimiaoYuyueEntity = yimiaoYuyueService.selectOne(queryWrapper);
//        if(yimiaoYuyueEntity==null){
            yimiaoYuyue.setInsertTime(new Date());
            yimiaoYuyue.setYimiaoYuyueYesnoTypes(1);
            yimiaoYuyue.setCreateTime(new Date());
            yimiaoYuyueService.insert(yimiaoYuyue);
            return R.ok();
//        }else {
//            if(yimiaoYuyueEntity.getYimiaoYuyueYesnoTypes()==1)
//                return R.error(511,"有相同的待审核的数据");
//            else if(yimiaoYuyueEntity.getYimiaoYuyueYesnoTypes()==2)
//                return R.error(511,"有相同的审核通过的数据");
//            else
//                return R.error(511,"表中有相同数据");
//        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody YimiaoYuyueEntity yimiaoYuyue, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,yimiaoYuyue:{}",this.getClass().getName(),yimiaoYuyue.toString());
        YimiaoYuyueEntity oldYimiaoYuyueEntity = yimiaoYuyueService.selectById(yimiaoYuyue.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("用户".equals(role))
//            yimiaoYuyue.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        if("".equals(yimiaoYuyue.getYimiaoYuyueText()) || "null".equals(yimiaoYuyue.getYimiaoYuyueText())){
                yimiaoYuyue.setYimiaoYuyueText(null);
        }
        if("".equals(yimiaoYuyue.getYimiaoYuyueYesnoText()) || "null".equals(yimiaoYuyue.getYimiaoYuyueYesnoText())){
                yimiaoYuyue.setYimiaoYuyueYesnoText(null);
        }

            yimiaoYuyueService.updateById(yimiaoYuyue);//根据id更新
            return R.ok();
    }


    /**
    * 审核
    */
    @RequestMapping("/shenhe")
    public R shenhe(@RequestBody YimiaoYuyueEntity yimiaoYuyueEntity, HttpServletRequest request){
        logger.debug("shenhe方法:,,Controller:{},,yimiaoYuyueEntity:{}",this.getClass().getName(),yimiaoYuyueEntity.toString());

        YimiaoYuyueEntity oldYimiaoYuyue = yimiaoYuyueService.selectById(yimiaoYuyueEntity.getId());//查询原先数据

//        if(yimiaoYuyueEntity.getYimiaoYuyueYesnoTypes() == 2){//通过
//            yimiaoYuyueEntity.setYimiaoYuyueTypes();
//        }else if(yimiaoYuyueEntity.getYimiaoYuyueYesnoTypes() == 3){//拒绝
//            yimiaoYuyueEntity.setYimiaoYuyueTypes();
//        }
        yimiaoYuyueEntity.setYimiaoYuyueShenheTime(new Date());//审核时间
        yimiaoYuyueService.updateById(yimiaoYuyueEntity);//审核

        return R.ok();
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<YimiaoYuyueEntity> oldYimiaoYuyueList =yimiaoYuyueService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        yimiaoYuyueService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //.eq("time", new SimpleDateFormat("yyyy-MM-dd").format(new Date()))
        try {
            List<YimiaoYuyueEntity> yimiaoYuyueList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            YimiaoYuyueEntity yimiaoYuyueEntity = new YimiaoYuyueEntity();
//                            yimiaoYuyueEntity.setYimiaoYuyueUuidNumber(data.get(0));                    //报名编号 要改的
//                            yimiaoYuyueEntity.setYimiaoId(Integer.valueOf(data.get(0)));   //疫苗 要改的
//                            yimiaoYuyueEntity.setYonghuId(Integer.valueOf(data.get(0)));   //用户 要改的
//                            yimiaoYuyueEntity.setYimiaoYuyueText(data.get(0));                    //报名理由 要改的
//                            yimiaoYuyueEntity.setInsertTime(date);//时间
//                            yimiaoYuyueEntity.setYimiaoYuyueYesnoTypes(Integer.valueOf(data.get(0)));   //报名状态 要改的
//                            yimiaoYuyueEntity.setYimiaoYuyueYesnoText(data.get(0));                    //审核回复 要改的
//                            yimiaoYuyueEntity.setYimiaoYuyueShenheTime(sdf.parse(data.get(0)));          //审核时间 要改的
//                            yimiaoYuyueEntity.setYimiaoYuyueTime(sdf.parse(data.get(0)));          //预约时间 要改的
//                            yimiaoYuyueEntity.setCreateTime(date);//时间
                            yimiaoYuyueList.add(yimiaoYuyueEntity);


                            //把要查询是否重复的字段放入map中
                                //报名编号
                                if(seachFields.containsKey("yimiaoYuyueUuidNumber")){
                                    List<String> yimiaoYuyueUuidNumber = seachFields.get("yimiaoYuyueUuidNumber");
                                    yimiaoYuyueUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> yimiaoYuyueUuidNumber = new ArrayList<>();
                                    yimiaoYuyueUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("yimiaoYuyueUuidNumber",yimiaoYuyueUuidNumber);
                                }
                        }

                        //查询是否重复
                         //报名编号
                        List<YimiaoYuyueEntity> yimiaoYuyueEntities_yimiaoYuyueUuidNumber = yimiaoYuyueService.selectList(new EntityWrapper<YimiaoYuyueEntity>().in("yimiao_yuyue_uuid_number", seachFields.get("yimiaoYuyueUuidNumber")));
                        if(yimiaoYuyueEntities_yimiaoYuyueUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(YimiaoYuyueEntity s:yimiaoYuyueEntities_yimiaoYuyueUuidNumber){
                                repeatFields.add(s.getYimiaoYuyueUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [报名编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        yimiaoYuyueService.insertBatch(yimiaoYuyueList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }




    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        CommonUtil.checkMap(params);
        PageUtils page = yimiaoYuyueService.queryPage(params);

        //字典表数据转换
        List<YimiaoYuyueView> list =(List<YimiaoYuyueView>)page.getList();
        for(YimiaoYuyueView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段

        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Integer id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        YimiaoYuyueEntity yimiaoYuyue = yimiaoYuyueService.selectById(id);
            if(yimiaoYuyue !=null){


                //entity转view
                YimiaoYuyueView view = new YimiaoYuyueView();
                BeanUtils.copyProperties( yimiaoYuyue , view );//把实体数据重构到view中

                //级联表
                    YimiaoEntity yimiao = yimiaoService.selectById(yimiaoYuyue.getYimiaoId());
                if(yimiao != null){
                    BeanUtils.copyProperties( yimiao , view ,new String[]{ "id", "createTime", "insertTime", "updateTime", "username", "password", "newMoney", "yonghuId"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYimiaoId(yimiao.getId());
                }
                //级联表
                    YonghuEntity yonghu = yonghuService.selectById(yimiaoYuyue.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createTime", "insertTime", "updateTime", "username", "password", "newMoney", "yonghuId"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody YimiaoYuyueEntity yimiaoYuyue, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,yimiaoYuyue:{}",this.getClass().getName(),yimiaoYuyue.toString());
        Wrapper<YimiaoYuyueEntity> queryWrapper = new EntityWrapper<YimiaoYuyueEntity>()
            .eq("yimiao_yuyue_uuid_number", yimiaoYuyue.getYimiaoYuyueUuidNumber())
            .eq("yimiao_id", yimiaoYuyue.getYimiaoId())
            .eq("yonghu_id", yimiaoYuyue.getYonghuId())
            .eq("yimiao_yuyue_text", yimiaoYuyue.getYimiaoYuyueText())
            .in("yimiao_yuyue_yesno_types", new Integer[]{1,2})
            .eq("yimiao_yuyue_yesno_text", yimiaoYuyue.getYimiaoYuyueYesnoText())
//            .notIn("yimiao_yuyue_types", new Integer[]{102})
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        YimiaoYuyueEntity yimiaoYuyueEntity = yimiaoYuyueService.selectOne(queryWrapper);
//        if(yimiaoYuyueEntity==null){
            yimiaoYuyue.setInsertTime(new Date());
            yimiaoYuyue.setYimiaoYuyueYesnoTypes(1);
            yimiaoYuyue.setCreateTime(new Date());
        yimiaoYuyueService.insert(yimiaoYuyue);

            return R.ok();
//        }else {
//            if(yimiaoYuyueEntity.getYimiaoYuyueYesnoTypes()==1)
//                return R.error(511,"有相同的待审核的数据");
//            else if(yimiaoYuyueEntity.getYimiaoYuyueYesnoTypes()==2)
//                return R.error(511,"有相同的审核通过的数据");
//            else
//                return R.error(511,"表中有相同数据");
//        }
    }

}

