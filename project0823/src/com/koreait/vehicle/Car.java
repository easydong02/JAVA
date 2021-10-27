package com.koreait.vehicle;


public class Car{
	int price=500;//price는 기본자료형이므로, 즉 사물이 아니므로 has a 관계 아님
	Wheel w;//has a
	Engine e;//has a

	//생성자의 목적? 객체의 인스턴스가 생성될 때 초기화를 담당!!
	//따라서 현재 Car라는 클래스가 부품을 가지고 있다면, 같이 태어나자

	public Car(){
	w= new Wheel();
	e= new Engine();
	}
	
}