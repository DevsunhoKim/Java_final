/*
 * 
 *     int a=10;
 *     int b = ++a; // b에 대입전에 a값을 1개 증가 
 *             ---
 *              1
 *         -------
 *            2 // 증가된 값을 대입한다 
 *     int a=10;
 *     int b=a++
 *         ---
 *          1
 *            --
 *             2
 */
public class 문제8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10, num2=10;
	    System.out.printf("%d \n", ++num1);// 증가후에 출력
	    // 11
	    System.out.printf("%d \n", num1);
	    // 11
	    System.out.printf("%d \n", num2++);//출력후에 증가
	    // 10
	    System.out.printf("%d \n", num2);
	    // 11

	}

}
