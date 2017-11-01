package com.weishop.global;

public enum ResponseCode {
	SUCCESS(1,"执行成功！"),
	ERROR(0,"执行异常！"),
	PARAM_NOT_VALID(2,"参数验证失败！");
	
	private Integer code;
	private String msg;
	
	private ResponseCode(Integer code,String msg) {
		this.code = code;
		this.msg = msg;
	}

	public Integer getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}
	
	
}
