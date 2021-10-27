package com.koreait.music;

import com.koreait.ride.Roller;
import com.koreait.fly.Drone;
class UseSpeaker{

	public static void main(String[] args){
	
	BSpeaker bs = new BSpeaker();
	bs.supportMp3();
	bs.fly();
	bs.run();
	
	Drone d = bs; //스피커는 드론 형이다!
	d.fly();


	Roller r =bs;//스피커는 롤러 형이다1
	r.();

	}
}
