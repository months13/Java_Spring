package com.fastcampus.ch2;

import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) throws Exception{	
	
		Class name = Class.forName("com.fastcampus.ch2.Hello");
		Hello hello = (Hello)name.newInstance(); // ��ü ����
		Method main = name.getDeclaredMethod("main"); // �޼��� ������
		main.setAccessible(true); // private�޼��带 ȣ�Ⱑ���ϰ� ����
		
		main.invoke(hello); // private�޼��� ȣ��
		
		
		
		
	}
}
