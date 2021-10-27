package com.koreait.gui;


import java.awt.*;

class HomeWork {
	public static void main(String[] args) {
		Frame frame= new Frame();
		Panel pl1= new Panel();
		Panel pl2= new Panel();
		pl1.setSize(600,100);

		Button bt = new Button("이전");
		Button bt2 = new Button("다음");
		BorderLayout layout = new BorderLayout();
		frame.setLayout(layout);



		pl1.setBackground(Color.yellow);
		pl2.setBackground(Color.blue);

		pl1.add(bt);
		pl1.add(bt2);
		
		frame.add(pl1,BorderLayout.NORTH);
		frame.add(pl2,BorderLayout.CENTER);

		frame.setVisible(true);
		frame.setSize(600,500);
	}
}
