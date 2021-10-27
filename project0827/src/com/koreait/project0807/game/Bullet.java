package com.koreait.project0807.game;

import java.awt.Graphics;
import java.awt.Image;

//총알을 정의한다
public class Bullet extends GameComponents{

	public Bullet(int x, int y, int width, int height, int velX, int velY, Image img) {
		super(x, y, width, height, velX, velY, img);
	}

	@Override
	public void tick() {
		this.x +=this.velX;
		this.y +=this.velY;
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(img, x, y, width, height,null);
	}

}
