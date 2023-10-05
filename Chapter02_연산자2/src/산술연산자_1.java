// % => 배수 ==> 화폐매수 구하기 
public class 산술연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=10;
        int b=3;
        
        System.out.println(a+"%"+b+"="+(a%b));
        System.out.println(-a+"%"+b+"="+(-a%b));
        System.out.println(a+"%"+-b+"="+(a%-b));
        System.out.println(-a+"%"+-b+"="+(-a%-b));
        
        System.out.println("====================");
        int c=369;
        // 369/100 => 3
        // 369%100  ==> 69/10 => 6
        // 369%10
        int 백단위=c/100;
        int 십단위=(c%100)/10;
        int 단단위=c%10;
        // 백단위 : 3 , 십단위 : 6 , 단단위 : 9 
        System.out.println("백단위:"+백단위+",십단위:"+십단위
        		+",단단위:"+단단위);
        
        // "합계:"+(90+90+90)
        // --------- "합계:90"
        //           -------- +90
        //   "합계:9090" ==> "합계:909090"
        
        
	}

}
