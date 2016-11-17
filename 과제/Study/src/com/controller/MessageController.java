package com.controller;


import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;




@Controller
public class MessageController {

	
	@RequestMapping("/index.htm")
	public String index(){
		
	System.out.println("index!!!!!!!!");
		//이전
		//return "index.jsp";
		//Tiles 적용
		return "emp.XmlJson";
	}
	
	@RequestMapping(value="/message/list.xml")
	@ResponseBody
	public MessageList listXml(){
		System.out.println("여기 탄다");
		return getMessageList();
	}

	@RequestMapping(value="/message/list.json")
	@ResponseBody
	public JsonMessageList listJson(){
		System.out.println("json 탄다");
		System.out.println("이상하군 같이 타는 기분이야");
		return getMessageList2();
	}
	
	
	/*@RequestMapping(value = "/message/post.json", method =RequestMethod.POST)
	@ResponseBody
	public JsonMessageList postJson(@RequestBody JsonMessageList jsonMessageList){
		return jsonMessageList;
	}*/
	
	
	private JsonMessageList getMessageList2(){
		List<Message> messages = Arrays.asList(
				new Message(1, "성별", new Date()),
				new Message(2, "이름", new Date()),
				new Message(3, "아이디", new Date())
				);
		return new JsonMessageList(messages);
				
	}
		
	
	
	private MessageList getMessageList(){
		System.out.println("여기 탄다``");
		List<Message> messages = Arrays.asList(
				new Message(1, "메세지", new Date()),
				new Message(2, "메세지2", new Date())
				);
		System.out.println("여기 탄다`^^`");
		return new MessageList(messages);
	}
	
	
	
	
}
