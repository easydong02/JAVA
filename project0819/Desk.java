public class Desk {
	int x;
	static int y;
	
         //인스턴스 초기화 블럭 (인스턴스 생성시 마다 이 영역 실행)
	{ //A
		for(int i=0;i<10;i++){
			x++;
		}
	}
	
	
        //static 초기화 블럭 (  실행직전  main보다 앞서서)
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

