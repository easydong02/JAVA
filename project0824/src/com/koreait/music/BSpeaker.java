package com.koreait.music;

import com.koreait.fly.Drone;
import com. koreait.ride.Roller;
//�θ�Ŭ������ �߻�Ŭ������ ���, �ڽ� ��ü�� �θ� �ϼ����� ����, �ҿ����� �κ���
//�ϼ��� �ǹ��� �ο��޴´�... �������� �޴´�.
public class BSpeaker extends MusicPlayer implements Roller,Drone{
					 /*is a*/			/*is a*/
	public void connect(){
		System.out.println("�ٰŸ� ������� ��Ʈ�� ����");
	}
	//�������̵�..
	public void supportMp3(){
		System.out.println("��������� ������ MP3���� �ε�");
	}

	public void volumeUP(){
		System.out.println("��������� ������ ���� �ø���");
	}
	public void volumeDown(){
		System.out.println("��������� ������ ���� ������");
	}

	public void run(){
		System.out.println("�޸���.");
	}

	public void fly(){
		System.out.println("����");
	}
}