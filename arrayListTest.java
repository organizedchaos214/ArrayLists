/**
 *  arrayListTest.java - Practice on working with array lists data structures
 * 	Horstmann Book, Sections 1.08 (Basic Exception Handling), 1.11 (Array Lists and Linked Lists)
 */

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class arrayListTest 
	{
	public static ArrayList<String> countries = new ArrayList <String> ( );
	
	
	/*
	 * Returns the element in the position # that the user specifies:
	 */
	public static void getArrayListElement ( )
		{
		int input;
		
		try
			{
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner (System.in);
			
			System.out.println("\nEnter the position you would like to view ArrayList contents of: ");
			
			input = scanner.nextInt ( );
			
			String country = countries.get(input);

			
			System.out.println("The element in position " + input + " is: " + country);
			}
		
		catch (IndexOutOfBoundsException e)
			{
			System.out.println("Index Error: The ArrayList is of size: " + countries.size( ) + " ...starting from index 0"); 
			}
		
		catch (InputMismatchException i)
			{
			System.out.println("Input Error: The position value must be numerical (integer)");
			}

		}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) 
		{
		//insert into next available list position:
		countries.add ("Brazil");
		countries.add ("Panama");
		countries.add ("Belize");
		countries.add ("Jamaica");
				
		//inserts into specific list position (2):
		countries.add (2,"Cuba");		
				
		System.out.println("The countries in the ArrayList are: \n" + countries);
		
		arrayListTest.getArrayListElement ( );
		}

	}
