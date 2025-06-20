package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.YimiaoYuyueEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 疫苗接种
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("yimiao_yuyue")
public class YimiaoYuyueView extends YimiaoYuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 报名状态的值
	*/
	@ColumnInfo(comment="报名状态的字典表值",type="varchar(200)")
	private String yimiaoYuyueYesnoValue;

	//级联表 疫苗
		/**
		* 疫苗名称
		*/

		@ColumnInfo(comment="疫苗名称",type="varchar(200)")
		private String yimiaoName;
		/**
		* 疫苗编号
		*/

		@ColumnInfo(comment="疫苗编号",type="varchar(200)")
		private String yimiaoUuidNumber;
		/**
		* 疫苗照片
		*/

		@ColumnInfo(comment="疫苗照片",type="varchar(200)")
		private String yimiaoPhoto;
		/**
		* 疫苗接种地点
		*/

		@ColumnInfo(comment="疫苗接种地点",type="varchar(200)")
		private String yimiaoAddress;
		/**
		* 疫苗类型
		*/
		@ColumnInfo(comment="疫苗类型",type="int(11)")
		private Integer yimiaoTypes;
			/**
			* 疫苗类型的值
			*/
			@ColumnInfo(comment="疫苗类型的字典表值",type="varchar(200)")
			private String yimiaoValue;
		/**
		* 疫苗介绍
		*/

		@ColumnInfo(comment="疫苗介绍",type="longtext")
		private String yimiaoContent;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer yimiaoDelete;
	//级联表 用户
		/**
		* 用户编号
		*/

		@ColumnInfo(comment="用户编号",type="varchar(200)")
		private String yonghuUuidNumber;
		/**
		* 用户姓名
		*/

		@ColumnInfo(comment="用户姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 用户手机号
		*/

		@ColumnInfo(comment="用户手机号",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 用户身份证号
		*/

		@ColumnInfo(comment="用户身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 用户头像
		*/

		@ColumnInfo(comment="用户头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 用户类型
		*/
		@ColumnInfo(comment="用户类型",type="int(11)")
		private Integer yonghuTypes;
			/**
			* 用户类型的值
			*/
			@ColumnInfo(comment="用户类型的字典表值",type="varchar(200)")
			private String yonghuValue;
		/**
		* 管控状态
		*/
		@ColumnInfo(comment="管控状态",type="int(11)")
		private Integer yonghuGuankongTypes;
			/**
			* 管控状态的值
			*/
			@ColumnInfo(comment="管控状态的字典表值",type="varchar(200)")
			private String yonghuGuankongValue;
		/**
		* 用户邮箱
		*/

		@ColumnInfo(comment="用户邮箱",type="varchar(200)")
		private String yonghuEmail;



	public YimiaoYuyueView() {

	}

	public YimiaoYuyueView(YimiaoYuyueEntity yimiaoYuyueEntity) {
		try {
			BeanUtils.copyProperties(this, yimiaoYuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 报名状态的值
	*/
	public String getYimiaoYuyueYesnoValue() {
		return yimiaoYuyueYesnoValue;
	}
	/**
	* 设置： 报名状态的值
	*/
	public void setYimiaoYuyueYesnoValue(String yimiaoYuyueYesnoValue) {
		this.yimiaoYuyueYesnoValue = yimiaoYuyueYesnoValue;
	}


	//级联表的get和set 疫苗

		/**
		* 获取： 疫苗名称
		*/
		public String getYimiaoName() {
			return yimiaoName;
		}
		/**
		* 设置： 疫苗名称
		*/
		public void setYimiaoName(String yimiaoName) {
			this.yimiaoName = yimiaoName;
		}

		/**
		* 获取： 疫苗编号
		*/
		public String getYimiaoUuidNumber() {
			return yimiaoUuidNumber;
		}
		/**
		* 设置： 疫苗编号
		*/
		public void setYimiaoUuidNumber(String yimiaoUuidNumber) {
			this.yimiaoUuidNumber = yimiaoUuidNumber;
		}

		/**
		* 获取： 疫苗照片
		*/
		public String getYimiaoPhoto() {
			return yimiaoPhoto;
		}
		/**
		* 设置： 疫苗照片
		*/
		public void setYimiaoPhoto(String yimiaoPhoto) {
			this.yimiaoPhoto = yimiaoPhoto;
		}

		/**
		* 获取： 疫苗接种地点
		*/
		public String getYimiaoAddress() {
			return yimiaoAddress;
		}
		/**
		* 设置： 疫苗接种地点
		*/
		public void setYimiaoAddress(String yimiaoAddress) {
			this.yimiaoAddress = yimiaoAddress;
		}
		/**
		* 获取： 疫苗类型
		*/
		public Integer getYimiaoTypes() {
			return yimiaoTypes;
		}
		/**
		* 设置： 疫苗类型
		*/
		public void setYimiaoTypes(Integer yimiaoTypes) {
			this.yimiaoTypes = yimiaoTypes;
		}


			/**
			* 获取： 疫苗类型的值
			*/
			public String getYimiaoValue() {
				return yimiaoValue;
			}
			/**
			* 设置： 疫苗类型的值
			*/
			public void setYimiaoValue(String yimiaoValue) {
				this.yimiaoValue = yimiaoValue;
			}

		/**
		* 获取： 疫苗介绍
		*/
		public String getYimiaoContent() {
			return yimiaoContent;
		}
		/**
		* 设置： 疫苗介绍
		*/
		public void setYimiaoContent(String yimiaoContent) {
			this.yimiaoContent = yimiaoContent;
		}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getYimiaoDelete() {
			return yimiaoDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setYimiaoDelete(Integer yimiaoDelete) {
			this.yimiaoDelete = yimiaoDelete;
		}
	//级联表的get和set 用户

		/**
		* 获取： 用户编号
		*/
		public String getYonghuUuidNumber() {
			return yonghuUuidNumber;
		}
		/**
		* 设置： 用户编号
		*/
		public void setYonghuUuidNumber(String yonghuUuidNumber) {
			this.yonghuUuidNumber = yonghuUuidNumber;
		}

		/**
		* 获取： 用户姓名
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 用户姓名
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 用户手机号
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 用户手机号
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 用户身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 用户身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 用户头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 用户头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}
		/**
		* 获取： 用户类型
		*/
		public Integer getYonghuTypes() {
			return yonghuTypes;
		}
		/**
		* 设置： 用户类型
		*/
		public void setYonghuTypes(Integer yonghuTypes) {
			this.yonghuTypes = yonghuTypes;
		}


			/**
			* 获取： 用户类型的值
			*/
			public String getYonghuValue() {
				return yonghuValue;
			}
			/**
			* 设置： 用户类型的值
			*/
			public void setYonghuValue(String yonghuValue) {
				this.yonghuValue = yonghuValue;
			}
		/**
		* 获取： 管控状态
		*/
		public Integer getYonghuGuankongTypes() {
			return yonghuGuankongTypes;
		}
		/**
		* 设置： 管控状态
		*/
		public void setYonghuGuankongTypes(Integer yonghuGuankongTypes) {
			this.yonghuGuankongTypes = yonghuGuankongTypes;
		}


			/**
			* 获取： 管控状态的值
			*/
			public String getYonghuGuankongValue() {
				return yonghuGuankongValue;
			}
			/**
			* 设置： 管控状态的值
			*/
			public void setYonghuGuankongValue(String yonghuGuankongValue) {
				this.yonghuGuankongValue = yonghuGuankongValue;
			}

		/**
		* 获取： 用户邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 用户邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}


	@Override
	public String toString() {
		return "YimiaoYuyueView{" +
			", yimiaoYuyueYesnoValue=" + yimiaoYuyueYesnoValue +
			", yimiaoName=" + yimiaoName +
			", yimiaoUuidNumber=" + yimiaoUuidNumber +
			", yimiaoPhoto=" + yimiaoPhoto +
			", yimiaoAddress=" + yimiaoAddress +
			", yimiaoContent=" + yimiaoContent +
			", yimiaoDelete=" + yimiaoDelete +
			", yonghuUuidNumber=" + yonghuUuidNumber +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			"} " + super.toString();
	}
}
