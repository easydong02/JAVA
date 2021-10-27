package com.koreait.project0807.game;

import java.awt.Graphics;
import java.awt.Image;

public class Enemy extends GameComponents{

	public Enemy(int x, int y, int width, int height, int velX, int velY, Image img) {
		super(x, y, width, height, velX, velY, img);
	}

	@Override
	public void tick() {
		this.x +=this.velX;
		this.y +=this.velY;
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(img, x, y, width, height, null);
	}

}
