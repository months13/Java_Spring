package com.fastcampus.ch2;

import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) throws Exception{	
	
		Class name = Class.forName("com.fastcampus.ch2.Hello");
		Hello hello = (Hello)name.newInstance(); // 객체 생성
		Method main = name.getDeclaredMethod("main"); // 메서드 얻어오기
		main.setAccessible(true); // private메서드를 호출가능하게 만듦
		
		main.invoke(hello); // private메서드 호출
		
		
		
		
	}
}
