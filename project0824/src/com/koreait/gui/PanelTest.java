package com.koreait.gui;


import java.awt.*;
//gui 컴포넌트 중, Panel을 이해해 본다.
class PanelTest{

	
	public static void main(String[] args){
		Frame frame= new Frame();//디폴트 배치는 BorderLayout이 적용됨(독립)
		Panel panel= new Panel(); //디폴트 배치는 FlowLayout이 적용됨.(frame에 의존)
		
		Button bt = new Button("나버튼");
		Button bt2 = new Button("나버튼");
		//패널이 눈에 보이지 않으므로, 투명이므로 배경색을 적용해보자!
		panel.setBackground(Color.black);
		//패널 없이 그냥 버튼을 프레임에 부착
		//프레임의 디폴트는 BorderLayout이므로, 대왕버튼으로 존재, 즉 센터에 붙어서 확장!
		panel.add(bt);
		panel.add(bt2);
		frame.add(panel);//디폴트가 center임..
		frame.setVisible(true);
		frame.setSize(600,500);
	}




}