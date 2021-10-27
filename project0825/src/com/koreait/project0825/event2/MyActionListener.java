package com.koreait.project0825.event2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;

//프레임이자, 액션 리스너로 정의
public class MyActionListener implements ActionListener {
	JTextArea area;//null
	
	 public MyActionListener(JTextArea area) {
		 this.area=area;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//area에 문자열 출력하자!
		//area.setText("클릭했네요"); 이건 덮어쓰기
		area.append("클릭했네요\n");
		
	}

}
