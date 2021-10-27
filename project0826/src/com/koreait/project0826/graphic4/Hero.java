package com.koreait.project0826.graphic4;

import java.awt.Graphics;
import java.awt.Image;

//객체로 존재해야, 제어할 수 있으므로 주인공을 표현한 클래스를 정의한다.
public class Hero {
	Image hero_img;//주인공 우주선 이미지
	int x;
	int y;
	
	public Hero(Image hero_img,int x,int y) {
		this.hero_img= hero_img;
		this.x = x;
		this.y =y;
	
	}
	//물리적 변화를 줄 수 있는 메서드(x,y축의 값을 변경하는 메서드...)
	public void tick() {
		
	}
	
	public void render(Graphics g) {//물리적 변화를 준, 대상객체를 화면에 그리는 메서드
		//우주선 올려놓기!!
		g.drawImage(hero_img, x, y, 120, 75, null);
	}
}
