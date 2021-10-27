package com.koreait.project0807.game;

import java.lang.reflect.Method;

public class Test {

	public void getName() {
		
	}
	public void getAge() {
		
	}
	
	public Test() {
		//현재 클래스에 대한 정보를 추출해보자!
		Class myClass = this.getClass(); //Text 클래스 반환
		Method[] method =myClass.getMethods();//Text클래스의 보유 메서드
		System.out.println(method.length);
		
		for(Method obj : method) {
			System.out.println(obj.getName());
		}
		
	}
	
	
	public static void main(String[] args) {
		new Test();
	}

}
