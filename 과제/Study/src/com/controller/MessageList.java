package com.controller;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "message-list")
public class MessageList {
	
	@XmlElement(name= "message")
	private List<Message> messages;
	
	public MessageList(){	
	}
	
	public MessageList(List<Message> messages) {
		this.messages = messages;
	}
	
	public List<Message> getMessages() {
		return messages;
	}
	
	
	
	
	

	
	
}
