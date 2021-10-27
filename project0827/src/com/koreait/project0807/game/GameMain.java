package com.koreait.project0807.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class GameMain extends JFrame{
	JMenuBar bar;
	JMenu menu;
	JMenuItem[] item= new JMenuItem[3];
	GamePanel gamePanel;
	
	public GameMain() {
		
		//생성
		bar =new JMenuBar();
		menu = new JMenu("게임설정");
		item[0] = new JMenuItem("게임시작");
		item[1] = new JMenuItem("Pause");
		item[2] = new JMenuItem("게임종료");
		
		
		
		gamePanel = new GamePanel();
		
		//조립
		for(JMenuItem obj : item) {
			menu.add(obj);
		}
		bar.add(menu);
		setJMenuBar(bar);
		add(gamePanel);
		pack();
		setVisible(true);
		setLocationRelativeTo(null);//화면 가운데로 위치
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	
		//이벤트 연결
		item[0].addActionListener(new ActionListener() {//게임 시작
			
			@Override
			public void actionPerformed(ActionEvent e) {
				gamePanel.check=true;
			}
		});
		item[1].addActionListener(new ActionListener() {//게임 잠시 멈춤
			
			@Override
			public void actionPerformed(ActionEvent e) {
				gamePanel.check=false;
			}
		});
		item[2].addActionListener(new ActionListener() {//프로그램 종료
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0); //프로세스 종료
			}
		});
	}
	
	public static void main(String[] args) {
		//지금까지 자바의 메인 실행부라 불리는 녀석은.. 메인스레드였다..
		//메인스레드, 즉 메인실행부의 역할은 프로그램 운영, 특히 gui에서는 이벤트 감지,
		//그래픽 처리(그리는 역할)
		//따라서 절대로 대기상태나, 무한루프에 빠지게 해서는 안 된다!
		//참고로 스마트폰 개발에서는 메인 쓰레드의 루프는 그 자체가 에러사항이다..
		
		new GameMain();
		
	}
}
