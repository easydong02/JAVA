package com.koreait.project0830.stream5;

import java.io.*;

//데이터를 읽을 때 보다 효율성을 따져보자!
class BufferedApp {
	FileInputStream fis;
	FileOutputStream fos;


	public BufferedApp() throws FileNotFoundException, IOException{
		fis=new FileInputStream("D:/bigData/workspaceOfJava2/data/gini2.jpg");//복사할 파일
		fos=new FileOutputStream("D:/bigData/workspaceOfJava2/data/gini2_copy.jpg");//복사 파일
	
		int data=-1;
		byte[] buff = new byte[1024];//주머니의 크기를 정의 주머니의 크기 :1kb
		while(true){
			data =fis.read(buff);//1byte 
			if(data==-1)break;
			fos.write(buff);//출력
		}
		System.out.println("복사완료");
		fis.close();
		fos.close();
	}

	public static void main (String[] args)throws FileNotFoundException, IOException{
		new BufferedApp();
	
	}



}