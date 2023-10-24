package com.sist.lib;

import java.util.StringTokenizer;

/*
 *  StringTokenizer
 */
public class MainClass_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="red|green|blue|black|white|yellow|pink|cyan|magenta";
		
		StringTokenizer st=new StringTokenizer(data,"|");
		/*
		System.out.println("컬러 갯수:"+st.countTokens());
		String color1=st.nextToken();
		String color2=st.nextToken();
		String color3=st.nextToken();
		
		System.out.println(color1);
		System.out.println(color2);
		System.out.println(color3);
		//st.nextToken() ==> 갯수를 초과하면 오류 발생
		 * */
		System.out.println("컬러 갯수:"+st.countTokens());
		while(st.hasMoreTokens())
		{
			System.out.print(st.nextToken()+" ");
		}
		/*
		 * hasMoreToken
		 * 1) cursor
		 * ---------------------
		 *   => before First
		 * ---------------------
		 *  red =>st.nextToken()==> true
		 * ---------------------
		 *  green =>st.nextToken()==> true
		 * ---------------------
		 *  blue =>st.nextToken()==> true
		 * ---------------------
		 * => after Last ==> st.nextToken() ==> false
		 * ---------------------
		 */
		 
	}

}
