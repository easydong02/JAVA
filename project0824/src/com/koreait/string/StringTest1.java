package com.koreait.string;
//String Ŭ������ java.lang ��Ű���� ����ִ�.
//java.lang�� �����ڰ� �������� import
//���� �ʾƵ� ��ΰ� �νĵǾ� �ִ�..
class StringTest1 {
	public static void main(String[] args){
		/*
		String sql ="";
		for(int i=1;i<100;i++){
			sql +="babo";
		} ���Ǯ�� 101�� ������..
		*/
		
		
		//String Ŭ������ �ƴϴ�!!
		StringBuilder sb = new StringBuilder();
		sb.append("babo");
		sb.append("babo");
		sb.append("babo");
		sb.append("babo");
		sb.append("babo");
		System.out.println(sb.toString());



		String s1 ="korea";//��Ʈ���� ��ü
		String s2 ="korea";
		String s3 = new String("korea");
	
		System.out.println(s1 == s2);
	
	
	}
}
