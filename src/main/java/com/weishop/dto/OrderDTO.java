package com.weishop.dto;

import java.util.List;

import com.weishop.pojo.Order;
import com.weishop.pojo.OrderList;

public class OrderDTO {
	private Order order;
	private List<OrderListDTO> orderList;
	private List<Integer> delShopCartIds;
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public List<OrderListDTO> getOrderList() {
		return orderList;
	}
	public void setOrderList(List<OrderListDTO> orderList) {
		this.orderList = orderList;
	}
	public List<Integer> getDelShopCartIds() {
		return delShopCartIds;
	}
	public void setDelShopCartIds(List<Integer> delShopCartIds) {
		this.delShopCartIds = delShopCartIds;
	}
	@Override
	public String toString() {
		return "OrderDTO [order=" + order + ", orderList=" + orderList + ", delShopCartIds=" + delShopCartIds + "]";
	}
}
