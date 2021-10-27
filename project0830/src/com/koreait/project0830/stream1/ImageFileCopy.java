package com.koreait.project0830.stream1;


//�̹��� ������ �������� �ڹ����α׷����� �о���� ��, ������ ��ο� �ٽ� ����غ���
//=�� ���� ���縦 ����
//�������� : Stream(�귯���� �� �ٱ� ��)
//		   ��ǻ�� �о߿����� ��Ʈ���� ����� �ٷ� ������!
//		   �ڹٿ����� ��Ʈ���� ���õ� ������ api�� java.io��Ű������ ������

/*
��Ʈ���� �з�
1) ���⿡ ���� �з� (������ �������� ���α׷��̴� - ����� ����)
	�Է�: �������� ���α׷����� �����Ͱ� ���� ��
	���: �������� ���α׷����� �����Ͱ� ������ ��

*/
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class ImageFileCopy{
	FileInputStream fis;//������ ������� �����͸� �о���̴� �� ����ϴ� ��Ʈ�� ��ü
	FileOutputStream fos;//������ ������� �����͸� �������� ���� ��Ʈ�� ��ü
	public ImageFileCopy(){
		//���� ������..
		//���α׷��� ������ ������ �ƴ�, �ܺ��� ������ ���� ������ �߻��� ��� ���α׷��� ��� �ɱ�?
		//������ ���ῡ �̸��� �ȴ�.. ��ǻ�� �о߿��� ���� ������ �ϴ� ��Ȳ��..
		//���� ���� �������� ���α׷��� ������ ���� ����ó����� ����� ����..
		//��� : ���������� ������ �����Ͽ�, ���α׷��� ������ ����� ���̶�� ������ �� �� ����..
		//		�̷� �������� ��Ȳ�� ���α׷��� ���������� �����Ű�� ���� ����� �ٷ� ����ó�� �ε�
		//		try~catch ������ ������..

		try{
		
			fis = new FileInputStream("D:/bigData/workspaceOfJava2/data/gini3.jfif");
			fos = new FileOutputStream("D:/bigData/workspaceOfJava2/data/gini1.jfif");	//empty ���� ��������
			System.out.println("��Ʈ�� ���� ����");
			
			int data=-1;

			while(true){
				data = fis.read();//1byte �о����
				if(data==-1)break;//������ �������� ������ ��쿣 �ݺ��� ����������
				//System.out.println(data);//�о���� ������ 1byte ���
			
				fos.write(data);//�� ������ �������, 1byte�˰��̸� ������!

			}

			
		}catch(FileNotFoundException e){
			//������ �ش� ���ܰ� �߻��ϸ�, ���ܸ� ��ü�� �ν��Ͻ��� �޸𸮿� �ø��� e�� ������..
			//�����ڴ� ���޹��� e�� �̿��Ͽ� ������ �м�, �αױ�� ���� ó��..
			//������ ���������� �Ǿ���� �ϴ� ���α׷��� ����θ� catch������ ���Խ��� ����ȭ...
			//���󺹱��� �Ұ����Ͽ�, �ַ� ������ ���� �� �α׸� ����ų�, �̸��� ,��Ÿ �����ڿ��� �ǵ�� ó��..
			//���: ����ó���� ������ ���α׷��� ������ ������ ����!!
			System.out.println("�ش� ������ ã�� �� �����ϴ�.");
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("���� �б⿡ �����߽��ϴ�.");
			e.printStackTrace();
		}finally{
			//�޸� �ö�� ��츸..
			if(fis !=null){
				try{
				fis.close();//null ��ü�� �޼��� ȣ�� �Ұ���..NullPointerException
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
