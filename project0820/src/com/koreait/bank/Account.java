package com.koreait.bank;
//은닉화 = encapsulation(캡슐화)
public class Account{
	//데이터를 보호
	private String name="신동희";
	private int balance=5000000000;
	private String num="1002-851-332901";
	

	//데이터를 접그날 수 있는 방법...
	//데이터 변경 setter, 데이터의 반환 getter
	
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