package com.weishop.pojo.enums;

public enum Six {
	MAN("1","男"),
	WOMEN("0","女");
	
	private String code;
	private String name;
	
	private Six(String code,String name) {
		this.code = code;
		this.name = name;
	}

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
}
