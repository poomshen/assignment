package com.model;

import java.util.List;

public class OrderCommand {
	private List<OrderItem> orderItem;

	//getter
	public List<OrderItem> getOrderItem() {
		return orderItem;
	}
    //setter
	public void setOrderItem(List<OrderItem> orderItem) {
		this.orderItem = orderItem;
	}

	/*
	 OrderCommand command = new OrderCommand();
	 List<OrderItem> list = new ArrayList<OrderItem>();
	 
	 list.add(new OrderItem(1,10,"신발입니다"));
	 list.add(new OrderItem(2,100,"남성옷"));
	 list.add(new OrderItem(3,4,"냉장고"));
	 
	 command.setOrderItem(list);
	 
	 
	*/
}
