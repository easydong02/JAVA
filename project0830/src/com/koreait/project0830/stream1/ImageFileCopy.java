package com.koreait.project0830.stream1;


//이미지 파일을 실행중인 자바프로그램으로 읽어들인 후, 목적지 경로에 다시 출력해보자
//=즉 파일 복사를 구현
//수업주제 : Stream(흘러가는 강 줄기 등)
//		   컴퓨터 분야에서의 스트림의 대상은 바로 데이터!
//		   자바에서는 스트림과 관련된 유용한 api를 java.io패키지에서 지원함

/*
스트림의 분류
1) 방향에 따른 분류 (기준은 실행중인 프로그램이다 - 상대적 개념)
	입력: 실행중인 프로그램으로 데이터가 들어가는 것
	출력: 실행중인 프로그램에서 데이터가 나오는 것

*/
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class ImageFileCopy{
	FileInputStream fis;//파일을 대상으로 데이터를 읽어들이는 데 사용하는 스트림 객체
	FileOutputStream fos;//파일을 대상으로 데이터를 내보내기 위한 스트림 객체
	public ImageFileCopy(){
		//파일 깨물기..
		//프로그램의 문법이 문제가 아닌, 외부적 문제로 인한 문제가 발생할 경우 프로그램은 어떻게 될까?
		//비정상 종료에 이르게 된다.. 컴퓨터 분야에서 가장 무서워 하는 상황임..
		//따라서 보안 안정적인 프로그램의 실행을 위해 예외처리라는 기술을 도입..
		//결론 : 문법적으로 문제가 없다하여, 프로그램이 무사히 수행될 것이라는 보장을 할 수 없다..
		//		이런 예외적인 상황에 프로그램을 안정적으로 수행시키기 위한 방법이 바로 예외처리 인데
		//		try~catch 문으로 지원함..

		try{
		
			fis = new FileInputStream("D:/bigData/workspaceOfJava2/data/gini3.jfif");
			fos = new FileOutputStream("D:/bigData/workspaceOfJava2/data/gini1.jfif");	//empty 파일 생성해줌
			System.out.println("스트림 생성 성공");
			
			int data=-1;

			while(true){
				data = fis.read();//1byte 읽어들임
				if(data==-1)break;//파일의 마지막에 도달한 경우엔 반복문 빠져나오기
				//System.out.println(data);//읽어들인 데이터 1byte 출력
			
				fos.write(data);//빈 파일을 대상으로, 1byte알갱이를 내뱉자!

			}

			
		}catch(FileNotFoundException e){
			//실제로 해당 예외가 발생하면, 예외를 객체의 인스턴스를 메모리에 올리고 e로 전달함..
			//개발자는 전달받은 e를 이용하여 원인을 분석, 로그기록 등을 처리..
			//원래는 비정상종료 되었어야 하는 프로그램의 실행부를 catch문으로 진입시켜 안정화...
			//원상복구는 불가능하여, 주로 에러의 원인 등 로그를 남기거나, 이메일 ,기타 관리자에게 피드백 처리..
			//결론: 예외처리의 목적은 프로그램의 비정상 종료의 방지!!
			System.out.println("해당 파일을 찾을 수 없습니다.");
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("파일 읽기에 실패했습니다.");
			e.printStackTrace();
		}finally{
			//메모리 올라온 경우만..
			if(fis !=null){
				try{
				fis.close();//null 객체는 메서드 호출 불가능..NullPointerException
				}catch(IOException e){
					e.printStackTrace();
				 } 
			}
			if(fos !=null){
				try{
				fos.close();
				}catch(IOException e){
					e.printStackTrace();
				 }
			}
			
		 }
	}

	public static void main(String[] args) {
		new ImageFileCopy();




	}
}
