package com.koreait.human;

public class Man{
	//����,����,�������� ��� Ư¡�� ������ ������ Ư¡.
	String color;
	int age;

	//public Man(){;} //�⺻ �����ڸ���� or �ƴϸ� super()�� �����ִ� ������ �Ű����� �����ֱ�

	public Man(int age){
		System.out.println("Man������ ȣ��");
		this.age=age;	
	}

	public void walk(){
		System.out.println("���� �� �ִ�.");
	}
	public void talk(){
		System.out.println("���� �� �ִ�.");
	}
}