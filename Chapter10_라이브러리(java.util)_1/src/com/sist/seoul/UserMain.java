package com.sist.seoul;



public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeoulManager s=new SeoulManager(); 
        Seoul[] seoul=s.SeoulAllData();
        for(Seoul ss:seoul)
        {
        	System.out.println(ss.getRank()+"."+ss.getAddr());
        }
	}

}
