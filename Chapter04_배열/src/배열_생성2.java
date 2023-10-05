// 문자 => 10개를 저장하는 배열 생성 => 초기화 => 출력 
//        ---------
// 실수 배열 ==> double[] arr={10,20,30,40,50}
// => 10.0....
// double[] arr=new double[10] ==> 0.0으로 초기화
// char[] arr=new char[10] ==> '\0'
// boolean[] arr=new boolean[10] ==> false
// String[] arr=new String[10] ==> null (모든 클래스는 null)
// index를 이용하는 프로그램 
/*
 *    int[] arr=new int[3];
 *    
 *    -------------------
 *       0  |  0   |  0
 *    -------------------
 *     arr[0] arr[1] arr[2]
 */
import java.util.Arrays;

public class 배열_생성2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char[] alpha=new char[10];
        // char a,b,c......
        // alpha[0],....alpha[9]
        // 초기화 
        for(int i=0;i<alpha.length;i++)
        {
        	alpha[i]=(char)((Math.random()*26)+65);
        }
        // alpha={'A','B','C'....}
        // 출력 => for-each ==> 웹 출력 
        System.out.println("===== for-each:실제 저장된 값일 읽어서 출력=====");
        for(char c:alpha)
        {
        	System.out.print(c+" ");
        }
        // 출력 전용 
        System.out.println("\n===== for(일반):index이용 =====");
        // 값을 변경 , 초기화 
        for(int i=0;i<alpha.length;i++)
        {
        	System.out.print(alpha[i]+" ");
        }
        System.out.println("\n====== API =========");
        Arrays.sort(alpha);
        System.out.println(Arrays.toString(alpha));
        for(int i=alpha.length-1;i>=0;i--)
        {
        	System.out.print(alpha[i]+" ");
        }
	}

}
