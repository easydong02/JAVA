package com.koreait.project0825.event3;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PopUp extends JFrame implements KeyListener{
	JTextField t_input;
	JTextArea area;
	
	//생성자 주입(생성자를 통해, 외부에서 객체를 전달)
	public PopUp(JTextArea area) {
		this.area=area;
		//생성
		t_input = new JTextField(20);
		
		
		//조립
		setLayout(new FlowLayout());
		add(t_input);
		
		//윈도우 설정
		setBounds(700,100,400,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	
		//연결
		t_input.addKeyListener(this);
	
	
	}


	@Override
	public void keyPressed(KeyEvent e) {
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		int key= e.getKeyCode();
		if(key == 10) {//엔터를 친거임..
		//나 아닌 메인창에 존재하는 JTextArea에 키보드 입력한 데이터 출력!!
			String msg =t_input.getText();
			area.append(msg+ "\n");
		}
	}


	@Override
	public void keyTyped(KeyEvent e) {
		
	}
}
