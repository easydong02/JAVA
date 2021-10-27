package com.koreait.project0807.game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GamePanel extends JPanel {
	public static final int WIDTH = 1280;
	public static final int HEIGHT = 640;
	Thread gameThread;// 게임 운영요 쓰레드 정의
	boolean check = true;
	GameBg[] gameBg = new GameBg[2];
	Hero hero ;
	Enemy[] enemy = new Enemy[5];
	Bullet bullet;
	ArrayList<Bullet> bulletArray= new ArrayList<Bullet>();
	
	
	public GamePanel() {
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setFocusable(true);
		
		createBg();//배경생성
		createHero();//주인공생성
		createEnemy();//적군생성
		
		gameThread = new Thread() {
			@Override
			public void run() {
				while (true) {
					if (check) {
						gameLoop();
					}
					try {
						Thread.sleep(10);// 게임의 속도 조절 FPS 개념
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		gameThread.start();
		//패널과 리스너와의 연결 : 어댑터라는 리스너..
		this.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				int key=e.getKeyCode();
				
				switch(key) {
					
				case KeyEvent.VK_LEFT :{hero.velX=-5;break;}
				case KeyEvent.VK_RIGHT :{hero.velX=5;break;}
				case KeyEvent.VK_UP:{hero.velY=-5;break;}
				case KeyEvent.VK_DOWN :{hero.velY=5;break;}
				case KeyEvent.VK_SPACE :{createBullet();break;}
				
				
				}
			}
			public void keyReleased(KeyEvent e) {
				int key=e.getKeyCode();
				
				switch(key) {
					
				case KeyEvent.VK_LEFT :{hero.velX=0;break;}
				case KeyEvent.VK_RIGHT :{hero.velX=0;break;}
				case KeyEvent.VK_UP:{hero.velY=0;break;}
				case KeyEvent.VK_DOWN :{hero.velY=0;break;}
				
				
				}
			}
		});
	}
	
	
	

	// 배경을 생성
	public void createBg() {
//		Class myClass=this.getClass();

		URL url = this.getClass().getClassLoader().getResource("game_bg.jpg");
		try {// 에러가 날 가능성이 있는 코드..
			BufferedImage buffImg= ImageIO.read(url);
			gameBg[0] = new GameBg(0, 0, 1280, 640, -1, 0, buffImg);
			gameBg[1] = new GameBg(1280, 0, 1281, 640, -1, 0, buffImg);
		} catch (IOException e) {// 혹여나 에러가 나면 비정상적으로 종료하지말고, catch문영역을 수행해..
			e.printStackTrace();
		}


	}
	
	//주인공을 생성
	public void createHero() {
		URL url = this.getClass().getClassLoader().getResource("plane.png");
		try {
			BufferedImage buffImg= ImageIO.read(url);
			hero =new Hero(100,200,120,75,0,0,buffImg);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	//적군을 생성
	public void createEnemy() {
		String[] imgName = {"e1.png","e2.png","e3.png","e4.png","e5.png"};
		
		try {
			for (int i = 0; i < imgName.length; i++) {
				BufferedImage buffImg = ImageIO.read(this.getClass().getClassLoader().getResource(imgName[i]));
				enemy[i] = new Enemy(WIDTH,100+(100*i),90,90,-2,0,buffImg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}

	//총알을 생성
	public void createBullet() {
		try {
			BufferedImage buffImg = ImageIO.read(this.getClass().getClassLoader().getResource("ball.png"));
			 bulletArray.add(new Bullet(hero.x+100,hero.y+50,20,20,15,0,buffImg));
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}
	
	@Override
	//repaint() --> update() --> paint();
	public void paintComponent(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		gameBg[0].tick();
		gameBg[0].render(g);
		gameBg[1].tick();
		gameBg[1].render(g);
		
		hero.tick();
		hero.render(g);
		
		//누적된 총알 모두의 tick(),render()호출
		for (int i = 0; i < bulletArray.size(); i++) {
			Bullet bullet =bulletArray.get(i); //요소 꺼내기
			bullet.tick();
			bullet.render(g);
		}
		
		
		for(int i=0;i<enemy.length;i++) {
			enemy[i].tick();
			enemy[i].render(g);
			
		}
	}

	// 게임의 심장역할을 해줄, 게임루프 정의..
	public void gameLoop() {
		// System.out.println("gameLoop() 호출..");
		repaint();
	}

	//인터페이스 구현시, 재정의할 메서드 3개이상 될때, 사용하지도 않는 메서드를 클래스 내에 방치하는 것은
	//올바르지 못하다. 해결책)3개이상의 구현메서드가 있을 때는 sun에서 개발자 대신 인터페이스를 구현해놓은
	//클래스를 지원하는데, 이 클래스를 가리켜 Adapter(어댑터)라 한다..
}
