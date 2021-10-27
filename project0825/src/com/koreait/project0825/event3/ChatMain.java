package com.koreait.project0825.event3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

//대화 내역이 출력될, 채팅 메인 화면
public class ChatMain extends JFrame implements ActionListener {
	JButton bt;
	JTextArea area;
	PopUp pu;
	
	public ChatMain() {
		//생성
		bt = new JButton("대화 상대 띄우기");
		area= new JTextArea();
		
		//스타일
		area.setPreferredSize(new Dimension(380,420));
		area.setBackground(Color.YELLOW);
		
		
		//조립
		this.setLayout(new FlowLayout());
		add(bt);
		add(area);
		
		
		//윈도우설정
		this.setBounds(200,100,400,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		
		//연결(Plug In)
		bt.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//대화 상대방 띄우기!!
		
		if(pu == null) {
			pu =new PopUp(area);}
	}
	
	public static void main(String[] args) {
		new ChatMain();
	}

	

}
