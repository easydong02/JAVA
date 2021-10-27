package com.koreait.project0826.graphic4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements KeyListener{
	public static final int WIDTH=1280;
	public static final int HEIGHT=640;
	Toolkit kit = Toolkit.getDefaultToolkit();
	Image bg_img;//게임 배경 이미지
	Image hero_img;
	Hero hero;
	Image[] enemy_image=new Image[5];
	Enemy[] enemy = new Enemy[5];
	
	public GamePanel() {
		this.setPreferredSize(new Dimension(WIDTH,HEIGHT));//너비와 높이 지정
		bg_img= kit.getImage("D:\\bigData\\workspaceOfJava2\\project0826\\img\\shooting\\bg.jpg");
		hero_img= kit.getImage("D:\\bigData\\workspaceOfJava2\\project0826\\img\\shooting\\plane.png");
		enemy_image[0]=kit.getImage("D:\\bigData\\workspaceOfJava2\\project0826\\img\\shooting\\e1.png");
		enemy_image[1]=kit.getImage("D:\\bigData\\workspaceOfJava2\\project0826\\img\\shooting\\e2.png");
		enemy_image[2]=kit.getImage("D:\\bigData\\workspaceOfJava2\\project0826\\img\\shooting\\e3.png");
		enemy_image[3]=kit.getImage("D:\\bigData\\workspaceOfJava2\\project0826\\img\\shooting\\e4.png");
		enemy_image[4]=kit.getImage("D:\\bigData\\workspaceOfJava2\\project0826\\img\\shooting\\e5.png");
		
		//주인공 생성
		hero= new Hero(hero_img,100,150);
		
		//적군 생성
		enemy[0]= new Enemy(enemy_image[0],WIDTH-100,100);
		enemy[1]= new Enemy(enemy_image[1],WIDTH-100,200);
		enemy[2]= new Enemy(enemy_image[2],WIDTH-100,300);
		enemy[3]= new Enemy(enemy_image[3],WIDTH-100,400);
		enemy[4]= new Enemy(enemy_image[4],WIDTH-100,500);
		
		//리스너와 연결
		addKeyListener(this);
		
		//프로그램 가동과 동시에 포커스가 프레임에 활성화되어 있기에, 현재 패널로 포커스를 이동시키자!
		this.setFocusable(true);
	
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawImage(bg_img, 0, 0, WIDTH, HEIGHT, this);
		hero.render(g);
		for (int i = 0; i < enemy.length; i++) {
			enemy[i].render(g);
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==e.VK_RIGHT) {
			hero.x +=10;//10누적
		}
		else if(e.getKeyCode()==e.VK_LEFT) {
			hero.x -=10;//10누적
		}
		else if(e.getKeyCode()==e.VK_UP) {
			hero.y -=10;//10누적
		}
		else if(e.getKeyCode()==e.VK_DOWN) {
			hero.y +=10;//10누적
		}
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {;}

	@Override
	public void keyTyped(KeyEvent e) {;}
	
	
}
