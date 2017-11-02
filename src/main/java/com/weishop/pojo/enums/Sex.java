package com.weishop.pojo.enums;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IEnum;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Sex implements IEnum {
	MAN("1","男"),
	WOMEN("0","女");
	
	private String code;
	private String name;
	
	private Sex(String code,String name) {
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@JsonValue
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Serializable getValue() {
		return this.code;
	}
}
