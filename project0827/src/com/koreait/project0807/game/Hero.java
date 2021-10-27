package com.koreait.project0807.game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

//주인공을 정의한다
public class Hero extends GameComponents {
//	Rectangle r;
	
	public Hero(int x, int y, int width, int height, int velX, int velY, Image img) {
		super(x,y,width,height,velX,velY,img);

//		r.intersects(r);
	}

	//부모꺼를 나한테 맞게 최적화 시켜야함, 즉 오버라이딩 하자!
	public void tick() {
		this.x += this.velX;
		this.y += this.velY;
	}
	
	public void render(Graphics g) {
		g.drawImage(img, x, y, width,height , null);
	}
}
