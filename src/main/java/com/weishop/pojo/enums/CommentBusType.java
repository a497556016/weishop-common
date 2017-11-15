package com.weishop.pojo.enums;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IEnum;
import com.fasterxml.jackson.annotation.JsonValue;

public enum CommentBusType implements IEnum {
	COM_BUS_ORDER_LIST(1,"订单项");
	
	private Integer type;
	private String desc;
	
	private CommentBusType(Integer type,String desc){
		this.type = type;
		this.desc = desc;
	}

	@JsonValue
	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public Serializable getValue() {
		return this.type;
	}
	
}
