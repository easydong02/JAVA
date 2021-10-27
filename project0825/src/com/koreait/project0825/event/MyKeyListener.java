package com.koreait.project0825.event;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//여러 이벤트 중, 오직 키이벤트만 청취하는 리스터를 재정의한다!
public class MyKeyListener implements KeyListener {

	@Override
	public void keyPressed(KeyEvent arg0) {//타이핑 할때..
//		System.out.println("keyTyped 호출");
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		System.out.println("keyReleased 호출");//키보드를 눌렀다가 땔때..호출
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
//		System.out.println("keyPressed 호출");//키보드를 누를 때 호출
		
	}

}
