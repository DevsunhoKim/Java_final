// 5명의 학생의 국어점수를 받아서 등수를 출력하는 프로그램 작성
import java.util.*;
public class 배열정리문제_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] kor=new int[5];
        int[] rank=new int[5];
        
        // 국어 점수 등록 
        for(int i=0;i<kor.length;i++)
        {
        	kor[i]=(int)(Math.random()*50)+50;
        }
        System.out.println("국어 점수 출력");
        System.out.println(Arrays.toString(kor));
        // 등수 구하기 
        for(int i=0;i<rank.length;i++)
        {
        	rank[i]=1;
        	for(int j=0;j<kor.length;j++)
        	{
        		if(kor[i]<kor[j])
        		{
        			rank[i]++;
        		}
        	}
        }
        // 결과 출력 
        for(int i=0;i<kor.length;i++)
        {
        	System.out.println(kor[i]+" "+rank[i]);
        }
	}

}
