package com.koreait.project0826.graphic4;

import javax.swing.JFrame;

public class AnimationApp extends JFrame{
	GamePanel gamepanel;
	
	public AnimationApp() {
		gamepanel = new GamePanel();
		add(gamepanel);//center
		
		
		this.pack(); //프레임 안쪽의 내용물 만큼 줄어든다..
		//프레임을 모니터의 정중앙에 오게하는 법
		this.setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		new AnimationApp();
	}
}
