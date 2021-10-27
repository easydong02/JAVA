package com.koreait.use;


import com.koreait.member.Smith;
import com.koreait.animal.Dog;

class UseSmith{
	public static void main(String[] args){
	
	Smith s = new Smith();//인스턴스 생성
	s.setSal(6000);
	System.out.println("스미스의 급여는" + s.getSal());

	//스미스가 보유한 love()메서드를 호출하여 실행해보자!
	Dog d =new Dog();
	d.setName("뽀미");
	s.love(d);
	}


}