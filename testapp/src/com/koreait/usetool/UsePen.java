package com.koreait.usetool;
/*	-d 옵션은 해당 클래스를 컴파일시, 선언된 패키지를 자동으로 생성해준다.
	지정한 디렉토리로 .class파일을 생성해준다.
*/

import com.koreait.tool.Pen;  //.java x .class O

class UsePen{
	
	public static void main(String[] args){
		Pen p1 = new Pen();
		System.out.println("지금 살아있는 펜은 : " +p1.getName());
	
	}


}