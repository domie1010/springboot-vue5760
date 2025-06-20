package com.entity.vo;

import com.entity.YimiaoYuyueEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 疫苗接种
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("yimiao_yuyue")
public class YimiaoYuyueVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 报名编号
     */

    @TableField(value = "yimiao_yuyue_uuid_number")
    private String yimiaoYuyueUuidNumber;


    /**
     * 疫苗
     */

    @TableField(value = "yimiao_id")
    private Integer yimiaoId;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 报名理由
     */

    @TableField(value = "yimiao_yuyue_text")
    private String yimiaoYuyueText;


    /**
     * 疫苗接种时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 报名状态
     */

    @TableField(value = "yimiao_yuyue_yesno_types")
    private Integer yimiaoYuyueYesnoTypes;


    /**
     * 审核回复
     */

    @TableField(value = "yimiao_yuyue_yesno_text")
    private String yimiaoYuyueYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "yimiao_yuyue_shenhe_time")
    private Date yimiaoYuyueShenheTime;


    /**
     * 预约时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "yimiao_yuyue_time")
    private Date yimiaoYuyueTime;


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
	 * 设置：报名编号
	 */
    public String getYimiaoYuyueUuidNumber() {
        return yimiaoYuyueUuidNumber;
    }


    /**
	 * 获取：报名编号
	 */

    public void setYimiaoYuyueUuidNumber(String yimiaoYuyueUuidNumber) {
        this.yimiaoYuyueUuidNumber = yimiaoYuyueUuidNumber;
    }
    /**
	 * 设置：疫苗
	 */
    public Integer getYimiaoId() {
        return yimiaoId;
    }


    /**
	 * 获取：疫苗
	 */

    public void setYimiaoId(Integer yimiaoId) {
        this.yimiaoId = yimiaoId;
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
	 * 设置：报名理由
	 */
    public String getYimiaoYuyueText() {
        return yimiaoYuyueText;
    }


    /**
	 * 获取：报名理由
	 */

    public void setYimiaoYuyueText(String yimiaoYuyueText) {
        this.yimiaoYuyueText = yimiaoYuyueText;
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
	 * 设置：报名状态
	 */
    public Integer getYimiaoYuyueYesnoTypes() {
        return yimiaoYuyueYesnoTypes;
    }


    /**
	 * 获取：报名状态
	 */

    public void setYimiaoYuyueYesnoTypes(Integer yimiaoYuyueYesnoTypes) {
        this.yimiaoYuyueYesnoTypes = yimiaoYuyueYesnoTypes;
    }
    /**
	 * 设置：审核回复
	 */
    public String getYimiaoYuyueYesnoText() {
        return yimiaoYuyueYesnoText;
    }


    /**
	 * 获取：审核回复
	 */

    public void setYimiaoYuyueYesnoText(String yimiaoYuyueYesnoText) {
        this.yimiaoYuyueYesnoText = yimiaoYuyueYesnoText;
    }
    /**
	 * 设置：审核时间
	 */
    public Date getYimiaoYuyueShenheTime() {
        return yimiaoYuyueShenheTime;
    }


    /**
	 * 获取：审核时间
	 */

    public void setYimiaoYuyueShenheTime(Date yimiaoYuyueShenheTime) {
        this.yimiaoYuyueShenheTime = yimiaoYuyueShenheTime;
    }
    /**
	 * 设置：预约时间
	 */
    public Date getYimiaoYuyueTime() {
        return yimiaoYuyueTime;
    }


    /**
	 * 获取：预约时间
	 */

    public void setYimiaoYuyueTime(Date yimiaoYuyueTime) {
        this.yimiaoYuyueTime = yimiaoYuyueTime;
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
