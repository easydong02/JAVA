package com.koreait.project0830.stream4;

import java.io.InputStream;
import java.io.IOException;


class KeyBoardInputApp{



	public static void main(String[] args) throws IOException{
		//�Ϲ������� �ϵ������� OS�� �����ϰ�, �ش� �ϵ������� ������� ���ؼ���
		//���� �ϵ��� �������� �ʰ�, OS�κ��� ��Ʈ���� ���� ����..
		//���� �ΰ��� ��ǻ�� �̿�� ���������� ����ϴ� ��Ʈ���� ��쿣, OS�� ������ ��Ʈ���� �ڹٿ���
		//������ �� �ִ� ��ü���� ����ϸ� �ȴ�...
		//�ý����� OS�� �츮 ��ſ� ǥ�� ��� ��⿡ ���� ��Ʈ���� ���� ��ü
		InputStream is =System.in;//ǥ���Է½�Ʈ��, �ַ� Ű���� � ����� ��Ʈ��..
		int data=-1;

		while(true){
			data = is.read();//Ű����� ���� 1byte �о����
			System.out.print((char)data);
		}
	}



}

