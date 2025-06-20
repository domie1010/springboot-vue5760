package com.entity.vo;

import com.entity.WangfanYuyueEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 上报信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("wangfan_yuyue")
public class WangfanYuyueVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 申请理由
     */

    @TableField(value = "wangfan_yuyue_text")
    private String wangfanYuyueText;


    /**
     * 交通工具
     */

    @TableField(value = "wangfan_yuyue_types")
    private Integer wangfanYuyueTypes;


    /**
     * 去哪里
     */

    @TableField(value = "wangfan_yuyue_mudidi")
    private String wangfanYuyueMudidi;


    /**
     * 所在地
     */

    @TableField(value = "wangfan_yuyue_chufadi")
    private String wangfanYuyueChufadi;


    /**
     * 出发时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "wangfan_yuyue_chufa_time")
    private Date wangfanYuyueChufaTime;


    /**
     * 到达时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "wangfan_yuyue_daoda_time")
    private Date wangfanYuyueDaodaTime;


    /**
     * 申报状态
     */

    @TableField(value = "wangfan_yuyue_yesno_types")
    private Integer wangfanYuyueYesnoTypes;


    /**
     * 审核回复
     */

    @TableField(value = "wangfan_yuyue_yesno_text")
    private String wangfanYuyueYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "wangfan_yuyue_shenhe_time")
    private Date wangfanYuyueShenheTime;


    /**
     * 疫苗接种时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show3 listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：申请理由
	 */
    public String getWangfanYuyueText() {
        return wangfanYuyueText;
    }


    /**
	 * 获取：申请理由
	 */

    public void setWangfanYuyueText(String wangfanYuyueText) {
        this.wangfanYuyueText = wangfanYuyueText;
    }
    /**
	 * 设置：交通工具
	 */
    public Integer getWangfanYuyueTypes() {
        return wangfanYuyueTypes;
    }


    /**
	 * 获取：交通工具
	 */

    public void setWangfanYuyueTypes(Integer wangfanYuyueTypes) {
        this.wangfanYuyueTypes = wangfanYuyueTypes;
    }
    /**
	 * 设置：去哪里
	 */
    public String getWangfanYuyueMudidi() {
        return wangfanYuyueMudidi;
    }


    /**
	 * 获取：去哪里
	 */

    public void setWangfanYuyueMudidi(String wangfanYuyueMudidi) {
        this.wangfanYuyueMudidi = wangfanYuyueMudidi;
    }
    /**
	 * 设置：所在地
	 */
    public String getWangfanYuyueChufadi() {
        return wangfanYuyueChufadi;
    }


    /**
	 * 获取：所在地
	 */

    public void setWangfanYuyueChufadi(String wangfanYuyueChufadi) {
        this.wangfanYuyueChufadi = wangfanYuyueChufadi;
    }
    /**
	 * 设置：出发时间
	 */
    public Date getWangfanYuyueChufaTime() {
        return wangfanYuyueChufaTime;
    }


    /**
	 * 获取：出发时间
	 */

    public void setWangfanYuyueChufaTime(Date wangfanYuyueChufaTime) {
        this.wangfanYuyueChufaTime = wangfanYuyueChufaTime;
    }
    /**
	 * 设置：到达时间
	 */
    public Date getWangfanYuyueDaodaTime() {
        return wangfanYuyueDaodaTime;
    }


    /**
	 * 获取：到达时间
	 */

    public void setWangfanYuyueDaodaTime(Date wangfanYuyueDaodaTime) {
        this.wangfanYuyueDaodaTime = wangfanYuyueDaodaTime;
    }
    /**
	 * 设置：申报状态
	 */
    public Integer getWangfanYuyueYesnoTypes() {
        return wangfanYuyueYesnoTypes;
    }


    /**
	 * 获取：申报状态
	 */

    public void setWangfanYuyueYesnoTypes(Integer wangfanYuyueYesnoTypes) {
        this.wangfanYuyueYesnoTypes = wangfanYuyueYesnoTypes;
    }
    /**
	 * 设置：审核回复
	 */
    public String getWangfanYuyueYesnoText() {
        return wangfanYuyueYesnoText;
    }


    /**
	 * 获取：审核回复
	 */

    public void setWangfanYuyueYesnoText(String wangfanYuyueYesnoText) {
        this.wangfanYuyueYesnoText = wangfanYuyueYesnoText;
    }
    /**
	 * 设置：审核时间
	 */
    public Date getWangfanYuyueShenheTime() {
        return wangfanYuyueShenheTime;
    }


    /**
	 * 获取：审核时间
	 */

    public void setWangfanYuyueShenheTime(Date wangfanYuyueShenheTime) {
        this.wangfanYuyueShenheTime = wangfanYuyueShenheTime;
    }
    /**
	 * 设置：疫苗接种时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：疫苗接种时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间 show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3 listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
