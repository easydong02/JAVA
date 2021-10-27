package com.koreait.project0826.graphic3;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


//이미지 사진을 교체하며 볼 수 있는 갤러리 제작
public class Gallery extends JFrame implements ActionListener{
	JPanel p;//그림을 그려넣을 패널
	JPanel p_south;//버튼을 담을 패널
	JButton bt_prev,bt_next;
	MyPanel can;
	public Gallery() {
		//생성
		can = new MyPanel();
		p_south= new JPanel();
		bt_prev= new JButton("이전사진");
		bt_next= new JButton("다음사진");
		
		//스타일
		
		//조립
		add(can);
		p_south.add(bt_prev);
		p_south.add(bt_next);
		add(p_south,BorderLayout.SOUTH);
		
		
		//윈도우 설정
		setSize(500,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		//리스너 연결
		bt_prev.addActionListener(this);
		bt_next.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new Gallery();
	}

	public void prev() {
		//현재 보고있는 사진보다 이전 사진
		
	}
	public void next() {
		//현재 보고있는 사진보다 다음 사진
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		String s1="korea";
		String s2="korea";
		
		
		if(obj == bt_prev) {
			if(can.index>0) {
				can.index--;
				can.repaint();
				this.setTitle("현재까지의 index "+can.index);
			}
			else {
				JOptionPane.showMessageDialog(this, "이전 사진이 없습니다.");
			}
			
		}
		if(obj == bt_next) {
			if(can.index<can.img.length-1) {
				can.index++;//6
				//can.paint(getGraphics());//paint메서드는 개발자가 아닌, 다시 그려져야할 타이밍에 시스템이 호출
				//그렇다면 개발자가 paint메서드를 직접 호출하는 방법은? 없다.
				//간접적으로 호출하는 방법 이용 즉 paint메서드가 호출될 수 있도록 시스템에 요청
				//repaint() --> update() 호출로 기존 그림을 지움 -->paint()호출하여 다시 그림을 그림..
				can.repaint();
			}
			else {
				JOptionPane.showMessageDialog(this, "다음 사진이 없습니다.");
			}
			this.setTitle("현재까지의 index "+can.index);
			
			
		}
	}
}
