package com.koreait.use;


import com.koreait.member.Smith;
import com.koreait.animal.Dog;

class UseSmith{
	public static void main(String[] args){
	
	Smith s = new Smith();//�ν��Ͻ� ����
	s.setSal(6000);
	System.out.println("���̽��� �޿���" + s.getSal());

	//���̽��� ������ love()�޼��带 ȣ���Ͽ� �����غ���!
	Dog d =new Dog();
	d.setName("�ǹ�");
	s.love(d);
	}


}