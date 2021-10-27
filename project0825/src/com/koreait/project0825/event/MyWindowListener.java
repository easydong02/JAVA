package com.koreait.project0825.event;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//이벤트 중 윈도우와 관련된 이벤트를 감지할 리스너
public class MyWindowListener implements WindowListener {

	@Override
	public void windowActivated(WindowEvent arg0) {
		System.out.println("windowActivated 호출");
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		System.out.println("windowClosed 호출");

	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		System.out.println("windowClosing 호출");
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		System.out.println("windowDeactivated 호출");
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		System.out.println("windowDeiconified 호출");
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		System.out.println("windowIconified 호출");
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		System.out.println("windowOpened 호출");
		
	}

}
