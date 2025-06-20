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
 * 疫苗接种
 *
 * @author 
 * @email
 */
@TableName("yimiao_yuyue")
public class YimiaoYuyueEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YimiaoYuyueEntity() {

	}

	public YimiaoYuyueEntity(T t) {
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
     * 报名编号
     */
    @ColumnInfo(comment="报名编号",type="varchar(200)")
    @TableField(value = "yimiao_yuyue_uuid_number")

    private String yimiaoYuyueUuidNumber;


    /**
     * 疫苗
     */
    @ColumnInfo(comment="疫苗",type="int(11)")
    @TableField(value = "yimiao_id")

    private Integer yimiaoId;


    /**
     * 用户
     */
    @ColumnInfo(comment="用户",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 报名理由
     */
    @ColumnInfo(comment="报名理由",type="longtext")
    @TableField(value = "yimiao_yuyue_text")

    private String yimiaoYuyueText;


    /**
     * 疫苗接种时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="疫苗接种时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 报名状态
     */
    @ColumnInfo(comment="报名状态",type="int(11)")
    @TableField(value = "yimiao_yuyue_yesno_types")

    private Integer yimiaoYuyueYesnoTypes;


    /**
     * 审核回复
     */
    @ColumnInfo(comment="审核回复",type="longtext")
    @TableField(value = "yimiao_yuyue_yesno_text")

    private String yimiaoYuyueYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="审核时间",type="timestamp")
    @TableField(value = "yimiao_yuyue_shenhe_time")

    private Date yimiaoYuyueShenheTime;


    /**
     * 预约时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="预约时间",type="timestamp")
    @TableField(value = "yimiao_yuyue_time")

    private Date yimiaoYuyueTime;


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
        return "YimiaoYuyue{" +
            ", id=" + id +
            ", yimiaoYuyueUuidNumber=" + yimiaoYuyueUuidNumber +
            ", yimiaoId=" + yimiaoId +
            ", yonghuId=" + yonghuId +
            ", yimiaoYuyueText=" + yimiaoYuyueText +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", yimiaoYuyueYesnoTypes=" + yimiaoYuyueYesnoTypes +
            ", yimiaoYuyueYesnoText=" + yimiaoYuyueYesnoText +
            ", yimiaoYuyueShenheTime=" + DateUtil.convertString(yimiaoYuyueShenheTime,"yyyy-MM-dd") +
            ", yimiaoYuyueTime=" + DateUtil.convertString(yimiaoYuyueTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
