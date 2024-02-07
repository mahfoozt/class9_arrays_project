package class09_arrays_project;

public class ArrayQuiz_01 {

	public static void main(String[] args) {

				byte age;
				age=45;
				age=56;
				System.out.println("age value " + age);
				age=34;
				System.out.println("now age value is " + age);
				
				System.out.println("My\nJava");
				
				int score = 0;
				System.out.println(score);
				score = score + 1;
			     
				System.out.println(score);
				score = score + 1;
				System.out.println(score);
				
				
				int [] num= {2,4,3};
				int sum=0;

				for (int i=0; i<=2; i++) {
					sum= sum + num[i];			
				}
				System.out.println("average is " + sum/3);
				
				//}
//			total elements of first array: 10
//			1 1 1 1 1 1 1 1 1 1 
//			total elements of second array: 5
//			2 2 2 2 2 
//			After assigning
//			total elements of second array: 10
//			1 1 1 1 1 1 1 1 1 1 	
		//Can you assign an Array of 100 elements to an array of 10 elements?
//			total elements of first array: 100
//			total elements of second array: 10
//			After assigning
//			total elements of second array: 100
//				here are 2 int type array data type. One is containing 10 elements,
//				and another one is containing 5 elements. 
//				Can you assign the array of 10 elements to the array of 5 elements.
//				//we can copy an array to another array by the copyOf() method of array
		//	
				//int[] a= {1,1,1,1,1,1,1,1,1,1};
				//int[] b= {2,2,2,2,2};
				int[] a= {1,1,1,1,1,1,1,1,1,1};
				int[] b= {2,2,2,2,2};
				System.out.println("total elements of first array:\t" +a.length);
				for (int i=0; i<a.length; i++) {
					System.out.print(a[i]+" ");			
					}
				System.out.println();
				
				System.out.println("total elements of Second array:\t" +b.length);
				for (int j=0; j<b.length; j++) {
					System.out.print(b[j]+" "); 
					}
				System.out.println();
				b=a;
				System.out.println("After assigning\ntotal elements of Second array:\t" +b.length);
				for (int j=0; j<b.length; j++) {
					System.out.print(b[j]+" ");
					     
					}
				System.out.println();
				
				int [] d;
				d= new int [100];
				System.out.println("total elements of first array:\t" +d.length);
				int [] d1;
				d1= new int[10];
				System.out.println("total elements of second array:\t" +d1.length);
				System.out.println();
				d1=d;
				System.out.println("After assigning\ntotal elements of Second array:\t" +d1.length);
			
				System.out.println();
				
		//	
//				int [] b= {2,2,2,2,2};
//				
				//int [] n1 =Arrays.copyOf (b, 9);
				//n[5]=1;
				//n[6]=1;	
				//System.out.println(A[9])
				//System.out.println(B[4]);
				
		//	
//				int [] b = {1,2,3};
//				int [] n =Arrays.copyOf(b, 5); 
//				n[3]=4;
//				n[4]=5;		
//				for (int i=0; i<n.length; i++) {
//					System.out.print(n[i]);			
//				}
				
//				Write a code which is average an array of values.
//				[hints:  2,4,3 values average 2+4+3=9/3=3]	
//				int [] num= {2,4,3};
//				int sum=0;
		//
//				for (int i=0; i<=2; i++) {
//					sum= sum + num[i];			
//				}
//				System.out.println("average is " + sum/3);
//				
//				
//				*/
				}
			
			

		


	

}
