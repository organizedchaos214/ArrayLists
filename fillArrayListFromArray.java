/**
 * @author: Shane Anderson
 *
 *The following program will insert elements from an array into an Array List.
 *
 *Time Complexity is O(n) due to the array of size n. The insert into the array
 *list is O(1).
 */

import java.util.ArrayList;

public class fillArrayListFromArray 
	{
	static String myArray [ ] = {"a","b","c","d"};
	
	
	static ArrayList <String> myArrayList = new ArrayList < >( );
	
	/*
	 * Fills the ArrayList with contents from myArray
	 */
	public static void fill (String [ ] myArray )
		{
		int i;
		
		for (i = 0; i < myArray.length; i++)
			{
			String name = myArray [i];
			
			myArrayList.add(name);
			}
		
		System.out.println ("ArrayList: " + myArrayList);
		}
	
	//main method:
	public static void main (String [ ] args)
		{
		fillArrayListFromArray.fill (myArray);
		}
	}
