package com.test.demo;

/**
 * struts2���ʹ��Action���������û�����
 * @author qiang
 *
 */
public class HelloAction {

	/**
	 * Action���з���ǩ����Ҫ��
	 * 1.����Ϊpublic
	 * 2.�����з���ֵ���ұ���ΪString 
	 * 3.�������κβ�
	 * 4.��struts.xml������<name>��ǩ
	 * ��ת��
	 * 1.return �ַ���
	 * 2.��Ҫ��struts.xml������<restult>��ǩ
	 * @return
	 */
	public String sayHello(){
		
		System.out.println("Hello struts2!!!");
		return "ok";
	}
}
