/*
 * 100점 만점으로 성적을 입력 받아 90~100이면 A,80~89이면 B,70~79이면 C, 60~69이면 D,
   60점 이하면 F를 출력하라 (다중 if 사용)

 */
public class 문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int kor=(int)(Math.random()*51)+50;//0~100
        int eng=(int)(Math.random()*51)+50;
        int math=(int)(Math.random()*51)+50;
        System.out.println("국어 점수:"+kor);
        System.out.println("영어 점수:"+eng);
        System.out.println("수학 점수:"+math);
        System.out.println("총점:"+(kor+eng+math));
        double avg=(kor+eng+math)/3.0;
        System.out.printf("평균:%.2f\n",avg);
        
        //학점 
        char score='A';
        if(avg>=90)
        	score='A';
        else if(avg>=80)
        	score='B';
        else if(avg>=70)
        	score='C';
        else if(avg>=60)
        	score='D';
        else
        	score='F';
        System.out.println("학점:"+score+"학점");
	}

}
