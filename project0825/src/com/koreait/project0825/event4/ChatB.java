package com.koreait.project0825.event4;

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

public class ChatB extends JFrame implements KeyListener{
		JTextArea area;
		JScrollPane scroll;
		JTextField t_input;
		ChatA chatA;
		ChatC chatC;
		String cokA="/c A";
		String cokC="/c C";
		
		//생성
		public ChatB() {
			area =new JTextArea();
			scroll = new JScrollPane(area);
			t_input = new JTextField(20);
			
			//스타일 
			area.setPreferredSize(new Dimension(280,320));
			area.setBackground(Color.cyan);
			this.area.append("이름: B \n콕찌르기:/c A, /c C\n");
			
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
		public void setChatA(ChatA chatA) {
			this.chatA = chatA;
		}
		
		public void setChatC(ChatC chatC) {
			this.chatC = chatC;
		}
		
		@Override
		public void keyPressed(KeyEvent e) {;}
		@Override
		public void keyReleased(KeyEvent e) {
			if(e.getKeyCode()==KeyEvent.VK_ENTER) {
				if(cokA( t_input.getText())) {
					chatA.area.append("B님이 당신을 콕 찔렀습니다.\n");
					t_input.setText("");
				}
				if(cokC( t_input.getText())) {
					chatC.area.append("B님이 당신을 콕 찔렀습니다.\n");
					t_input.setText("");
				}
				String msg = t_input.getText();//입력값 가져오기
				chatA.area.append(msg+"\n");//ChatA area에 출력
				chatC.area.append(msg+"\n");//ChatC area에 출력
				this.area.append(msg+"\n");//나의 area에 출력
				
				t_input.setText("");//입력했던 데이터 다시 지우기
			}
		}
		@Override
		public void keyTyped(KeyEvent e) {;}
		
		//콕찌르기 메서드
		public boolean cokA(String cok) {
			if(cok.equals(cokA)) {
				return true;
			}
			return false;
		}
		public boolean cokC(String cok) {
			if(cok.equals(cokC)) {
				return true;
			}
			return false;
		}
}
