package com.koreait.member;

import com.koreait.animal.Dog;

public class Smith{
	String name= "���̽�";
	public int sal = 800;

	/**
	�� �޼���� �ҽ��� �츮 ���̽��� �޿��� �����ϱ� ������

	**/
	public void setSal(int sal){
		this.sal = sal;
	}
	
	public int getSal(){
		return sal;
	}

	//Dog �� �ڷ����̹Ƿ�, �翬�� �Ű������� ����.
	public void love(Dog d){
		System.out.println("�� ������ �̸��� : " + d.getName());
	}

	
	
}