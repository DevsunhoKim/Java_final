import java.util.*;
public class 메소드_5_메소드변경 {
    static void userInput(int[] kor,int[] eng,int[] math,
    		int[] total,double[] avg)
    {
    	Scanner scan=new Scanner(System.in);
        for(int i=0;i<kor.length;i++)
        {
        	System.out.print((i+1)+"번째 국어 점수:");
        	kor[i]=scan.nextInt();
        	
        	System.out.print((i+1)+"번째 영어 점수:");
        	eng[i]=scan.nextInt();
        	
        	System.out.print((i+1)+"번째 수학 점수:");
        	math[i]=scan.nextInt();
        	
        	total[i]=kor[i]+eng[i]+math[i];
        	avg[i]=total[i]/3.0;
        }
    }
    static void scoreChonge(double[] avg,char[] score)
    {
    	for(int i=0;i<score.length;i++)
        {
        	switch((int)(avg[i]/10.0))
        	{
        	case 10:
        	case 9:
        		score[i]='A';
        		break;
        	case 8:
        		score[i]='B';
        		break;
        	case 7:
        		score[i]='C';
        		break;
        	case 6:
        		score[i]='D';
        		break;
        	default:
        		score[i]='F';
        	}
        }
    }
    static void rankChange(int[] total,int[] rank)
    {
    	for(int i=0;i<3;i++)
        {
        	rank[i]=1;
        	for(int j=0;j<3;j++)
        	{
        		if(total[i]<total[j])
        		{
        			rank[i]++;
        		}
        	}
        }
    }
    static void print(int[] kor,int[] eng,int[] math,
    		int[] total,double[] avg,char[] score,
    		int[] rank)
    {
    	for(int i=0;i<3;i++)
        {
        	System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%-5c%-5d\n",
        			kor[i],eng[i],math[i],total[i],avg[i],score[i],rank[i]);
        }
    }
    static void process()
    {
    	int[] kor=new int[3];
        int[] eng=new int[3];
        int[] math=new int[3];
        int[] total=new int[3];
        int[] rank=new int[3];
        char[] score=new char[3];
        double[] avg=new double[3];
        userInput(kor, eng, math, total, avg);
        scoreChonge(avg, score);
        rankChange(total, rank);
        print(kor, eng, math, total, avg, score, rank);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        process();
	}

}