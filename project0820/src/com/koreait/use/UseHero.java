package com.koreait.use;


import com.koreait.hero.Hero;
import com.koreait.bullet.Bullet;

class UseHero{
	public static void main(String[] args){
		Bullet b = new Bullet();
		Hero hero = new Hero();
		hero.setName("배트맨");
		hero.setHp(100);
		hero.setFly(true);
		System.out.println("히어로 이름: " +hero.getName()); 
		System.out.println("히어로 체력: " +hero.getHp());
		System.out.println("나 날고있나? : " +hero.getFly());
		
		b.setWeapon("텀블러");
		hero.fire(b);	
	}
}