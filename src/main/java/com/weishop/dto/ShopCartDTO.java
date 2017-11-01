package com.weishop.dto;

import java.math.BigDecimal;


public class ShopCartDTO {
	private Integer id;
	/**
     * 用户ID
     */
	private Integer userId;
    /**
     * 商品ID
     */
	private Integer proItemId;
	/**
     * 名称
     */
	private String name;
    /**
     * 编码
     */
	private String code;
	/**
     * 型号
     */
	private String model;
    /**
     * 尺寸
     */
	private String size;
    /**
     * 描述
     */
	private String description;
    /**
     * 单位
     */
	private String unit;
	/**
     * 折扣
     */
	private BigDecimal discount;
    /**
     * 数量
     */
	private Integer count;
    /**
     * 单价
     */
	private BigDecimal price;
	/**
	 * 商品图片
	 */
	private String picUrl;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public BigDecimal getDiscount() {
		return discount;
	}
	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
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
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
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
}
