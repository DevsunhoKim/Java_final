
public class 메소드_매개변수전송법5 {
    static void swap(int[] arr)
    {
    	System.out.println("arr="+arr);
    	System.out.println("변경전:swap=>arr[0]="
            +arr[0]+",arr[1]="+arr[1]);
    	int temp=arr[0];
    	arr[0]=arr[1];
    	arr[1]=temp;
    	System.out.println("변경후:swap=>arr[0]="
    	    +arr[0]+",arr[1]="+arr[1]);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] temp= {10,20};
        System.out.println("temp="+temp);
        // 같은 주소 이용해서 같은 메모리를 제어 
        // temp=arr => temp별칭 arr
        // 기본형 : 값만 사용 , 배열 => 주소 
        // 배열에 대한 초기화 => 매개변수를 이용한다 
        System.out.println("변경전:main=>temp[0]="
                +temp[0]+",temp[1]="+temp[1]);
        swap(temp);
        System.out.println("변경후:main=>temp[0]="
                +temp[0]+",temp[1]="+temp[1]);
	}

}