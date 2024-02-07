package class09_arrays_project;

public class Condtion_if {

	public static void main(String[] args) {
//		char x='A';
//		for(int i=0; i<=25; i++) {
//			System.out.print(x+++" ");
//			
//		}
//		System.out.println();
//		int Week=1;
//		System.out.println("Week:"+Week);
//		for (int i=1; i<=7; i++) {
//			System.out.println("Day:"+i);
//			
//		}
		try {
			 int a=0;
			 int b=0;
			 b=b/a;
			System.out.println("Hello "+1/0);
			}
		catch(ArithmeticException e){
			System.out.println("Divided by zero is not possible:  ");
		}
		finally
			{
			System.out.println("-----------World------------");
			for(int row=1; row<=5; row++) {		
				for (int col=1; col<=row; col++) {
					System.out.print(col%2);				
				}
				System.out.println();
			}
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
