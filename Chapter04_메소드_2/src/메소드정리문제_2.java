// 1~10까지 합을 구하는 메소드 구현
// ---------------- 사용자 요청하는 값은 없다 (매개변수(X))
// 메소드 자체에서 출력 => 결과값 => main()
// 리턴형 
public class 메소드정리문제_2 {
	// 리턴형(O) , 매개변수(X)
    static int sum()
    {
    	int hap=0;
    	for(int i=1;i<=10;i++)
    	{
    		hap+=i;
    	}
    	return hap; // 자체 출력 (void)
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int hap=sum();
        System.out.println("hap:"+hap);
	}

}
