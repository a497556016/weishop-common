package com.weishop.base;

import java.io.Serializable;
import java.util.List;

import com.baomidou.mybatisplus.plugins.Page;
import com.weishop.global.ResponseCode;

public class PageResponse<T> implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer code;
	private int pageNo;
	private int pageSize;
	private int total;
	private List<T> rows;
	
	@SuppressWarnings("unchecked")
	public static <T> PageResponse<T> result(Object data) {
		PageResponse<T> pageResponse = new PageResponse<>();
		pageResponse.setCode(ResponseCode.SUCCESS.getCode());
		if(data instanceof Page) {
			Page<T> page = (Page<T>) data;
			
			pageResponse.setPageNo(page.getCurrent());
			pageResponse.setPageSize(page.getSize());
			pageResponse.setTotal(page.getTotal());
			pageResponse.setRows(page.getRecords());
		}
		
		return pageResponse;
	}
	
	public static <T> PageResponse<T> error(){
		PageResponse<T> pageResponse = new PageResponse<>();
		pageResponse.setCode(ResponseCode.ERROR.getCode());
		return pageResponse;
	}
	
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}
}
