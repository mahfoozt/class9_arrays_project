package class09_arrays_project;

public class If_Else_Condition {

	public static void main(String[] args) {
		int num = 10;
		if (num > 10)
			System.out.println("This number is greater than 10");
		if (num <= 10)
			System.out.println("\"This number is less than or equal to 10");

		int n=97;
		int count=0;
		for (int i=1; i<=n; i++) {
			if(n%1==0) {
				count++;
			}
			if (count==2) {
				System.out.println("Prime number");			
			} else
				System.out.println("not a prime number");
			
			
		}
	}

}
