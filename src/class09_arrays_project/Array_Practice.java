package class09_arrays_project;

public class Array_Practice {

	public static void main(String[] args) {
		//Requirement: store some salaries in an Array
		// 45.99, 40.00, 50.00, 60.50	
		double [] salaries;
		salaries = new double[6];		
		salaries[0]=45.99;
		salaries[1]=40.00;
		salaries[2]=50.00;
		salaries[3]=60.50;
		salaries[4]=70.50;
		salaries[5]=80.50;		
		System.out.println("Array Length: "+ salaries.length);			
//		//Fixed code
//		for (int i = 0; i < 5; i++) {
//			System.out.println("Salaries is : " + salaries[i]);
//		}
		
		//To make dynamic code
		for (int i = 0; i < salaries.length; i++) {
			System.out.format("Salaries is :%.2f \n" , salaries[i]);
			//System.out.format("The average is: %.3f", average);
		} 
		int[][] ages = new int[3][3];
		ages[0][0]=41;
		ages[0][1]=76;
		ages[0][2]=32;
		
		ages[1][0]=59;
		ages[1][1]=78;
		ages[1][2]=41;
		
		ages[2][0]=75;
		ages[2][1]=48;
		ages[2][2]=57;
		//ages[][]={(41,76,32),(59,78,41),(75,48,57)};
		//Fixed code
		for (int i = 0; i <=2; i++) {
			for (int j = 0; j <3; j++) {
				System.out.println("Ages for fixed code: "+ages[i][j]);
				//System.out.format("Ages for %.2", args));
			} 
		}
		
		System.out.println("Ages Length: "+ ages.length);
		//To make dynamic code
		for (int i = 0; i <= ages.length-1; i++) {
			for (int j = 0; j < ages[0].length; j++) {
				System.out.print(" "+ages[i][j]);
			} 
			System.out.println(); // it shows values like matrix
		}
		
	}

}
