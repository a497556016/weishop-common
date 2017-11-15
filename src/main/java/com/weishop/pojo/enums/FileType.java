package com.weishop.pojo.enums;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IEnum;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 0：其他、1：图片、2：word、3：excel、4：压缩包
 * HeShaowei create at 2017年10月30日
 *
 */
public enum FileType implements IEnum {
	OTHER("0"),
	IMAGE("1"),
	WORD("1"),
	EXCEL("1"),
	ZIP("1");
	
	private String type;
	
	private FileType(String type) {
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
		// TODO Auto-generated method stub
		return this.type;
	}
}
