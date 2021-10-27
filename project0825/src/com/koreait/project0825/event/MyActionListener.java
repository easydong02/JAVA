package com.koreait.project0825.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//자바에서는 버튼 등에 발생하는 이벤트를 클릭이라는 용어를 쓰지 않고,
//대신 Action이라 한다.
//주의할 점은 Action 이벤트가 버튼에 국한된 것은 아니고 이미지, 텍스트 필드 등등
//마우스로 클릭 가능한 모든 대상은 action이벤트를 발생시킬 수 있다.

//ActionListener란, 수많은 이벤트 중 오직 ActionEvent만을 감지하는 리스터 인터페이스이다.
//Sun에서 개발자에게 불완전한 형태의 인터페이스로 제공하는 이유는?
//이벤트 발생 시 어떠한 프로그램을 작성할지는 개발자의 몫
public class MyActionListener implements ActionListener{

	@Override //재정의하자!
	//actionPerformed() 메서드는 이벤트 발생 시 jvm에 의해 호출되며, 이 때 jvm이 생성한 
	//이벤트 객체도 매개변수로 전달되어 진다..
	public void actionPerformed(ActionEvent e) {
		System.out.println("나 눌렀어?" + e);
	}

}
