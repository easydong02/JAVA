package com.koreait.hero;

import com.koreait.bullet.Bullet;

public class Hero {
	int hp=10;
	boolean fly=false;
	String name="�ް���";
	
	public void setHp(int hp) { //hp ���� �����ϰ� �ʹ�  
		this.hp=hp;
	}
	public int getHp() { //hp ���� �����ϰ� �ʹ�  
		return hp;
	}
	public void setFly(boolean fly) {//fly ���� �����ϰ� �ʹ�
               this.fly = fly;
	}
	public boolean getFly() {//fly ���� �����ϰ� �ʹ�
               return fly;
	}
	public void setName(String name) {//name ���� �����ϰ� �ʹ�		
             this.name= name;
	}
	public String getName() {//name ���� �����ϰ� �ʹ�		
             return name;
	}
	public void fire(Bullet b){//bullet �� �ٸ� ����� �����ϰ� �ʹ�
             System.out.println("���� ����ϴ� ����� : " + b.getWeapon());
	}
}