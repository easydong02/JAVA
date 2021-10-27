package com.koreait.member;

import com.koreait.animal.Dog;

public class Smith{
	String name= "스미스";
	public int sal = 800;

	/**
	이 메서드는 불쌍한 우리 스미스의 급여를 변경하기 위함임

	**/
	public void setSal(int sal){
		this.sal = sal;
	}
	
	public int getSal(){
		return sal;
	}

	//Dog 도 자료형이므로, 당연히 매개변수로 가능.
	public void love(Dog d){
		System.out.println("내 강아지 이름은 : " + d.getName());
	}

	
	
}