package com.koreait.animal;

public class Bird2{
	String name="�� ��";
	public void fly(){
	System.out.println("���� ���ƿ�.");
	}



}


public class Duck{

	String name="�� ����";
	public void fly(){
	System.out.println("������ ���ƿ�.");
	}
}


class UseBird{
	public static void main(String[] args){
	Bird2 b = new Duck();
	
	System.out.println(b.name); //����
	System.out.println(b.fly());//������ ���ƿ�
	//�������̵��� �޼��常!
	
	}


}