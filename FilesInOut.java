import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.lang.Number;

/**
 * 
 * CSCU9T4 Java strings and files exercise.
 *
 */
public class FilesInOut {

    public static void main(String[] args)
    {
        
        // Construct Scanner and PrinterWriter objects for reading and writing
        
    	
    	//File inputFile = new File("input.txt");
    	//File outputFile = new File ("formatted.txt");
    	
    	Scanner in = null;
    	PrintWriter out = null;
    	try {
    		String inputFileName = args[0];
    		File inputFile = new File(inputFileName);
    		in = new Scanner(inputFile);
    	} catch (IOException e) {
    		System.err.println("IOException: " + e.getMessage () + " not found.");
    	}
    	
    	try {
        	String outputFileName = args[1];
        	File outputFile = new File (outputFileName);
            out = new PrintWriter(outputFile);
    	} catch (FileNotFoundException e) {
    		System.err.println("FileNotFoundException: " + e.getMessage() + 
    				" not openable.");
    		System.exit(0);
    	}
        
        
        // Read the input and write the output
        
        
        while (in.hasNextLine())
        {
        	String input = in.nextLine();
        	int i = 0;
        	while (!Character.isDigit(input.charAt(i))) {
        		i++;
        	}
        	String personName = input.substring(0,i);
        	String birthDate = input.substring(i);
        	personName = personName.trim();
        	personName = Formatter.titleCaseConverter(personName);
        	birthDate = birthDate.trim();
            birthDate = Formatter.dateConverter(birthDate);
            
            out.printf("%-19s %10s\n", personName, birthDate);
        }
        in.close();
        out.close();
        
    	// Replace this with statements to set the file name (input) and file name (output).
        // Initially it will be easier to hardcode suitable file names.

        // Set up a new Scanner to read the input file.
        // Processing line by line would be sensible here.
        // Initially, echo the text to System.out to check you are reading correctly.
        // Then add code to modify the text to the output format.

        // Set up a new PrintWriter to write the output file.
        // Add suitable code into the above processing (because you need to do this line by line also.
        // That is, read a line, write a line, loop.

        // Finally, add code to read the filenames as arguments from the command line.

    } // main

} // FilesInOut
