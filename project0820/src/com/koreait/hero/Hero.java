package com.koreait.hero;

import com.koreait.bullet.Bullet;

public class Hero {
	int hp=10;
	boolean fly=false;
	String name="메가맨";
	
	public void setHp(int hp) { //hp 값을 변경하고 싶다  
		this.hp=hp;
	}
	public int getHp() { //hp 값을 변경하고 싶다  
		return hp;
	}
	public void setFly(boolean fly) {//fly 값을 변경하고 싶다
               this.fly = fly;
	}
	public boolean getFly() {//fly 값을 변경하고 싶다
               return fly;
	}
	public void setName(String name) {//name 값을 변경하고 싶다		
             this.name= name;
	}
	public String getName() {//name 값을 변경하고 싶다		
             return name;
	}
	public void fire(Bullet b){//bullet 을 다른 무기로 변경하고 싶다
             System.out.println("내가 사용하는 무기는 : " + b.getWeapon());
	}
}