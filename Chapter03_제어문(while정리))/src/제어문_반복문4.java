// do~while 
// updown~game ==> 단점 
import java.util.Scanner;
public class 제어문_반복문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        int com=(int)(Math.random()*100)+1;
        
        do {
        	  System.out.print("정수 입력(1~100):");
        	  int user=scan.nextInt();
        	  
        	  if(com>user)
        	  {
        		 System.out.println("입력값보다 큰 수를 입력하세요"); 
        	  }
        	  else if(com<user)
        	  {
        		  System.out.println("입력값보다 작은 수를 입력하세요");
        	  }
        	  else
        	  {
        		  System.out.println("Game Over");
        		  System.exit(0);
        	  }
        }while(true);
        
	}

}
