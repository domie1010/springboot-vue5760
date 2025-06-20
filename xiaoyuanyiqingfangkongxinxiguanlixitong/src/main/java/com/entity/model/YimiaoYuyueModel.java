package com.entity.model;

import com.entity.YimiaoYuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 疫苗接种
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class YimiaoYuyueModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 报名编号
     */
    private String yimiaoYuyueUuidNumber;


    /**
     * 疫苗
     */
    private Integer yimiaoId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 报名理由
     */
    private String yimiaoYuyueText;


    /**
     * 疫苗接种时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 报名状态
     */
    private Integer yimiaoYuyueYesnoTypes;


    /**
     * 审核回复
     */
    private String yimiaoYuyueYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date yimiaoYuyueShenheTime;


    /**
     * 预约时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date yimiaoYuyueTime;


    /**
     * 创建时间 show3 listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：报名编号
	 */
    public String getYimiaoYuyueUuidNumber() {
        return yimiaoYuyueUuidNumber;
    }


    /**
	 * 设置：报名编号
	 */
    public void setYimiaoYuyueUuidNumber(String yimiaoYuyueUuidNumber) {
        this.yimiaoYuyueUuidNumber = yimiaoYuyueUuidNumber;
    }
    /**
	 * 获取：疫苗
	 */
    public Integer getYimiaoId() {
        return yimiaoId;
    }


    /**
	 * 设置：疫苗
	 */
    public void setYimiaoId(Integer yimiaoId) {
        this.yimiaoId = yimiaoId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：报名理由
	 */
    public String getYimiaoYuyueText() {
        return yimiaoYuyueText;
    }


    /**
	 * 设置：报名理由
	 */
    public void setYimiaoYuyueText(String yimiaoYuyueText) {
        this.yimiaoYuyueText = yimiaoYuyueText;
    }
    /**
	 * 获取：疫苗接种时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：疫苗接种时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：报名状态
	 */
    public Integer getYimiaoYuyueYesnoTypes() {
        return yimiaoYuyueYesnoTypes;
    }


    /**
	 * 设置：报名状态
	 */
    public void setYimiaoYuyueYesnoTypes(Integer yimiaoYuyueYesnoTypes) {
        this.yimiaoYuyueYesnoTypes = yimiaoYuyueYesnoTypes;
    }
    /**
	 * 获取：审核回复
	 */
    public String getYimiaoYuyueYesnoText() {
        return yimiaoYuyueYesnoText;
    }


    /**
	 * 设置：审核回复
	 */
    public void setYimiaoYuyueYesnoText(String yimiaoYuyueYesnoText) {
        this.yimiaoYuyueYesnoText = yimiaoYuyueYesnoText;
    }
    /**
	 * 获取：审核时间
	 */
    public Date getYimiaoYuyueShenheTime() {
        return yimiaoYuyueShenheTime;
    }


    /**
	 * 设置：审核时间
	 */
    public void setYimiaoYuyueShenheTime(Date yimiaoYuyueShenheTime) {
        this.yimiaoYuyueShenheTime = yimiaoYuyueShenheTime;
    }
    /**
	 * 获取：预约时间
	 */
    public Date getYimiaoYuyueTime() {
        return yimiaoYuyueTime;
    }


    /**
	 * 设置：预约时间
	 */
    public void setYimiaoYuyueTime(Date yimiaoYuyueTime) {
        this.yimiaoYuyueTime = yimiaoYuyueTime;
    }
    /**
	 * 获取：创建时间 show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3 listShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
