
public class 선택문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char score=(char)((Math.random()*6)+65);
        // A B C D E F
        System.out.println("score="+score);
        switch(score)
        {
        default:
        	System.out.println("존재하지 않는 등급입니다!!");
        	break;
        case 'A':
        	System.out.println("A등급은 90~100사이의 점수입니다!!");
        	break;
        case 'B':
        	System.out.println("A등급은 80~89사이의 점수입니다!!");
        	break;
        case 'C':
        	System.out.println("A등급은 70~79사이의 점수입니다!!");
        	break;
        case 'D':
        	System.out.println("A등급은 60~69사이의 점수입니다!!");
        	break;
        }
	}

}
