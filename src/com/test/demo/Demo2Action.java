package com.test.demo;

import com.opensymphony.xwork2.Action;

/**
 * ʵ��Action �ӿ�
 * @author qiang
 *
 */
public class Demo2Action implements Action {

	@Override
	public String execute() throws Exception {
		
		System.out.println("ʵ��Action�ӿڵķ�ʽ");
		return SUCCESS;
	}

}
