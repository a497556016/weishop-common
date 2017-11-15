package com.weishop.dto;

import com.weishop.pojo.Comment;
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
	
	/**
	 * 评价
	 */
	private Comment comment;

	public String getProPicUrl() {
		return proPicUrl;
	}

	public void setProPicUrl(String proPicUrl) {
		this.proPicUrl = proPicUrl;
	}

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "OrderListDTO [proPicUrl=" + proPicUrl + ", comment=" + comment + "]";
	}
}
