package com.koreait.project0830.stream7;

public class StringStudy {
	//우리가 사람이기에 가장 흔히 사용하는 자료형은 아마 String일것이다
	//따라서 String은 아주 많은 기능을 지원하고 있다..
	//String api document 참조하면서 공부하자!!
	
	
	
	public static void main(String[] args) {
		String s1 ="you are my lover.";
		
		//문자열의 길이 얻기
		System.out.println("문자열의 길이는" + s1.length());
	
		//문자열의 일부(sub)를 추출해보자
		System.out.println(s1.substring(11,16)); //(시작 index, index +추출할 문자수)
		System.out.println(s1.lastIndexOf("l")); //인덱스 번호로 추출
		System.out.println(s1.substring(s1.indexOf("l"),16)); //(시작 index, index +추출할 문자수)
		
		
		//특정 문자가 몇번째의 인덱스에 있는지 조사
	}
}
