package com.weishop.pojo;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import java.math.BigDecimal;
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
 * @since 2017-11-03
 */
@TableName("bus_order_list")
public class OrderList extends Model<OrderList> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	@TableField("order_id")
	private Integer orderId;
	@TableField("pro_item_id")
	private Integer proItemId;
	private String name;
	private String code;
	private String model;
	private String size;
	private String unit;
	private String description;
	private Integer count;
	private BigDecimal price;
	private String discount;
	@TableField("delete_flag")
    @TableLogic
	private String deleteFlag;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getProItemId() {
		return proItemId;
	}

	public void setProItemId(Integer proItemId) {
		this.proItemId = proItemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public static final String ID = "id";

	public static final String ORDER_ID = "order_id";

	public static final String PRO_ITEM_ID = "pro_item_id";

	public static final String NAME = "name";

	public static final String CODE = "code";

	public static final String MODEL = "model";

	public static final String SIZE = "size";

	public static final String UNIT = "unit";

	public static final String DESCRIPTION = "description";

	public static final String COUNT = "count";

	public static final String PRICE = "price";

	public static final String DISCOUNT = "discount";

	public static final String DELETE_FLAG = "delete_flag";

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "OrderList{" +
			"id=" + id +
			", orderId=" + orderId +
			", proItemId=" + proItemId +
			", name=" + name +
			", code=" + code +
			", model=" + model +
			", size=" + size +
			", unit=" + unit +
			", description=" + description +
			", count=" + count +
			", price=" + price +
			", discount=" + discount +
			", deleteFlag=" + deleteFlag +
			"}";
	}
}
