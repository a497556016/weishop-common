package com.weishop.pojo;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import com.weishop.pojo.enums.Sex;

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
 * @since 2017-11-02
 */
@TableName("base_ship_address")
public class ShipAddress extends Model<ShipAddress> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	@TableField("user_id")
	private Integer userId;
	private String address;
	@TableField("contact_number")
	private String contactNumber;
	@TableField("contact_user_name")
	private String contactUserName;
	private Sex sex;
    /**
     * 国家
     */
	private String country;
    /**
     * 省份
     */
	private String province;
    /**
     * 城市
     */
	private String city;
    /**
     * 街道
     */
	private String street;
    /**
     * 社区
     */
	private String community;
    /**
     * 楼栋门牌号
     */
	@TableField("building_floor")
	private String buildingFloor;
    /**
     * 是否默认项
     */
	@TableField("is_default")
	private boolean isDefault;
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

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getContactUserName() {
		return contactUserName;
	}

	public void setContactUserName(String contactUserName) {
		this.contactUserName = contactUserName;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCommunity() {
		return community;
	}

	public void setCommunity(String community) {
		this.community = community;
	}

	public String getBuildingFloor() {
		return buildingFloor;
	}

	public void setBuildingFloor(String buildingFloor) {
		this.buildingFloor = buildingFloor;
	}

	public boolean isDefault() {
		return isDefault;
	}

	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
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

	public static final String USER_ID = "user_id";

	public static final String ADDRESS = "address";

	public static final String CONTACT_NUMBER = "contact_number";

	public static final String CONTACT_USER_NAME = "contact_user_name";

	public static final String SEX = "sex";

	public static final String COUNTRY = "country";

	public static final String PROVINCE = "province";

	public static final String CITY = "city";

	public static final String STREET = "street";

	public static final String COMMUNITY = "community";

	public static final String BUILDING_FLOOR = "building_floor";

	public static final String IS_DEFAULT = "is_default";

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
		return "ShipAddress{" +
			"id=" + id +
			", userId=" + userId +
			", address=" + address +
			", contactNumber=" + contactNumber +
			", contactUserName=" + contactUserName +
			", sex=" + sex +
			", country=" + country +
			", province=" + province +
			", city=" + city +
			", street=" + street +
			", community=" + community +
			", buildingFloor=" + buildingFloor +
			", isDefault=" + isDefault +
			", deleteFlag=" + deleteFlag +
			", createTime=" + createTime +
			", createBy=" + createBy +
			", modifyTime=" + modifyTime +
			", modifyBy=" + modifyBy +
			"}";
	}
}
