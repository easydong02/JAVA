package com.koreait.music;

import com.koreait.fly.Drone;
import com. koreait.ride.Roller;
//부모클래스가 추상클래스인 경우, 자식 객체는 부모가 완성하지 못한, 불완전한 부분을
//완성할 의무를 부여받는다... 구현강제 받는다.
public class BSpeaker extends MusicPlayer implements Roller,Drone{
					 /*is a*/			/*is a*/
	public void connect(){
		System.out.println("근거리 블루투스 네트웍 연결");
	}
	//오버라이딩..
	public void supportMp3(){
		System.out.println("블루투스를 연동한 MP3파일 로드");
	}

	public void volumeUP(){
		System.out.println("블루투스를 연동한 볼륨 올리기");
	}
	public void volumeDown(){
		System.out.println("블루투스를 연동한 볼륨 내리기");
	}

	public void run(){
		System.out.println("달린다.");
	}

	public void fly(){
		System.out.println("날다");
	}
}