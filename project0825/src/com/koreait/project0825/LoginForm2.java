package com.koreait.project0825;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class LoginForm2 extends Frame {
	//has a 멤버변수 영역에 객체형을 보유한 상태..
	Panel p_north;
	Panel p_center;
	Button bt_prev;
	Button bt_next;
	
	public LoginForm2() {
		p_north = new Panel();
		p_center = new Panel();
		bt_prev= new Button("이전");
		bt_next= new Button("다음");
		
		
		//스타일.. 디자인
		p_north.setBackground(Color.YELLOW);
		p_center.setBackground(Color.CYAN);
		
		//조립
		//프레임의 북쪽에 버튼 부착!
		this.add(p_north,BorderLayout.NORTH);
		this.add(p_center,BorderLayout.CENTER);
		p_north.add(bt_next);
		p_north.add(bt_prev);
		
		
		this.setSize(600, 500);
		this.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new LoginForm2();
	}
}
