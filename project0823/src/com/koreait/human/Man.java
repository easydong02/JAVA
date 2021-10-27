package com.koreait.human;

public class Man{
	//백인,흑인,동양인의 모든 특징을 보유한 보편적 특징.
	String color;
	int age;

	//public Man(){;} //기본 생성자만들기 or 아니면 super()에 원래있는 생성자 매개변수 맞춰주기

	public Man(int age){
		System.out.println("Man생성자 호출");
		this.age=age;	
	}

	public void walk(){
		System.out.println("걸을 수 있다.");
	}
	public void talk(){
		System.out.println("말할 수 있다.");
	}
}