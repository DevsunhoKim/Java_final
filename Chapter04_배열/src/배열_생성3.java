/*
 *    가위바위보
 */
import java.util.Scanner;
public class 배열_생성3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int com=(int)(Math.random()*3);//0,1,2
        Scanner scan=new Scanner(System.in);
        System.out.print("가위(0),바위(1),보(2):");
        int user=scan.nextInt();
        // arr={1,2,3,4,5} arr[3]=400
        String[] res={"가위","바위","보"};
        //            res[0] res[1] res[2]
        System.out.println("컴퓨터:"+res[com]);
        System.out.println("사용자:"+res[user]);
        /*System.out.print("컴퓨터:");
        if(com==0)
        	System.out.println("가위");
        else if(com==1)
        	System.out.println("바위");
        else if(com==2)
        	System.out.println("보");
        
        System.out.print("사용자:");
        if(user==0)
        	System.out.println("가위");
        else if(user==1)
        	System.out.println("바위");
        else if(user==2)
        	System.out.println("보");*/
	}

}
