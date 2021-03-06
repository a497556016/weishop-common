package com.weishop.base;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
		
		Enumeration<String> names = request.getParameterNames();
		while(names.hasMoreElements()){
			String name = names.nextElement();
			String value = request.getParameter(name);
			if(columnKey) {
				name = StringUtils.camelToUnderline(name);//驼峰转下划线
			}
			conditions.put(name, value);
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
			if(!org.apache.commons.lang.StringUtils.contains("current,size", key)) {
				wrapper.eq(key, params.get(key));
			}
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
		this.baseService.selectPage(page,this.getRequestMapToWrapper());
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
		this.baseService.selectPage(page,this.getRequestMapToWrapper());
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
	
	@RequestMapping("/save")
	@ResponseBody
	protected BaseResponse<E> save(@RequestBody E record){
		boolean re = this.baseService.insert(record);
		if(re) {
			return BaseResponse.result(record);
		}else {
			return BaseResponse.error();
		}
	}
	
	@RequestMapping(value="/saveList")
	@ResponseBody
	protected BaseResponse<List<E>> saveList(@RequestBody List<E> list){
		boolean re = this.baseService.insertBatch(list);
		if(re) {
			return BaseResponse.result(list);
		}else {
			return BaseResponse.error();
		}
	}
	
	@RequestMapping("/updateById")
	@ResponseBody
	protected BaseResponse<E> updateById(@RequestBody E record){
		boolean re = this.baseService.updateById(record);
		if(re) {
			return BaseResponse.result(record);
		}else {
			return BaseResponse.error();
		}
	}
	
	@RequestMapping(value="/updateListById")
	@ResponseBody
	protected BaseResponse<List<E>> updateListById(@RequestBody List<E> list){
		boolean re = this.baseService.updateBatchById(list);
		if(re) {
			return BaseResponse.result(list);
		}else {
			return BaseResponse.error();
		}
	}
	
	@RequestMapping("/saveOrUpdate")
	@ResponseBody
	protected BaseResponse<E> saveOrUpdate(@RequestBody E record){
		boolean re = this.baseService.insertOrUpdate(record);
		if(re) {
			return BaseResponse.result(record);
		}else {
			return BaseResponse.error();
		}
	}
	
	@RequestMapping("/deleteById")
	@ResponseBody
	protected BaseResponse<E> deleteById(Integer id){
		boolean re = this.baseService.deleteById(id);
		if(re) {
			return BaseResponse.success();
		}else {
			return BaseResponse.error();
		}
	}
	
	@RequestMapping(value="/deleteListById")
	@ResponseBody
	protected BaseResponse<E> deleteListById(@RequestBody List<Integer> idList){
		boolean re = this.baseService.deleteBatchIds(idList);
		if(re) {
			return BaseResponse.success();
		}else {
			return BaseResponse.error();
		}
	}
}
