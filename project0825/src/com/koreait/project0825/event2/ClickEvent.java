package com.koreait.project0825.event2;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class ClickEvent extends JFrame implements ActionListener{
	JButton bt;
	JTextArea area;
	int i =0;
	
	public ClickEvent() {
		bt =new JButton("나 눌러봐");
		area= new JTextArea();
		
		setLayout(new FlowLayout());
	
		//스타일
		area.setPreferredSize(new Dimension(450,550));
		setLayout(new FlowLayout());
		
		//조립
		add(bt);
		add(area);
	
		//윈도우 설정
		setSize(500,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//버튼과 리스너 연결
//		MyActionListener listener = new MyActionListener(area);
//		bt.addActionListener(listener);
		bt.addActionListener(this);//다중상속하면 가능
		
		
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		area.append(++i+ "클릭했어요\n");
	}
	
	
	public static void main(String[] args) {
		new ClickEvent();
	}
}
