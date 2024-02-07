package class09_arrays_project;

public class Prime_01 {

	public static void main(String[] args) {
//		1		
//		10
//		101
//		1010
//		10101
		for(int row=1; row<=5; row++) {		
			for (int col=1; col<=row; col++) {
				System.out.print(col%2);				
			}
			System.out.println();
//			}
//		}	
		// 
		//int n=97;
		//int coumt= 0;
//		A
//		BB
//		CCC
//		DDDD
//		EEEEE
		char ch = 'A';
		for(int row1=1; row1<=8; row1++, ch++) {				
			for(int col=1; col<=row1; col++) {
			  System.out.print(ch);	
			}
			//ch++;
			System.out.println();
			
		}
		
		
		}
	}

}
