public class Desk {
	int x;
	static int y;
	
         //�ν��Ͻ� �ʱ�ȭ �� (�ν��Ͻ� ������ ���� �� ���� ����)
	{ //A
		for(int i=0;i<10;i++){
			x++;
		}
	}
	
	
        //static �ʱ�ȭ �� (  ��������  main���� �ռ���)
	static { //B
		for(int i=0;i<20;i++){
			y++;
		}
	}
	                              
	public static void main(String[] args){
int a=new Desk().x; //D
		System.out.println(a); //E
		System.out.println(y); //F
		
	}
}

