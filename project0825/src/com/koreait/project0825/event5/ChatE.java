package com.koreait.project0825.event5;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatE extends JFrame implements KeyListener{
		JTextArea area;
		JScrollPane scroll;
		JTextField t_input;
		ChatD chatD;

		
		//생성
		public ChatE() {
			area =new JTextArea();
			scroll = new JScrollPane(area);
			t_input = new JTextField(20);
			
			//스타일 
			area.setPreferredSize(new Dimension(280,320));
			area.setBackground(Color.cyan);

			
			//조립
			setLayout(new FlowLayout());//플로우 레이아웃 적용
			add(scroll);
			add(t_input);
			
			//윈도우 설정
			this.setBounds(550,100,320,420);
			setVisible(true);
			
			
			//리스너와 연결
			t_input.addKeyListener(this);
		
		
		
		
		}
		//누군가에 의해 ChatA를 넘겨받을 수 있는 setter메서드 정의
		public void setChatD(ChatD chatD) {
			this.chatD = chatD;
		}
		
		
		@Override
		public void keyPressed(KeyEvent e) {;}
		@Override
		public void keyReleased(KeyEvent e) {
			if(e.getKeyCode()==KeyEvent.VK_ENTER) {
				String msg = t_input.getText();//입력값 가져오기
				chatD.area.append(msg+"\n");//ChatA area에 출력
				this.area.append(msg+"\n");//나의 area에 출력
				
				t_input.setText("");//입력했던 데이터 다시 지우기
			}
		}
		@Override
		public void keyTyped(KeyEvent e) {;}
}
