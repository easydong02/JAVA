package com.koreait.music;

import com.koreait.ride.Roller;
import com.koreait.fly.Drone;
class UseSpeaker{

	public static void main(String[] args){
	
	BSpeaker bs = new BSpeaker();
	bs.supportMp3();
	bs.fly();
	bs.run();
	
	Drone d = bs; //����Ŀ�� ��� ���̴�!
	d.fly();


	Roller r =bs;//����Ŀ�� �ѷ� ���̴�1
	r.();

	}
}
