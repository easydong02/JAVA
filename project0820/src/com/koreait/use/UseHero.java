package com.koreait.use;


import com.koreait.hero.Hero;
import com.koreait.bullet.Bullet;

class UseHero{
	public static void main(String[] args){
		Bullet b = new Bullet();
		Hero hero = new Hero();
		hero.setName("��Ʈ��");
		hero.setHp(100);
		hero.setFly(true);
		System.out.println("����� �̸�: " +hero.getName()); 
		System.out.println("����� ü��: " +hero.getHp());
		System.out.println("�� �����ֳ�? : " +hero.getFly());
		
		b.setWeapon("�Һ�");
		hero.fire(b);	
	}
}