package com.test.demo;

import com.opensymphony.xwork2.Action;

/**
 * 实现Action 接口
 * @author qiang
 *
 */
public class Demo2Action implements Action {

	@Override
	public String execute() throws Exception {
		
		System.out.println("实现Action接口的方式");
		return SUCCESS;
	}

}
