package com.test.demo;

import com.opensymphony.xwork2.ActionSupport;

public class LinkmanAction extends ActionSupport {

	public String save(){
		System.out.println("保存联系人...");
		return "saveOK";
	}
	
	public String delete(){
		System.out.println("删除联系人...");
		return "delOK";
	}
}
