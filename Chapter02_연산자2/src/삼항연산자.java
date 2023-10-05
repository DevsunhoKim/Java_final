/*
 *    이항 => () + ()
 *    삼항 => () () ()
 *           (조건)?값1:값2
 *           -----
 *             true => 값1
 *             false => 값2
 *             
 *           int a=10;
 *           (a%2==0)?"짝수":"홀수"
 */
public class 삼항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=(int)(Math.random()*100)+1;//1~100
        System.out.println(a%2==0?"짝수":"홀수");
        // sex=1,3 남자 sex=2,4 여자 
        
        a=(int)(Math.random()*4)+1;
        System.out.println(a%2!=0?"남자":"여자");
	}

}






