package com.koreait.project0826.graphic;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

//우리가 재정의한 즉 커스터마이징한 버튼을 화면에 등장!
//과연 sun사보다 잘 그렸을까?
public class MyFrame extends JFrame {
	JButton bt;//원래 버튼
	CustomButton cbt;// 재정의한 버튼
	
	public MyFrame() {
			bt= new JButton("난 원래 버튼");
			cbt = new CustomButton("커스텀 버튼");
	
			setLayout(new FlowLayout());
			add(bt);
			add(cbt);
			
			
			setSize(300,400);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setVisible(true);
			
	}
	
	
	
	
	public static void main(String[] args) {
		new MyFrame();
	}
}
