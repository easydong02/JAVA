package com.koreait.project0825.event;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

//프로그램에서 발생하는 사건, 사고를 이벤트라 한다..
//그리고 이벤트의 종류는 클릭, 키보드, 윈도우, 텍스트필드 등
//주로 입력 컴포넌트에서 발생하는 사건사고를 의미...
public class ClickTest extends JFrame {
	JButton bt;
	JTextField t_input;

	public ClickTest() {
		bt = new JButton("눌러봐");
		t_input = new JTextField(20);

		setLayout(new FlowLayout());// 배치관리자 교체

		add(bt);// BorderLayout이므로, 대왕버튼
		add(t_input);
		setSize(300, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// 버튼과 리스너 연결!!
		bt.addActionListener(new MyActionListener());

		// 타입과 리스너 연결!
		t_input.addKeyListener(new MyKeyListener());

		// 프레임과 윈도우 리스너 연결!
		this.addWindowListener(new MyWindowListener());
	}

	public static void main(String[] args) {
		new ClickTest();
	}
}
