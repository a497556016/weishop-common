package com.weishop.utils;

import java.lang.reflect.Field;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.util.ReflectionUtils;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.plugins.Page;
import com.google.common.collect.Lists;
import com.weishop.base.PageResponse;

public class PropertyUtils {
	private static final Logger logger = Logger.getLogger(PropertyUtils.class);

	public static <T> PageResponse<T> convertModelToDTO(Page<? extends Model<?>> page,Class<T> toClz) {
		PageResponse<T> pageResponse = new PageResponse<>();
		if(CollectionUtils.isEmpty(page.getRecords())) {
			return pageResponse;
		}
		List<T> list = convertModelToDTO(page.getRecords(), toClz);
		pageResponse.setPageNo(page.getCurrent());
		pageResponse.setPageSize(page.getSize());
		pageResponse.setTotal(page.getTotal());
		pageResponse.setRows(list);
		return pageResponse;
	}
	
	public static Object convertModelToDTO(Object model,Object dto) {
		Field[] modelFields = model.getClass().getDeclaredFields();
		for (Field modelField : modelFields) {
			String name = modelField.toGenericString();
			if(StringUtils.contains(name, "static")||StringUtils.contains(name, "final")) {
				continue;
			}
			modelField.setAccessible(true);
			Object value = ReflectionUtils.getField(modelField, model);
			Field dtoField = ReflectionUtils.findField(dto.getClass(), modelField.getName(), modelField.getType());
			if(null!=dtoField) {
				dtoField.setAccessible(true);
				ReflectionUtils.setField(dtoField, dto, value);
			}
		}
		return dto;
	}

	public static <T> List<T> convertModelToDTO(List<? extends Model<?>> models, Class<T> toClz) {
		if(CollectionUtils.isEmpty(models)) {
			return Lists.newArrayList();
		}
		List<T> list = Lists.newArrayList();
		for(Object model : models) {
			try {
				T dto = toClz.newInstance();
				convertModelToDTO(model, dto);
				list.add(dto);
			} catch (InstantiationException | IllegalAccessException e) {
				logger.debug("Model转换DTO异常："+e.getMessage());
			}
		}
		return list;
	}
	

}
