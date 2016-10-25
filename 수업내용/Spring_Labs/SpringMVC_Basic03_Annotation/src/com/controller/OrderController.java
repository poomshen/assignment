package com.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.OrderCommand;
import com.model.OrderItem;

@Controller
@RequestMapping("/order/order.do")
public class OrderController {
	
	//두개의 함수를 같은 요청주고 처리가능하다
	//화면출력(UI : GET)
	@RequestMapping(method=RequestMethod.GET)
	public String form(){
	
		return "order/OrderForm";
		//  /WEB-INF/view/order/OrderForm.jsp
	}
	
	//로직처리(POST)
	
	/*
	 public String submit(OrderCommand orderCommand) 한줄의 코드가 아래 작업수행
	 [ 
	 	OrderCommand orderCommand = new OrderCommand();
	 	List<OrderItem> list = new ArrayList<OrderItem>();
	 
	 	list.add(new OrderItem(1,10,"A"));
	 	list.add(new OrderItem(2,20,"B"));
	 	list.add(new OrderItem(3,30,"C"));
	 
	 	orderCommand.setOrderItem(list);
	 ]
	 아래 view 가 구성되어 있다면
	 UI :OrderForm.jsp 페이지에서 
	 name="orderItem[0].itemid"
	 name="orderItem[1].itemid"
	 name="orderItem[2].itemid"
	 */
	@RequestMapping(method=RequestMethod.POST)
	public String submit(OrderCommand orderCommand){
		
		System.out.println("orderCommand : " + orderCommand.toString());
		System.out.println("orderCommand : " + orderCommand.getOrderItem().size());
		
		//검증하기
		List<OrderItem>	items = orderCommand.getOrderItem();
		for(OrderItem item : items){
			System.out.println(item.getItemid() + "/" + item.getNumber() + "/" + item.getRemark());
		}
		
		//자동으로 <bean id="orderCommand"  class="com.model.OrderCommand">
		//그럼 View page에서 id 이름을 가지고 출력하면 되죠
		//아래 코드를 보고 view 단 page를 완성하세요
		return "order/OrderCommitted";
	}
}
