
public class 제어문 {

	 public static void main(String[] args) {
	        for(int i=1; i<10; i++) {
	                for(int j=1; j<10; j++) {
	                    if(j==3) {
	                        System.out.println(i + " x " + j + " = " + i*j);
	                        break;
	                    }
	                    System.out.println(i + " x " + j + " = " + i*j);
	                }
	        }
	    }

}
