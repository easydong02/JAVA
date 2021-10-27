package com.koreait.project0807.game;

import java.awt.Graphics;
import java.awt.Image;

//이 객체는 게임에 등장하는 모든 ~~~객체들의 최상위 객체이며, 
//보편적인 기능 및 코드를 보유할 예정

public abstract class GameComponents {

	int x;
	int y;
	int width;
	int height;
	int velX;
	int velY;
	Image img;

	public GameComponents(int x, int y, int width, int height, int velX, int velY, Image img) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.velX = velX;
		this.velY = velY;
		this.img = img;
	}

	// 미래를 알 수 없다.. 어떤 자식이 어떤행동을 할지..
	public abstract void tick();

	public abstract void render(Graphics g);

}
