package com.weishop.base;

import com.weishop.global.ResponseCode;

public class BaseResponse<T> {
	private String msg;
	private Integer code;
	private T data;
	
	public static <T> BaseResponse<T> result() {
		return result(ResponseCode.SUCCESS.getMsg());
	}
	
	public static <T> BaseResponse<T> success(){
		return result(ResponseCode.SUCCESS.getMsg(),ResponseCode.SUCCESS.getCode());
	}
	
	public static <T> BaseResponse<T> result(String msg) {
		return result(msg,ResponseCode.SUCCESS.getCode());
	}
	
	public static <T> BaseResponse<T> result(String msg,Integer code) {
		return result(msg,code,null);
	}
	
	public static <T> BaseResponse<T> result(T data) {
		return result(ResponseCode.SUCCESS.getMsg(),ResponseCode.SUCCESS.getCode(),data);
	}
	
	public static <T> BaseResponse<T> result(String msg,T data) {
		return result(msg,ResponseCode.SUCCESS.getCode(),data);
	}
	
	public static <T> BaseResponse<T> result(String msg,Integer code,T data) {
		BaseResponse<T> baseResponse = new BaseResponse<>();
		baseResponse.setCode(code);
		baseResponse.setMsg(msg);
		baseResponse.setData(data);
		return baseResponse;
	}
	
	public static <T> BaseResponse<T> error(String msg) {
		return result(msg,ResponseCode.ERROR.getCode());
	}
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
}
