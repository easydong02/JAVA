package com.koreait.common;

//파일과 관련된 유용한 기능들을 모아놓은 객체
public class FileManager {
	public static String getExt(String path) {
		
		int s1= path.lastIndexOf(".");
		String s2 = path.substring(s1, path.length());
		
		return s2;
	}
	
	public static void main(String[] args) {
		System.out.println(getExt("lskfjlakjflefjk.jpg"));
	}
}
