import java.util.Scanner;
public class 제어문_반복제어문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        // 123456789
        while(true)
        {
        	System.out.print("메뉴 선택:");
        	int menu=scan.nextInt();
        	if(menu<1 || menu>9) // 없는 메뉴 선택
        	{
        		System.out.println("없는 메뉴입니다");
        		continue;// 조간식으로 이동 (처음부터 실행)
        	}
        	if(menu==9)
        	{
        		//System.exit(0); => 프로그램 전체 종료 
        		break;// while만 종료 
        	}
        	System.out.println(menu+"번 메뉴를 선택하셨습니다");
        }
        
        System.out.println("프로그램 종료!!");
	}

}
