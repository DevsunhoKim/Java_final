/*
 *    정수 , 실수 , 문자 비교시에 많이 사용 ==> boolean
 *    비교연산자 
 *      == (=)  ===> eq
 *      != (<>,^=) ==> ne
 *      <   lt
 *      >   gt
 *      <=  le
 *      >=  ge
 */
public class 비교연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=(int)(Math.random()*3)+1; // 1,2,3
        int b=(int)(Math.random()*3)+1;
        
//        System.out.println("a="+a+",b="+b);
//        System.out.println("a==b:"+(a==b));
//        System.out.println("a!=b:"+(a!=b));
//        System.out.println("a<b:"+(a<b));
//        System.out.println("a>b:"+(a>b));
//        System.out.println("a<=b:"+(a<=b));
//        System.out.println("a>=b:"+(a>=b));
        
        char c=(char)((Math.random()*3)+65); // A B C
        char d=(char)((Math.random()*3)+65);
        System.out.println("c="+c+",d="+d);
        // 제어문에서 가장 많이 사용되는 연산자 (조건문,반복문)
//        System.out.println("c==d:"+(c==d));
//        System.out.println("c!=d:"+(c!=d));
//        System.out.println("c<d:"+(c<d));
//        System.out.println("c>d:"+(c>d));
//        System.out.println("c<=d:"+(c<=d));
//        System.out.println("c>=d:"+(c>=d));
	}

}




