package com.test.demo;

/**
 * struts2框架使用Action类来处理用户请求
 * @author qiang
 *
 */
public class HelloAction {

	/**
	 * Action类中方法签名有要求
	 * 1.必须为public
	 * 2.必须有返回值，且必须为String 
	 * 3.不能有任何参
	 * 4.在struts.xml中配置<name>标签
	 * 跳转：
	 * 1.return 字符串
	 * 2.需要在struts.xml中配置<restult>标签
	 * @return
	 */
	public String sayHello(){
		
		System.out.println("Hello struts2!!!");
		return "ok";
	}
}
