import java.util.*;
public class 문자열_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String location=
        		DataCollection.fileReadData("seoul_location.txt");
        String nature=
        		DataCollection.fileReadData("seoul_nature.txt");
        //System.out.println(location);
        //System.out.println("===========================");
        //System.out.println(nature);
        String[] seoul=location.split("\n");
        Scanner scan=new Scanner(System.in);
        while(true)
        {
        	System.out.println("===== 메뉴 =====");
        	System.out.println("1. 목록 출력");
        	System.out.println("2. 상세보기");
        	System.out.println("3. 명소명 검색");
        	System.out.println("4. 지역별 검색");
        	System.out.println("9. 프로그램 종료");
        	System.out.println("===============");
        	System.out.print("메뉴 선택:");
        	int menu=scan.nextInt();
        	if(menu==9)
        	{
        		System.out.println("프로그램 종료합니다");
        		break;// while,for종료시에 사용 
        	}
        	else if(menu==1)
        	{
        		System.out.println("===== 명소 전체 목록 =====");
        		for(String loc:seoul)
        		{
        			String[] ss=loc.split("\\|");
        			System.out.println(ss[0]+"."+ss[1]);
        		}
        	}
        	else if(menu==2)
        	{
        		System.out.println("===== 명소 상세 보기 =====");
        		System.out.print("상세볼 명소 번호 입력:");
        		int index=scan.nextInt();
        		String detail=seoul[index-1];
        		String[] ss=detail.split("\\|");
        		System.out.println("번호:"+ss[0]);
        		System.out.println("명소명:"+ss[1]);
        		System.out.println("설명:"+ss[2]);
        		System.out.println("주소:"+ss[3]);
        	}
        	else if(menu==3)
        	{
        		System.out.println("===== 명소 검색 =====");
        		System.out.print("검색어 입력:");
        		String loc=scan.next();
        		for(String f:seoul)
        		{
        			String[] ss=f.split("\\|");
        			if(ss[1].contains(loc))
        			{
        				System.out.println(ss[1]);
        			}
        		}
        	}
        	else if(menu==4)
        	{
        		System.out.println("===== 지역별 검색 =====");
        		System.out.print("주소 입력:");
        		String loc=scan.next();
        		for(String f:seoul)
        		{
        			String[] ss=f.split("\\|");
        			if(ss[3].contains(loc))
        			{
        				System.out.println(ss[1]+"("+ss[3]+")");
        			}
        		}
        	}
        }
	}
	

}
