package com.koreait.project0826.collection;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonCreator extends JFrame implements ActionListener{
	JPanel p_north,p_center;
	JButton bt_create;// 버튼 생성하는 
	JButton bt_bg;// 모든 버튼의 배경색 변경하는 
	int i=0;
	//자바뿐 아니라 기존의 절차지향 언어에서는 배열 선언시 반드시 그 크기를 미리 명시해야 한다.
	JButton[] bt= new JButton[20];
	
	
	public ButtonCreator() {
		//생성
		p_north= new JPanel();
		p_center= new JPanel();
		bt_create = new JButton("버튼생성");
		bt_bg = new JButton("색상 변경");
		
		//스타일
		p_center.setBackground(Color.WHITE);
	
		//조립
		//북쪽 패널에 버튼 부착!
		p_north.add(bt_create);
		p_north.add(bt_bg);
		add(p_north,BorderLayout.NORTH);
		add(p_center,BorderLayout.CENTER);
	
		
		//윈도우 설정
		setSize(800,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		//리스너와 연결
		//이벤트소스 Event Source
		bt_create.addActionListener(this);
		bt_bg.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new ButtonCreator();
	}
	
	public void createBtn() {
		bt[i] = new JButton(i+"버튼");
		p_center.add(bt[i]);//센터의  패널에 부착!
		//기존에 없었던 컴포넌트에 대한 크래픽을 갱신시키려면 updateUI()호출
		p_center.updateUI();//갱신
		i++;
	}
	public void setBg() {
		//생성된 모든 색상 변경
		for (int i = 0; i < bt.length; i++) {
			bt[i].setBackground(Color.YELLOW);
		}
		
	}
	
	@Override
	//JVM이 이벤트 정보를 아래의 메서드의 매개변수로 전달해줌..
	public void actionPerformed(ActionEvent e) {
		//누구를 눌렀느냐? 즉 이벤트 소스를 알아맞추기!!
		Object obj = e.getSource();//개발자가 어떤 컴포넌트 종류에 연결했는지 예측불가, 따라서 상위객체인 Object로
//		JButton btn = (JButton)obj;
		if(obj == bt_create) {
			
			createBtn();
			
		}
		else {
			setBg();
		}
	}
	
}
