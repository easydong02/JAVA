package com.koreait.project0830.editor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

//자바로 메모장을 구현해본다!!
public class MemoEditor extends JFrame {
	JMenuBar bar;// 메뉴바 - 메뉴들이 올라갈 영역(안드로이드에서는 액션바)
	JMenu m_file, m_edit, m_outLine, m_view, m_help;
	JMenuItem item_new, item_newWindow, item_open, item_save, item_saveas, item_print, item_page, item_exit;

	JTextArea area;// 멀티라인 텍스트 입력상자
	JScrollPane scroll;// 스크롤바
	FileReader reader; // 파일의 내용을 읽어,문자(한글,아랍어,중국어 등)가 깨지지 않아야 하므로, Reader계열이 필요함
	BufferedReader buffr;

	public MemoEditor() {
		bar = new JMenuBar();
		m_file = new JMenu("파일(F)");
		m_edit = new JMenu("편집(E)");
		m_outLine = new JMenu("서식(O)");
		m_view = new JMenu("보기(V)");
		m_help = new JMenu("도움말(H)");

		item_new = new JMenuItem("새로만들기(N)");
		item_newWindow = new JMenuItem("새창(W)");
		item_open = new JMenuItem("열기(O)");
		item_save = new JMenuItem("저장(S)");
		item_saveas = new JMenuItem("다른 이름으로 저장(A)");
		item_page = new JMenuItem("페이지 설정(U)");
		item_print = new JMenuItem("인쇄(P)");
		item_exit = new JMenuItem("끝내기(X)");

		area = new JTextArea();
		scroll = new JScrollPane(area);

		// 프레임에 스크롤 부착
		// 메뉴바에 메뉴 올리기
		bar.add(m_file);
		bar.add(m_edit);
		bar.add(m_outLine);
		bar.add(m_view);
		bar.add(m_help);

		// 파일메뉴에 아이템들 올리기
		m_file.add(item_new);
		m_file.add(item_newWindow);
		m_file.add(item_open);
		m_file.add(item_save);
		m_file.add(item_saveas);
		m_file.addSeparator();// 구분선 긋기
		m_file.add(item_page);
		m_file.add(item_print);
		m_file.addSeparator();// 구분선 긋기
		m_file.add(item_exit);

		this.setJMenuBar(bar);
		this.add(scroll);
		setSize(700, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 리스너와 연결

		item_open.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
//				JOptionPane.showMessageDialog(MemoEditor.this, "파일 열거야?");
				openFileWithBuffered();
			}
		});
	}

	// 파일 열기

	public void openFile() {
		try {
			reader = new FileReader(
					"D:\\bigData\\workspaceOfJava2\\project0830\\src\\com\\koreait\\project0830\\stream7\\DownLoader.java");

			int ch = -1;
			byte[] b = new byte[1024];
			while (true) {
				ch = reader.read();// 1character read()
				// ch -->String 되려면 즉 기본자료형 -->객체자료형으로 되는 것이므로 wrapper도움
				// ch --> Character
				if (ch == -1) {
					break;
				}
				area.append(Character.toString((char) ch));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	// 버퍼가 이미 처리된 업그레이드 된 스트림
	public void openFileWithBuffered() {
		String path = "D:\\bigData\\workspaceOfJava2\\project0830\\src\\com\\koreait\\project0830\\stream7\\DownLoader.java";
		try {
			buffr = new BufferedReader(new FileReader(path));
			// 버퍼를 이용하여 읽어보기
			String data = null;
			while (true) {
				data = buffr.readLine(); // data 스트림의 끝을 만나면 읽어들인 데이터가 없을 때는 null
				if (data == null)
					break;
				area.append(data+ "\n");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (buffr != null) {
				try {
					buffr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public static void main(String[] args) {
		new MemoEditor();
	}

}
