package com.weishop.pojo.enums;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IEnum;
import com.fasterxml.jackson.annotation.JsonValue;

public enum BusType implements IEnum {
	PRODUCT("1"),
	USER_PHOTO("2");
	
	private String type;

	private BusType(String type) {
		this.type = type;
	}
	
	@JsonValue
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public Serializable getValue() {
		return this.type;
	}
}
