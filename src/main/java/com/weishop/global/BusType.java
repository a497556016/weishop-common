package com.weishop.global;

public enum BusType {
	PRODUCT("1");
	
	private String type;

	private BusType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
