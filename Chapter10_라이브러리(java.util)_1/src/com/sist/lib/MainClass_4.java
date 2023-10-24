package com.sist.lib;
/*
 *  ***Random : 난수 발생
 *   => nextInt(int bound) ==> 0~bound-1 발생
 *   
 *  326p
 *   
 *   Arrays : 배열과 관련된 기능 제어
 *   ------
 *     1) ***sort => 정렬
 *        ==> ORDER BY no DESC(ASC) => 걸리는 시간이 오래 걸린다
 *            ==> index (최적화) ***
 *     2) copyOf => 다른 배열에서 복사
 *     3) toString() => 배열값 출력
 *     
 *  328p
 *   
 *   StringTokenizer
 *   	==> 문자열 분리
 *   	split() ==> 정규식을 이용 => 쉽게 제적
 *   	==> 네트워크 / 빅데이터 / 웹
 *      ==> 기능(메소드)
 *          1) countToken() : 분리된 데이터 갯수
 *          2) nextToken() : 실제 분리된 데이터 읽기
 *          3) hasMoreToken() : 분리된 수만큼 루프 수행
 *    
 */
import java.util.*;
public class MainClass_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[7];
		Random r=new Random();
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=r.nextInt(100)+1;
		}
		System.out.println("===== 정렬전 =====");
		System.out.println(Arrays.toString(arr));
		System.out.println("===== 정렬후 =====");
		Arrays.sort(arr); //ASC (오름차순)
		System.out.println(Arrays.toString(arr));
		//가변 배열
		//작은 배열을 만들떄 사용
		int[] subArr=Arrays.copyOf(arr, 3);
		System.out.println(Arrays.toString(subArr));
		// 큰 배열을 만들 때 사용
		int[] subArr2=Arrays.copyOf(arr, 10); // 뒷번호 3개는 0으로 초기화
		/*
		 * int 0
		 * double 0.0
		 * 클래스 null
		 * boolean false
		 */
		System.out.println(Arrays.toString(subArr2));
	}

}
