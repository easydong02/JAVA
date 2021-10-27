package com.koreait.project0825;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login extends JFrame{

		JPanel p_center;
		JPanel p_south;
		JLabel la_id;
		JLabel la_password;
		JTextField t_id;
		JTextField t_password;
		JButton bt_login;
		JButton bt_regist;

			public Login() {
				p_center = new JPanel();
				p_south = new JPanel();
				la_id = new JLabel("ID");	
				la_password = new JLabel("Pass");
				t_id = new JTextField();
				t_password = new JTextField();
				bt_login = new JButton("Login");
				bt_regist = new JButton("Regist");
			
				//스타일
				p_center.setBackground(Color.WHITE);
				p_south.setBackground(Color.BLACK);
				
				//매개변수에 일일이 넣기 귀찮으면 객체 만들기
				Dimension d = new Dimension(130,20);
				
				
				la_id.setPreferredSize(new Dimension(130,20));
				la_password.setPreferredSize(new Dimension(130,20));
				t_id.setPreferredSize(new Dimension(130,20));
				t_password.setPreferredSize(new Dimension(130,20));
				//조립
				p_center.add(la_id);
				p_center.add(t_id);
				p_center.add(la_password);
				p_center.add(t_password);
				
				
				p_south.add(bt_login);//패널에 버튼 부착
				p_south.add(bt_regist);//패널에 버튼 부착
				
				//윈도우 설정
				this.setSize(300, 165);
				this.setVisible(true);
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				this.add(p_center,BorderLayout.CENTER);//패널을 프레임의 센터에 부착!
				this.add(p_south,BorderLayout.SOUTH);//패널을 프레임의 남쪽에 부착!
				
				
			}

public static void main(String[] args) {
	new Login();
}



}
