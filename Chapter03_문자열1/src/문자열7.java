import java.util.Scanner;
// startsWith,endsWith,contains => 검색기,자동완성기
public class 문자열7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] data= {
        		"Java와 JSP",
        		"Java와 Oracle",
        		"Oracle Programming",
        		"JQuery AND AJAX",
        		"Spring AND Java"
        };
        Scanner scan=new Scanner(System.in);
        System.out.print("검색어 입력:");
        String findData=scan.nextLine();
        System.out.println(findData);
        for(int i=0;i<data.length;i++)
        {
        	if(data[i].contains(findData))
        	//if(data[i].endsWith(findData))
        	//if(data[i].startsWith(findData))
        	{
        		try
        		{
        			Thread.sleep(1000);
        		}catch(Exception ex) {}
        		System.out.println(data[i]);
        	}
        }
	}

}
