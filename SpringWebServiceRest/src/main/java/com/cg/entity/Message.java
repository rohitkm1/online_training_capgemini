package com.cg.entity;

import java.util.Date;

public class Message {

	public String msg;
	public Date date;
	
	public Message(String msg) {
		super();
		this.msg = msg;
		this.date = new Date();
	}

	public Message(Date date) {
		super();
		this.date = date;
	}

	public Message(String msg, Date date) {
		super();
		this.msg = msg;
		this.date = date;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
