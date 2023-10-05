// &&(직렬연산자) ||(병렬연산자)
// AND         OR
/*
 *   사용처 
 *   -----
 *    && => 기간이나 범위안에 포함 
 *    || => 기간이나 범위가 아닌 경우 
 *   사용법
 *   -----
 *     ==> 조건에 사용할 수 있는 연산자 (부정연산자 , 비교연산자)
 *     (조건) && (조건)    (조건) || (조건)
 *     -----    -----
 *       |        |
 *       ----------
 *           |
 *         결과값 
 *         
 *     경우의 수         &&         ||
 *     true true  ===> true  ==> true
 *     true false ===> false  ==> true
 *     false true ===> false  ==> true
 *     false false ===> false ==> false
 *     
 *     &&,||는 효율적인 연산을 수행한다 
 *     --------------------------
 *     && => false면 뒤에 있는 조건은 수행하지 않는다
 *     || => true면 뒤에 있는 조건은 수행하지 않는다        
 *     
 */
public class 논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*int a=10;
        int b=9;
        
        boolean bCheck=a<b || ++b==a;
        System.out.println(bCheck);
        System.out.println("b="+b);*/
		
		int a=10;
		int b=21;
		
		boolean bCheck=(a%2==0) && (b%2==0);
		/*
		 *      조건  &&   조건 
		 *     true       true   ===> true
		 *     true       false  ===> false
		 *     false      true   ===> false
		 *     false      false  ===> false
		 *     
		 *      조건  ||   조건 
		 *     true       true   ===> true
		 *     true       false  ===> true
		 *     false      true   ===> true
		 *     false      false  ===> false
		 */
		bCheck=(a%2==0) || (b%2==0);
        
	}

}
