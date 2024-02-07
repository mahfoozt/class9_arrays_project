package class09_arrays_project;

public class Quiz_29 {

	public static void main(String[] args) {
		//System.out.format("The average is: %.3f", average);
				// MultiDimensional Array Write a program which is print :
//				45612345
//				85434521
//				34734589
//				67945432
//				98765689
//				4 5 6 7 8 
//				8 5 4 3 9 
//				3 4 7 6 7 
//				456786
//				854398
//				347676
//				10 20 30 40 50
//				15 25 35 45 55
//				65 75 85 95 100
//				Write a program which is print :
//					456
//					854
//					347
//					679
//				4532
//				8740
//				3176
//				9876
		//int[][] num= {{4,5,6},{8,5,4},{3,4,7},{6,7,9}};
		//int[][] num= {{4,5,3,2},{8,7,4,0},{3,1,7,6},{9,8,7,6}};
			int[][] num= {{4,5,6,1,2,3,4,5},{8,5,4,3,4,5,2,1},{3,4,7,3,4,5,8,9},{6,7,9,4,5,4,3,2},{9,8,7,6,5,6,8,9}};
				for (int r=0; r<=4; r++) {//outer loop
		        	for(int c=0; c<=7; c++) {//inner loop     		
		        		System.out.print(num[r][c]);
		        	}System.out.println();
				}
				//System.out.format("The average is: %.3f", average);
				//int[][] num= {{4,5,6,7,8},{8,5,4,3,9},{3,4,7,6,7}};
				//int[][] num= {{4,5,6,7,8,6},{8,5,4,3,9,8},{3,4,7,6,7,6}};
				//int[][] num= {{10,20,30,40,50},{15,25,35,45,55},{65,75,85,95,100}};
				
				//System.out.println("The value : "+num[0][1]);
				
				
				//System.out.println("total rows: "+num.length);
				//System.out.println("total columns: "+num[1].length);
			

//				for (int r=0; r<=2; r++) {//outer loop
//			        	for(int c=0; c<=4; c++) {//inner loop
//			        		
//			        		System.out.print(num[r][c]);
//			        	}
//			        	System.out.println();}

	}

}
