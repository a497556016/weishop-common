package com.weishop.base;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.toolkit.StringUtils;
import com.google.common.collect.Maps;
import com.weishop.global.ResponseCode;

public abstract class BaseController<S extends ServiceImpl<? extends BaseMapper<E>,E>,E> {
	@Autowired
	protected S baseService;
	
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
	 * @param columnKey 是否将参数名称转换成下划线形式
	 * @return
	 */
	protected HashMap<String, Object> getRequestMapSingle(Boolean columnKey) {
		HashMap<String, Object> conditions = Maps.newHashMap();
		Map<String, String[]> map = request.getParameterMap();
		for (Object o : map.keySet()) {
			String key = (String) o;
			Object value = map.get(key)[0];
			if(columnKey) {
				key = StringUtils.camelToUnderline(key);//驼峰转下划线
			}
			conditions.put(key, value);
		}
		return conditions;
	}
	
	/**
	 * 获取请求属性封装为Map类型
	 * 
	 * HeShaowei create at 2017年11月1日
	 * @return
	 */
	protected HashMap<String, Object> getRequestMapSingle(){
		return this.getRequestMapSingle(false);
	}
	
	/**
	 * 将请求参数转换成EntityWrapper
	 * 
	 * HeShaowei create at 2017年11月1日
	 * @return
	 */
	protected EntityWrapper<E> getRequestMapToWrapper(){
		EntityWrapper<E> wrapper = new EntityWrapper<>(); 
		Map<String, Object> params = this.getRequestMapSingle(true);
		Set<String> keys = params.keySet();
		for (String key : keys) {
			wrapper.eq(key, params.get(key));
		}
		return wrapper;
	}
	
	/**
	 * 基本的分页查询，返回mybatis-plus的Page类型
	 * 
	 * HeShaowei create at 2017年11月1日
	 * @param page
	 * @return
	 */
	@RequestMapping("/selectPage")
	@ResponseBody
	protected Page<E> selectPage(Page<E> page) {
		this.baseService.selectPage(page);
		return page;
	}
	
	/**
	 * 分页查询，返回PageResponse类型
	 * 
	 * HeShaowei create at 2017年11月1日
	 * @param page
	 * @return
	 */
	@RequestMapping("/selectMyPage")
	@ResponseBody
	protected PageResponse<E> selectMyPage(Page<E> page) {
		this.baseService.selectPage(page);
		PageResponse<E> pageResponse = new PageResponse<>();
		pageResponse.setCode(ResponseCode.SUCCESS.getCode());
		pageResponse.setPageNo(page.getCurrent());
		pageResponse.setPageSize(page.getSize());
		pageResponse.setTotal(page.getTotal());
		pageResponse.setRows(page.getRecords());
		return pageResponse;
	}
	
	/**
	 * 根据条件查询所有列表返回
	 * 
	 * HeShaowei create at 2017年11月1日
	 * @return
	 */
	@RequestMapping("/selectList")
	@ResponseBody
	protected BaseResponse<List<E>> selectList() {
		List<E> list = this.baseService.selectByMap(this.getRequestMapSingle(true));
		return BaseResponse.result(list);
	} 
	
	/**
	 * 根据条件查询一个结果
	 * 
	 * HeShaowei create at 2017年11月1日
	 * @return
	 */
	@RequestMapping("/selectOne")
	@ResponseBody
	protected BaseResponse<E> selectOne() {
		E object = this.baseService.selectOne(this.getRequestMapToWrapper());
		return BaseResponse.result(object);
	}
	
}
