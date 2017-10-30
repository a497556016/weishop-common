package com.weishop.base;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.ModelAttribute;

import com.google.common.collect.Maps;

public abstract class BaseController {
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected HttpSession session;

	@ModelAttribute
	public void setReqAndRes(HttpServletRequest request, HttpServletResponse response) {
		this.request = request;
		this.response = response;
		this.session = request.getSession();
	}

	/**
	 * 获取请求属性封装为Map类型
	 * 
	 * @param request
	 * @return
	 */
	protected HashMap<String, Object> getRequestMapSingle() {
		HashMap<String, Object> conditions = Maps.newHashMap();
		Map<String, String[]> map = request.getParameterMap();
		for (Object o : map.keySet()) {
			String key = (String) o;
			conditions.put(key, map.get(key)[0]);
		}
		return conditions;
	}
}
