package com.sist.main2;
class Super
{
	
}
class Sub extends Super
{
	
}
public class MainClass4 {
// NullPointException
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super s=new Sub();
		//Sub ss=(Sub)new Super(); // 오류 ClassCastException
		Sub ss=(Sub)s;
		
		Super sss=new Super();
		// Sub ssss=(Sub)sss;   // 오류
	}

}
