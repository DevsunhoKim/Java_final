import java.util.*;
public class 배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr= {10,20,30,40,50};
        //         100,200,300
        // arr의 메모리에 있는 모든 내용을 copy해서 새로운 메모리에 저장 
        System.out.println(Arrays.toString(arr));
        //System.out.println(Arrays.toString(arr2));
        System.out.println("arr="+arr);
        //System.out.println("arr2="+arr2);
        // 깊은 복사 
        arr[0]=100;
        arr[1]=200;
        arr[2]=300;
        int[] arr2=arr.clone();
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        // clone => prototype 
        
	}

}
