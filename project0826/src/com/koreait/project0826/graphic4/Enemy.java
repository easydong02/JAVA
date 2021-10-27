package com.koreait.project0826.graphic4;

import java.awt.Graphics;
import java.awt.Image;

//적군을 정의한다!!
public class Enemy {
	Image enemy_img;//주인공 우주선 이미지
	int x;
	int y;
	
	public Enemy(Image enemy_img,int x,int y) {
		this.enemy_img= enemy_img;
		this.x = x;
		this.y =y;	
	
	}
	//적군의 물리량 변화를 줄 메서드
	public void tick() {
		
	}
	
	//화면에 그려질 메서드
	public void render(Graphics g) {
		g.drawImage(enemy_img,x, y, 120, 75, null);
	}
}
