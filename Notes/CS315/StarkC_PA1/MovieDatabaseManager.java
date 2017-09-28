/**
 * This class manages the MovieList to produce a nice front-end to the movie database.
 * 
 * @author Stansbury and yournamehere
 */

import java.io.*;

public class MovieDatabaseManager {

	//MovieList mList; //You must create an instance of this
	MovieList mList;
	
	/**
	 * Default constructor - creates a database with a list that is empty
	 */
	public MovieDatabaseManager()
	{
		//Creates a new instance of the list
		mList = new MovieList();
	}
	
	/**
	 * Advanced constructor - creates a database with a list of values from an input file
	 * @param file - the input file.
	 */
	public MovieDatabaseManager(String file)
	{
		this();
		parseInputFile(file); //populates database with list of movies
	}
	
	/**
	 * Parses the input file so that you can add all of items found in the list in alphabetical order by title.
	 */
	private void parseInputFile(String file)
	{
		//Create a file input stream
		Movie m;
		String instr;
		try {
			//Create input reader
			BufferedReader in = new BufferedReader(new FileReader(file));
			while (in.ready()) {
				instr = in.readLine();
				
				//Try to parse the movie using the appropriate movie constructor.  If it fails, an exception is caught
				try {
					m = new Movie(instr);
					
					////////////////////////////////////////////////////
					//Add code to insert m here into your list
					////////////////////////////////////////////////////
					
				} catch (InvalidMovieException e) {
					System.out.println("Invalid movie string " + instr + " in file " + file);
				}

			}
		} catch (IOException io) {
			System.err.println("Error in Parsing file.");
			io.printStackTrace();	
		}
	}
	
	
	
	/**
	 * Provides console I/O to the program for user interaction.
	 */
	public void consoleIO()
	{
		
		//Prompts to the user
		System.out.println("Please Choose from the Following:");
		System.out.println("\t1. List Movies Ascending");
		System.out.println("\t2. List Movies Descending");
		System.out.println("\t3. List Movies for Year");		
		System.out.println("\t4. List Movies Available");
		System.out.println("\t5. Add Movie");
		System.out.println("\t6. Delete Movie");
		System.out.println("\t6. Print Movie Details");
		System.out.print(">> ");
		
		//Creates a buffer to read from the console.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//I/O code in a big try/catch to ensure no exceptions occur.
		try {
			String choice = br.readLine();
			
			//Given the choice, call the appropriate function calls.
			if (choice.equals("1")) {
				//////////////////////////////////////////////////////
				//  Call list function that prints in ascending order
				//////////////////////////////////////////////////////

			}
			else if (choice.equals("2")) {
				//////////////////////////////////////////////////////
				//  Call list function that prints in descending order
				//////////////////////////////////////////////////////				
			}
			else if (choice.equals("3")) {
				System.out.print("What Year? >>");
				int year = Integer.parseInt(br.readLine());
				
				//////////////////////////////////////////////////////
				//  Call list function that prints all movies with
				//  matching year.
				//////////////////////////////////////////////////////
			}
			else if (choice.equals("4")) {
				//////////////////////////////////////////////////////
				//  Call list function that prints all items with
				//  quantity greater than zero
				//////////////////////////////////////////////////////
			}
			else if (choice.equals("5")) {
				System.out.print("Title >> ");
				String title = br.readLine();
				
				System.out.print("Director >> ");
				String director = br.readLine();
				
				System.out.print("Year >> ");
				int year = Integer.parseInt(br.readLine());
				System.out.print("Quantity Available >> ");
				int quantity = Integer.parseInt(br.readLine());

				Movie newM = new Movie(title, director, year, quantity);
				System.out.print(newM);
				
				//////////////////////////////////////////////////////
				//  Call list method to add item to the list
				//  in alphabetical order
				//////////////////////////////////////////////////////

				
			}
			else if (choice.equals("6")) {
				System.out.print("Title >> ");
				String title = br.readLine();
				
				//////////////////////////////////////////////////////
				//  Call list method to delete an item give movie
				//  title
				//////////////////////////////////////////////////////
				
			}
			else if (choice.equals("7")) {
				System.out.print("Title >> ");
				String title = br.readLine();
				
				//////////////////////////////////////////////////////
				//  Call list method to retrieve and print a movie
				//  given the title.  An appopriate "not found" message
				//  should be provided if it is not found in the list.
				//////////////////////////////////////////////////////
				
			}
			else {
				System.out.println("Invalid Input:  Try again");
			}
			
		} catch (IOException e) {
			System.out.println("Invalid Input:  Try again");
		}
		
	}
	
	
	public static void main(String [] args)
	{
		
		//Create manager and have it populate with input file content.
		MovieDatabaseManager mdm = new MovieDatabaseManager("input.txt");	//UPDATE WITH DIRECT PATH TO YOUR INPUT FILE
		
		//Console runs in an infinite loop.
		while (true) {
			mdm.consoleIO();
		}
		
	}
	
}
