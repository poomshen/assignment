package com.controller;

import java.util.List;

public class JsonMessageList {


	private List<Message> messages;

	public JsonMessageList(List<Message> messages) {
		this.messages = messages;
	}

	public List<Message> getMessages() {
		return messages;
	}

}
