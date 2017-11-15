package com.weishop.pojo.enums;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IEnum;
import com.fasterxml.jackson.annotation.JsonValue;

public enum CommentType implements IEnum {
	MAIN("1","主评价"),
	APPEND("2","追加评价"),
	SELLER("3","商家回复");
	
	private String code;
	private String name;
	
	private CommentType(String code,String name){
		this.code = code;
		this.name = name;
	}
	
	@JsonValue
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}

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
