package com.koreait.project0830.stream5;

import java.io.*;

//�����͸� ���� �� ���� ȿ������ ��������!
class BufferedApp {
	FileInputStream fis;
	FileOutputStream fos;


	public BufferedApp() throws FileNotFoundException, IOException{
		fis=new FileInputStream("D:/bigData/workspaceOfJava2/data/gini2.jpg");//������ ����
		fos=new FileOutputStream("D:/bigData/workspaceOfJava2/data/gini2_copy.jpg");//���� ����
	
		int data=-1;
		byte[] buff = new byte[1024];//�ָӴ��� ũ�⸦ ���� �ָӴ��� ũ�� :1kb
		while(true){
			data =fis.read(buff);//1byte 
			if(data==-1)break;
			fos.write(buff);//���
		}
		System.out.println("����Ϸ�");
		fis.close();
		fos.close();
	}

	public static void main (String[] args)throws FileNotFoundException, IOException{
		new BufferedApp();
	
	}



}