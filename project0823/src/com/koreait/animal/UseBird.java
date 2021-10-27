package com.koreait.animal;

public class Bird2{
	String name="난 새";
	public void fly(){
	System.out.println("새가 날아요.");
	}



}


public class Duck{

	String name="난 오리";
	public void fly(){
	System.out.println("오리가 날아요.");
	}
}


class UseBird{
	public static void main(String[] args){
	Bird2 b = new Duck();
	
	System.out.println(b.name); //난새
	System.out.println(b.fly());//오리가 날아요
	//오버라이딩은 메서드만!
	
	}


}