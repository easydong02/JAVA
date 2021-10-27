package com.koreait.project0825.editor;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

//자바로 메모장을 구현해본다!!
public class MemoEditor extends JFrame {
	JMenuBar bar;//메뉴바 - 메뉴들이 올라갈 영역(안드로이드에서는 액션바)
	JMenu m_file,m_edit,m_outLine,m_view,m_help;
	JMenuItem item_new,item_newWindow,item_open,item_save,item_saveas,item_print,item_page,item_exit;
	
	JTextArea area;//멀티라인 텍스트 입력상자
	JScrollPane scroll;//스크롤바
	
	public MemoEditor() {
		bar = new JMenuBar();
		m_file = new JMenu("파일(F)");
		m_edit = new JMenu("편집(E)");
		m_outLine = new JMenu("서식(O)");
		m_view = new JMenu("보기(V)");
		m_help = new JMenu("도움말(H)");
		
		item_new= new JMenuItem("새로만들기(N)");
		item_newWindow= new JMenuItem("새창(W)");
		item_open= new JMenuItem("열기(O)");
		item_save= new JMenuItem("저장(S)");
		item_saveas= new JMenuItem("다른 이름으로 저장(A)");
		item_page= new JMenuItem("페이지 설정(U)");
		item_print= new JMenuItem("인쇄(P)");
		item_exit= new JMenuItem("끝내기(X)");
		
		area = new JTextArea();
		scroll = new JScrollPane(area);
		
		//프레임에 스크롤 부착
		//메뉴바에 메뉴 올리기
		bar.add(m_file);
		bar.add(m_edit);
		bar.add(m_outLine);
		bar.add(m_view);
		bar.add(m_help);
		
		//파일메뉴에 아이템들 올리기
		m_file.add(item_new);
		m_file.add(item_newWindow);
		m_file.add(item_open);
		m_file.add(item_save);
		m_file.add(item_saveas);
		m_file.addSeparator();//구분선 긋기
		m_file.add(item_page);
		m_file.add(item_print);
		m_file.addSeparator();//구분선 긋기
		m_file.add(item_exit);
		
		this.setJMenuBar(bar);
		this.add(scroll);
		setSize(700,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new MemoEditor();
	}
	
	
	
	
	
	
	
	
	
	
}
