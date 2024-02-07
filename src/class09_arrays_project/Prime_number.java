package class09_arrays_project;

public class Prime_number {

	public static void main(String[] args) {	
		//Prime number
		int num = 89;
				String s = "prime number";
				
				for(int i=2; i<num; i++) {
					
					if(num%i == 0) {
						s = "not a prime number";
						break;
					}						
				}											
				if (s == "prime number") {
					System.out.println(num +" prime number");
				}
				
				if (s == "not a prime number") {
					System.out.println(num + " not a prime number");
				}
//---------------------------------
//				for(int j=1; j<=3; j++) {
//					for(int i=1; i<=10; i++) {
//						System.out.println(j+"x"+i+"="+j*i);
//					}
//					if(j==3)continue;
//					System.out.println("------------------");
//				}

	}

}
