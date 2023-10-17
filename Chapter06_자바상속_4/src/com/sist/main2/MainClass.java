package com.sist.main2;
import java.util.*;
public class MainClass {
    // I i=new A()
	// 데이터형 => 데이터형을 동일하게 만든다 (상속)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("클래스 선택:");
        int select=scan.nextInt();
        I[] i={null,new A(),new B(),new C(),new D(),new E()};
        i[select].execute();
        /*if(select==1)
        {
        	A a=new A();
        	a.execute();
        }
        if(select==2)
        {
        	B a=new B();
        	a.execute();
        }
        if(select==3)
        {
        	C a=new C();
        	a.execute();
        }
        if(select==4)
        {
        	D a=new D();
        	a.execute();
        }
        if(select==5)
        {
        	E  a=new E();
        	a.execute();
        }*/
	}

}