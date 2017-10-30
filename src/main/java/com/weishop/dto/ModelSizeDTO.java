package com.weishop.dto;

import java.io.Serializable;
import java.util.List;

public class ModelSizeDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<String> model;
	private List<String> size;
	public List<String> getModel() {
		return model;
	}
	public void setModel(List<String> model) {
		this.model = model;
	}
	public List<String> getSize() {
		return size;
	}
	public void setSize(List<String> size) {
		this.size = size;
	}
}
