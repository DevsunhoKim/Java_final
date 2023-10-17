package com.sist.main2;

class Super
{
	
}
class Sub extends Super
{
	
}
// NullPointerException, ClassCastException
public class MainClass4 {
	static String str; // null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super s=new Sub();
		// Sub ss=(Sub)new Super(); // ClassCastException
		// Sub ss=(Sub)s; // 형변환. 항상 먼저 객체를 생성해야 함(s)
		char c=str.charAt(0); // NullPointerException
		// Super sss=new Super();
		// Sub ssss=(Sub)sss;
	}

}