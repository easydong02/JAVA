package com.koreait.gui;


import java.awt.*;
//gui ������Ʈ ��, Panel�� ������ ����.
class PanelTest{

	
	public static void main(String[] args){
		Frame frame= new Frame();//����Ʈ ��ġ�� BorderLayout�� �����(����)
		Panel panel= new Panel(); //����Ʈ ��ġ�� FlowLayout�� �����.(frame�� ����)
		
		Button bt = new Button("����ư");
		Button bt2 = new Button("����ư");
		//�г��� ���� ������ �����Ƿ�, �����̹Ƿ� ������ �����غ���!
		panel.setBackground(Color.black);
		//�г� ���� �׳� ��ư�� �����ӿ� ����
		//�������� ����Ʈ�� BorderLayout�̹Ƿ�, ��չ�ư���� ����, �� ���Ϳ� �پ Ȯ��!
		panel.add(bt);
		panel.add(bt2);
		frame.add(panel);//����Ʈ�� center��..
		frame.setVisible(true);
		frame.setSize(600,500);
	}




}