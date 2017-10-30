package com.weishop.pojo;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.TableLogic;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author HeShaowei
 * @since 2017-10-27
 */
@TableName("sys_user")
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	@TableField("user_account")
	private String userAccount;
	private String password;
	private String salt;
	@TableField("user_name")
	private String userName;
	private String email;
	private String phone;
	@TableField("delete_flag")
    @TableLogic
	private String deleteFlag;
	@TableField("create_time")
	private Date createTime;
	@TableField("create_by")
	private String createBy;
	@TableField("modify_time")
	private Date modifyTime;
	@TableField("modify_by")
	private String modifyBy;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	public static final String ID = "id";

	public static final String USER_ACCOUNT = "user_account";

	public static final String PASSWORD = "password";

	public static final String SALT = "salt";

	public static final String USER_NAME = "user_name";

	public static final String EMAIL = "email";

	public static final String PHONE = "phone";

	public static final String DELETE_FLAG = "delete_flag";

	public static final String CREATE_TIME = "create_time";

	public static final String CREATE_BY = "create_by";

	public static final String MODIFY_TIME = "modify_time";

	public static final String MODIFY_BY = "modify_by";

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "User{" +
			"id=" + id +
			", userAccount=" + userAccount +
			", password=" + password +
			", salt=" + salt +
			", userName=" + userName +
			", email=" + email +
			", phone=" + phone +
			", deleteFlag=" + deleteFlag +
			", createTime=" + createTime +
			", createBy=" + createBy +
			", modifyTime=" + modifyTime +
			", modifyBy=" + modifyBy +
			"}";
	}
}
