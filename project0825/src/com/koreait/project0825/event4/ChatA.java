package com.koreait.project0825.event4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatA extends JFrame implements ActionListener,KeyListener{
		JTextArea area;
		JScrollPane scroll;
		JTextField t_input;
		JButton bt;
		ChatB chatB; //has a
		ChatC chatC;
		String cokB="/c B";
		String cokC="/c C";
		//생성자
		public ChatA() {
			area =new JTextArea();
			scroll = new JScrollPane(area);
			t_input = new JTextField(20);
			bt = new JButton("open");
			
			//스타일 
			area.setPreferredSize(new Dimension(280,320));
			area.setBackground(Color.YELLOW);
			this.area.append("이름: A \n콕찌르기:/c B, /c C\n");
			//조립
			setLayout(new FlowLayout());//플로우 레이아웃 적용
			add(scroll);
			add(t_input);
			add(bt);
			
			 
			//윈도우 설정
			this.setBounds(200,100,320,420);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			
			//리스너와의 연결
			bt.addActionListener(this);
			t_input.addKeyListener(this);
		
		}
	
	
	public static void main(String[] args) {
		new ChatA();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//대화 상대방 띄우기
		if(chatB == null && chatC==null) {
			chatB = new ChatB();
			chatC = new ChatC();
			chatB.setChatA(this);
			chatB.setChatC(chatC);
			chatC.setChatB(chatB);
			chatC.setChatA(this);
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {;}
	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_ENTER) {
			if(cokB( t_input.getText())) {
				chatB.area.append("A님이 당신을 콕 찔렀습니다.\n");
				t_input.setText("");
			}
			if(cokC( t_input.getText())) {
				chatC.area.append("A님이 당신을 콕 찔렀습니다.\n");
				t_input.setText("");
			}
			String msg = t_input.getText();//입력값 가져오기
			chatB.area.append(msg+"\n");//ChatB area에 출력
			chatC.area.append(msg+"\n");//ChatC area에 출력
			this.area.append(msg+"\n");//나의 area에 출력
			
			t_input.setText("");//입력했던 데이터 다시 지우기
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {;}
	
	//콕찌르기 메서드
	public boolean cokB(String cok) {
		if(cok.equals(cokB)) {
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
