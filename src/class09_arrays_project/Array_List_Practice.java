package class09_arrays_project;

import java.util.ArrayList;
import java.util.Iterator;


public class Array_List_Practice {

	public static void main(String[] args) {
		// Q: What is Iterator in Java
		// Iterator helps to browse any list
		ArrayList<String> cars= new ArrayList<>();
		
		cars.add("Volvo");
		cars.add("Rav_4");
		cars.add("NissanMaxima");
		cars.add("Honda");
		cars.add("BMW");
		cars.add("Lexus");
		cars.add("Mercedes");
		cars.add("Ford");
		cars.add("Mazda");
		cars.add("Subaru");
		cars.add("Mercedes1");
		cars.add("Ford1");
		cars.add("Mazda1");
		cars.add("Subaru1");
		      
		System.out.println(cars);
		//Get the iterator
		Iterator<String> It=cars.iterator();
		System.out.println();
		//print the String iterator
		while(It.hasNext()) {
			System.out.println(It.next());
		}
		
		
		
		

	}

}
