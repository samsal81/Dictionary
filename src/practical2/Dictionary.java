package practical2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/*Practical 2: 
There is a file containing a word and its possible meanings (like a Dictionary). The contents of the file look like this: 

Apple — a fruit, a tech firm 
Table — an object, contains rows and columns when used in context of computers 
Orange — a fruit 

Given a path to the file, do the following: 

a) Create a method called doesFileExist(String path) which takes the path of the file and tells the user if the file exists at that path or not. 
Assume all paths are relative to your project structure. If the file does not exist, catch the requisite exception. 

b) Read each word and its possible meanings and print them out. Your output should look like this: 
Word 1 
Meaning 1 
Meaning 2 

Word2 
Meaning1
Meaning2 

Use appropriate data structures wherever necessary. 
*/
public class Dictionary {

	public static void main(String[] args) throws FileNotFoundException {

		File dictionary = doesFileExist("./src/Dictionary.txt");
		
		System.out.println("--------------------");
		
		Scanner reader = new Scanner(dictionary);
		
		String newline = System.getProperty("line.separator");

		while (reader.hasNextLine()) {

			try {
				if (reader.hasNext("—") || reader.hasNext(",") || reader.hasNext(".")) {
					
					System.out.println(reader.next().replace("—", "").replace(",", "").replace(".", newline));
				}
				if (reader.hasNext("a")) {
					
					System.out.print(reader.next() + " ");
					
				} else {
					
					System.out.print(reader.next() + " ");
					
				}
			} catch (NoSuchElementException e) {

			}
		}
	}

	public static File doesFileExist(String path) {
		
		File file = new File(path);

		if (file.exists()) {
			
			System.out.println("File exists!");
			
		} else {
			
			System.out.println("File does not exist!");
			
		}
		
		return file;
	}

}
