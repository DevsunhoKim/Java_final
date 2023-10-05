/*
 *    학생 3명에 대한 성적 계산 
 *    ------
 *    1. 이름 
 *    2. 국어
 *    3. 영어
 *    4. 수학 
 *    5. 총점 
 *    6. 평균 
 *    ---------
 */
import java.util.Scanner;
public class 문자열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] names=new String[3];
        int[] kor=new int[3];
        int[] eng=new int[3];
        int[] math=new int[3];
        int[] total=new int[3];
        double[] avg=new double[3];
        
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<names.length;i++)
        {
        	System.out.print("이름 입력:");
        	names[i]=scan.next();
        	System.out.print("국어 입력:");
        	kor[i]=scan.nextInt();
        	System.out.print("영어 입력:");
        	eng[i]=scan.nextInt();
        	System.out.print("수학 입력:");
        	math[i]=scan.nextInt();
        	total[i]=kor[i]+eng[i]+math[i];
        	avg[i]=total[i]/3.0;
        }
        // 출력 
        for(int i=0;i<names.length;i++)
        {
        	System.out.printf("%-8s%-5d%-5d%-5d%-7d%-5.2f\n",
        			names[i],kor[i],eng[i],math[i],total[i],
        			avg[i]);
        }
	}

}
