package com.test.demo;

import com.opensymphony.xwork2.ActionSupport;

/**
 * �̳�ActionSupport�ࡣ���Ѿ��̳���Action��
 * @author qiang
 *
 */
public class Demo3Action extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7328559526792495242L;


	
	@Override
	public String execute() throws Exception {
		
		System.out.println("Demo3Action�̳���ActionSupport��...");
		return NONE;
	}
}
