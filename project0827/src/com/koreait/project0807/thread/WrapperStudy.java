package com.koreait.project0807.thread;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 * 자바의 모든 기본자료형은 각각 1:1대응되는 Wrapper 클래스가 지원된다..
 * ex) int --> Integer, byte -->Byte, short -->Short
 * long --> Long, float -->Float,doutble-->Double
 * 개발하다보면, 기본자료형을 형변환할 일이 생긴다..
 * */
public class WrapperStudy {
	
	public static void main(String[] args) {
		/*컬렉션? : 객체를 모아서 처리하는 데 유용한 라이브러리,java util 패키지 지원
		 * 순서없는거 : Set, 순서 있는거 List, key-value Map: 공통점 오직 객체만 대상으로
		 * 
		 * 
		 * */
		//기본 자료형을 객체자료형으로 사용할 때..wrapper클래스를 이용
		List list = new ArrayList();
		int x= 1;//기본 자료형이다!! <-->객체자료형으로 자동 형변환 해줌 이때 사용된 객체가 바로 Wrapper
		
		list.add(x);//Boxing 내부적으로 발생..
		
		// 문자열 "1" -->정수형으로 변환하고자 할때
		
		String k ="5";//정수랑 상관없다..
		int y=7;
		int result = y+Integer.parseInt(k);
	}



	
}
