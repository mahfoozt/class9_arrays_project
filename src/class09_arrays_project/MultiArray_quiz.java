package class09_arrays_project;

public class MultiArray_quiz {

	public static void main(String[] args) {
		// MultiDimensional Array Write a program which is print :
//		4 5 6 7 8 
//		8 5 4 3 9 
//		3 4 7 6 7 
//		
		int h = 3;

		int w = 5;

		System.out.print ( h ) ;

		System.out.print ( w ) ;

		h = w;

		w = h;
                       
		System.out.print ( h ) ;

		System.out.print( w ) ;
		
		int ages[][];
		ages = new int [4][3];
		
		ages[0][0] =34;
		ages[0][1] =56;
		ages[0][2] =71;
		
		ages[1][0] = 67;
        ages[1][1] = 63;
        ages[1][2] = 70;
        
        ages[2][0] = 23;
        ages[2][1] = 29;
        ages[2][2] = 31;
        
        ages[3][0] = 17;
        ages[3][1] = 43;
        ages[3][2] = 19;
        
        for(int r=0; r<=3; r++) {//outer loop
        	for(int c=0; c<=2; c++) {//inner loop
        		
        		System.out.print(ages[r][c]);
        	}
        	System.out.println();
        }
        double [] number ={10.2, 23.5, 34.2, 34.5};
        double result =0.0;
        
        for(int i=0; i<=3; i++) {
        	result = result + number[i];
        	System.out.print(result + "   ");     	
        }
        System.out.println();
        System.out.println("The average is " + result/4);

	}

}
