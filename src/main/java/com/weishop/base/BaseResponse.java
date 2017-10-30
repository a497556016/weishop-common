package com.weishop.base;

import com.weishop.global.ResponseCode;

public class BaseResponse<T> {
	private String msg;
	private Integer code;
	private T data;
	
	public static BaseResponse<?> result() {
		return result(ResponseCode.SUCCESS.getMsg());
	}
	
	public static BaseResponse<?> success(){
		return result(ResponseCode.SUCCESS.getMsg(),ResponseCode.SUCCESS.getCode());
	}
	
	public static BaseResponse<?> result(String msg) {
		return result(msg,ResponseCode.SUCCESS.getCode());
	}
	
	public static BaseResponse<?> result(String msg,Integer code) {
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
	
	public static BaseResponse<?> error(String msg) {
		return error(msg,ResponseCode.ERROR.getCode());
	}
	
	public static BaseResponse<?> error(String msg,Integer code) {
		BaseResponse<?> baseResponse = new BaseResponse<>();
		baseResponse.setCode(code);
		baseResponse.setMsg(msg);
		return baseResponse;
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
