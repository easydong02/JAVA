package com.koreait.bank;
//����ȭ = encapsulation(ĸ��ȭ)
public class Account{
	//�����͸� ��ȣ
	private String name="�ŵ���";
	private int balance=5000000000;
	private String num="1002-851-332901";
	

	//�����͸� ���׳� �� �ִ� ���...
	//������ ���� setter, �������� ��ȯ getter
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setBalance(int balance){
		this.balance = balance;
	}
	public int getBalance(){
		return balance;
	}

	public void setNum(String num){
		this.num=num;
	}
	public String getNum(){
		return num;
	}
}