package com.dao;

import com.entity.YimiaoYuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YimiaoYuyueView;

/**
 * 疫苗接种 Dao 接口
 *
 * @author 
 */
public interface YimiaoYuyueDao extends BaseMapper<YimiaoYuyueEntity> {

   List<YimiaoYuyueView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
