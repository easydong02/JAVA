package com.koreait.vehicle;

class UseCar{
	public static void main(String[] args){
		Car c = new Car(); // 생성자에 언급하면 여기서 끝
	//c.w = new Wheel(); 생성자에 언급 안 했을때
	//c.e = new Engine();
	System.out.println("이 차의 엔진 명은 : " + c.e.name);
	}

}