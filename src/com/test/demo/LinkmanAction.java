package com.test.demo;

import com.opensymphony.xwork2.ActionSupport;

public class LinkmanAction extends ActionSupport {

	public String save(){
		System.out.println("������ϵ��...");
		return "saveOK";
	}
	
	public String delete(){
		System.out.println("ɾ����ϵ��...");
		return "delOK";
	}
}
