package com.sist.manager;
// 패키지가 다르면 => 반드시 클래스 사용시에 import

public class Student {
	//default (접근지정어) => 같은 패키지에서는 사용이 가능
	// 다른 패키지에서는 사용이 불가능
	// public => 모든 패키지에서 접근이 가능
	// 단점 => 모든 데이터가 노출 =
	public int hakbun;
	public String name;
	public int kor,eng,math;
}
