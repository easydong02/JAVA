package com.koreait.vehicle;


public class Car{
	int price=500;//price�� �⺻�ڷ����̹Ƿ�, �� �繰�� �ƴϹǷ� has a ���� �ƴ�
	Wheel w;//has a
	Engine e;//has a

	//�������� ����? ��ü�� �ν��Ͻ��� ������ �� �ʱ�ȭ�� ���!!
	//���� ���� Car��� Ŭ������ ��ǰ�� ������ �ִٸ�, ���� �¾��

	public Car(){
	w= new Wheel();
	e= new Engine();
	}
	
}