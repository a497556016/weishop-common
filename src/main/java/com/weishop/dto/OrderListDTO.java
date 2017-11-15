package com.weishop.dto;

import com.weishop.pojo.OrderList;

public class OrderListDTO extends OrderList {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 产品的图片地址
	 */
	private String proPicUrl;

	public String getProPicUrl() {
		return proPicUrl;
	}

	public void setProPicUrl(String proPicUrl) {
		this.proPicUrl = proPicUrl;
	}

	@Override
	public String toString() {
		return "OrderListDTO [proPicUrl=" + proPicUrl + "]";
	}
}
