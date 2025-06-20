package com.entity.model;

import com.entity.WangfanYuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 上报信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class WangfanYuyueModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 申请理由
     */
    private String wangfanYuyueText;


    /**
     * 交通工具
     */
    private Integer wangfanYuyueTypes;


    /**
     * 去哪里
     */
    private String wangfanYuyueMudidi;


    /**
     * 所在地
     */
    private String wangfanYuyueChufadi;


    /**
     * 出发时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date wangfanYuyueChufaTime;


    /**
     * 到达时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date wangfanYuyueDaodaTime;


    /**
     * 申报状态
     */
    private Integer wangfanYuyueYesnoTypes;


    /**
     * 审核回复
     */
    private String wangfanYuyueYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date wangfanYuyueShenheTime;


    /**
     * 疫苗接种时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


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
	 * 获取：申请理由
	 */
    public String getWangfanYuyueText() {
        return wangfanYuyueText;
    }


    /**
	 * 设置：申请理由
	 */
    public void setWangfanYuyueText(String wangfanYuyueText) {
        this.wangfanYuyueText = wangfanYuyueText;
    }
    /**
	 * 获取：交通工具
	 */
    public Integer getWangfanYuyueTypes() {
        return wangfanYuyueTypes;
    }


    /**
	 * 设置：交通工具
	 */
    public void setWangfanYuyueTypes(Integer wangfanYuyueTypes) {
        this.wangfanYuyueTypes = wangfanYuyueTypes;
    }
    /**
	 * 获取：去哪里
	 */
    public String getWangfanYuyueMudidi() {
        return wangfanYuyueMudidi;
    }


    /**
	 * 设置：去哪里
	 */
    public void setWangfanYuyueMudidi(String wangfanYuyueMudidi) {
        this.wangfanYuyueMudidi = wangfanYuyueMudidi;
    }
    /**
	 * 获取：所在地
	 */
    public String getWangfanYuyueChufadi() {
        return wangfanYuyueChufadi;
    }


    /**
	 * 设置：所在地
	 */
    public void setWangfanYuyueChufadi(String wangfanYuyueChufadi) {
        this.wangfanYuyueChufadi = wangfanYuyueChufadi;
    }
    /**
	 * 获取：出发时间
	 */
    public Date getWangfanYuyueChufaTime() {
        return wangfanYuyueChufaTime;
    }


    /**
	 * 设置：出发时间
	 */
    public void setWangfanYuyueChufaTime(Date wangfanYuyueChufaTime) {
        this.wangfanYuyueChufaTime = wangfanYuyueChufaTime;
    }
    /**
	 * 获取：到达时间
	 */
    public Date getWangfanYuyueDaodaTime() {
        return wangfanYuyueDaodaTime;
    }


    /**
	 * 设置：到达时间
	 */
    public void setWangfanYuyueDaodaTime(Date wangfanYuyueDaodaTime) {
        this.wangfanYuyueDaodaTime = wangfanYuyueDaodaTime;
    }
    /**
	 * 获取：申报状态
	 */
    public Integer getWangfanYuyueYesnoTypes() {
        return wangfanYuyueYesnoTypes;
    }


    /**
	 * 设置：申报状态
	 */
    public void setWangfanYuyueYesnoTypes(Integer wangfanYuyueYesnoTypes) {
        this.wangfanYuyueYesnoTypes = wangfanYuyueYesnoTypes;
    }
    /**
	 * 获取：审核回复
	 */
    public String getWangfanYuyueYesnoText() {
        return wangfanYuyueYesnoText;
    }


    /**
	 * 设置：审核回复
	 */
    public void setWangfanYuyueYesnoText(String wangfanYuyueYesnoText) {
        this.wangfanYuyueYesnoText = wangfanYuyueYesnoText;
    }
    /**
	 * 获取：审核时间
	 */
    public Date getWangfanYuyueShenheTime() {
        return wangfanYuyueShenheTime;
    }


    /**
	 * 设置：审核时间
	 */
    public void setWangfanYuyueShenheTime(Date wangfanYuyueShenheTime) {
        this.wangfanYuyueShenheTime = wangfanYuyueShenheTime;
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
