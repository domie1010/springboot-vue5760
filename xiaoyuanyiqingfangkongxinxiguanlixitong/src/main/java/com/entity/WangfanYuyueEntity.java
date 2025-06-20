package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 上报信息
 *
 * @author 
 * @email
 */
@TableName("wangfan_yuyue")
public class WangfanYuyueEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public WangfanYuyueEntity() {

	}

	public WangfanYuyueEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 用户
     */
    @ColumnInfo(comment="用户",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 申请理由
     */
    @ColumnInfo(comment="申请理由",type="text")
    @TableField(value = "wangfan_yuyue_text")

    private String wangfanYuyueText;


    /**
     * 交通工具
     */
    @ColumnInfo(comment="交通工具",type="int(11)")
    @TableField(value = "wangfan_yuyue_types")

    private Integer wangfanYuyueTypes;


    /**
     * 去哪里
     */
    @ColumnInfo(comment="去哪里",type="varchar(200)")
    @TableField(value = "wangfan_yuyue_mudidi")

    private String wangfanYuyueMudidi;


    /**
     * 所在地
     */
    @ColumnInfo(comment="所在地",type="varchar(200)")
    @TableField(value = "wangfan_yuyue_chufadi")

    private String wangfanYuyueChufadi;


    /**
     * 出发时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @ColumnInfo(comment="出发时间",type="date")
    @TableField(value = "wangfan_yuyue_chufa_time")

    private Date wangfanYuyueChufaTime;


    /**
     * 到达时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @ColumnInfo(comment="到达时间",type="date")
    @TableField(value = "wangfan_yuyue_daoda_time")

    private Date wangfanYuyueDaodaTime;


    /**
     * 申报状态
     */
    @ColumnInfo(comment="申报状态",type="int(11)")
    @TableField(value = "wangfan_yuyue_yesno_types")

    private Integer wangfanYuyueYesnoTypes;


    /**
     * 审核回复
     */
    @ColumnInfo(comment="审核回复",type="text")
    @TableField(value = "wangfan_yuyue_yesno_text")

    private String wangfanYuyueYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="审核时间",type="timestamp")
    @TableField(value = "wangfan_yuyue_shenhe_time")

    private Date wangfanYuyueShenheTime;


    /**
     * 疫苗接种时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="疫苗接种时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间  listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 获取：创建时间  listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间  listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "WangfanYuyue{" +
            ", id=" + id +
            ", yonghuId=" + yonghuId +
            ", wangfanYuyueText=" + wangfanYuyueText +
            ", wangfanYuyueTypes=" + wangfanYuyueTypes +
            ", wangfanYuyueMudidi=" + wangfanYuyueMudidi +
            ", wangfanYuyueChufadi=" + wangfanYuyueChufadi +
            ", wangfanYuyueChufaTime=" + DateUtil.convertString(wangfanYuyueChufaTime,"yyyy-MM-dd") +
            ", wangfanYuyueDaodaTime=" + DateUtil.convertString(wangfanYuyueDaodaTime,"yyyy-MM-dd") +
            ", wangfanYuyueYesnoTypes=" + wangfanYuyueYesnoTypes +
            ", wangfanYuyueYesnoText=" + wangfanYuyueYesnoText +
            ", wangfanYuyueShenheTime=" + DateUtil.convertString(wangfanYuyueShenheTime,"yyyy-MM-dd") +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
