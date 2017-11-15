package com.weishop.dto;

import com.weishop.pojo.User;

public class UserDTO extends User {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String photoUrl;

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	@Override
	public String toString() {
		return "UserDTO [photoUrl=" + photoUrl + "]";
	}
	
}
