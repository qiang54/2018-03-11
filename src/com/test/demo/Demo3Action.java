package com.test.demo;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 继承ActionSupport类。其已经继承了Action类
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
		
		System.out.println("Demo3Action继承了ActionSupport类...");
		return NONE;
	}
}
