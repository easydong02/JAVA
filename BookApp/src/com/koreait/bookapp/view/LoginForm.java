package com.koreait.bookapp.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.koreait.bookapp.model.Admin;
import com.koreait.bookapp.model.AdminDAO;

//도서관리 페이지
public class LoginForm extends Page{
	JTextField t_id;
	JPasswordField t_pass;
	JPanel content;
	JButton bt_login;
	AdminDAO adminDAO;
	
	public LoginForm(MainFrame mainFrame) {
		super(mainFrame);
		
		//생성
		t_id= new JTextField();
		t_pass = new JPasswordField();
		content = new JPanel();
		bt_login = new JButton("Login");
		adminDAO = new AdminDAO();
		
		//스타일
		Dimension d = new Dimension(480,40);
		t_id.setPreferredSize(d);
		t_pass.setPreferredSize(d);
		
		content.setBackground(Color.YELLOW);
		content.setPreferredSize(new Dimension(500,230));
		
		//조립
		content.add(t_id);
		content.add(t_pass);
		content.add(bt_login);
		
		add(content);
	
		bt_login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//아이디와 패스워드를 VO담아서 전달!
				String id = t_id.getText();//암시적 생성법
				String pass = new String (t_pass.getPassword()); //apple 'a' 'p' ....'e'
			
				//VO를 생성하여 아이디와 패스워드를 심어서 보내자!!
				Admin admin = new Admin();//empty
				admin.setId(id);
				admin.setPassword(pass);
				Admin result =adminDAO.select(admin);
				if(result ==null) {
					JOptionPane.showMessageDialog(getMainFrame(), "로그인 정보가 올바르지 않습니다.");
				}else {
					JOptionPane.showMessageDialog(getMainFrame(),result.getName() +"님 반갑습니다!");
					//기존 로그인 버튼의 제목을 Logout으로 전환
					getMainFrame().bt_login.setText("Logout");
					getMainFrame().loginObj =result; //로그인 결과 객체를 프레임 대입
				}
			}
		});
	}
}
