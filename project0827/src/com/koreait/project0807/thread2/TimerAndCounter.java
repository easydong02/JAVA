package com.koreait.project0807.thread2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TimerAndCounter extends JFrame {
	JLabel la_counter;
	JLabel la_timer;
	Thread counterThread;
	Thread timerThread;
	int num;
	

	public TimerAndCounter() {
		la_counter = new JLabel("0");
		la_timer = new JLabel("0");

		// 스타일
		Dimension d = new Dimension(330, 200);
		la_counter.setPreferredSize(d);
		la_timer.setPreferredSize(d);

		la_counter.setBackground(Color.YELLOW);
		la_timer.setBackground(Color.CYAN);

		Font font = new Font("Arial Black", Font.BOLD, 100);
		la_counter.setFont(font);
		la_timer.setFont(new Font("Arial Black", Font.BOLD, 30));

		setLayout(new FlowLayout());

		add(la_counter);
		add(la_timer);

		setSize(350, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// 쓰레드 생성하기
		counterThread = new Thread() {
			@Override
			public void run() {
				while (true) {//무한루프..
					num++;
					// 증가된 숫자를 라벨에 반영하자
					la_counter.setText(Integer.toString(num));// 5 -- > "5"
				
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} //100/1000초 동안 멈춤
				}
			}
		};
		
		
		counterThread.start();//runnable에 전달

		timerThread = new Thread() {
			@Override
			//개발자는 쓰레드로 수행시키고 싶은 독립적 코드를 run()에 작성하면 된다
			//이 때 sun()은 jvm이 알아서 수행시켜준다.
			public void run() {
				while(true) {
				Calendar cal = Calendar.getInstance();// 날짜 객체
				int hour = cal.get(Calendar.HOUR);// 시
				int min = cal.get(Calendar.MINUTE);// 분
				int sec = cal.get(Calendar.SECOND);// 초
				la_timer.setText(hour +" : "+min+" : "+sec);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				}
			}
		};
		timerThread.start();
	}

	public static void main(String[] args) {

		new TimerAndCounter();

	}

}
