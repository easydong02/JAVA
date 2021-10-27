package com.koreait.project0825.event5;

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

import com.koreait.project0825.event4.ChatB;
import com.koreait.project0825.event4.ChatC;

public class ChatD extends JFrame implements ActionListener,KeyListener{
		JTextArea area;
		JScrollPane scroll;
		JTextField t_input;
		JButton bt;
		String whisperE= "/c E";
		ChatE chatE;
		
		
		//생성자
		public ChatD() {
			area =new JTextArea();
			scroll = new JScrollPane(area);
			t_input = new JTextField(20);
			bt = new JButton("open");
			
			//스타일 
			area.setPreferredSize(new Dimension(280,320));
			area.setBackground(Color.YELLOW);
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
			
			//임시
			
		
		}
	
	
	public static void main(String[] args) {
		new ChatD();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(chatE == null) {
			chatE = new ChatE();
			chatE.setChatD(this);
			
		}
	
	}

	@Override
	public void keyPressed(KeyEvent e) {;}
	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_ENTER) {
			if(whisperE( t_input.getText())) {
				t_input.setText(t_input.getText());
				String whisperE = t_input.getText();
				chatE.area.append(whisperE+"(DM)\n");
				t_input.setText("");
			}
			String msg = t_input.getText();//입력값 가져오기
			this.area.append(msg+"\n");//나의 area에 출력
			t_input.setText("");//입력했던 데이터 다시 지우기
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {;}
	
	//귓속말 메서드
	public boolean whisperE(String whisper) {
		if(whisper.equals(whisperE)) {
			return true;
		}
		return false;
	}
	
}
