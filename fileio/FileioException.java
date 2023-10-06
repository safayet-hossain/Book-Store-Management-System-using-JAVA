package fileio;

import java.io.FileWriter;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class FileioException
{
	private File obj1;	     		//to create a File	
	private FileWriter obj2;	    //to write in a file	
	private FileReader obj3;		//to read from a file
	private BufferedReader bfr;		//to read file content
	
	
	public void writeInFile(String s)
	{
		
		/*
			creating a file and writing in it genarates compiletime exceptions (Checked Exceptions).
			So, we need to write the whole thing in try-catch.
		*/
		try
		{
			obj1 = new File("C:\\Users\\HP\\Desktop\\University\\Project(Group-2)\\fileio\\file.txt");  //Declaring a file named named file.txt for creating.
			obj1.createNewFile();                                    //If the file does not exists, creates and opens the file. else, just opens the file               
			
			obj2 = new FileWriter(obj1);        //creating the writer object to write in the file.
			obj2.write(s+"\n");                //writing a string s in the file.  "\n" has been concat to go to a newline.
			
			obj2.flush();                      //After writing, we need to flush to indicate that we have completed writing.
			obj2.close();                      //After flushing, we need to close the file to save our writing.
		}
		catch(IOException e)
		{
			System.out.println("An error found");
			e.printStackTrace();
		}
	}
	
	public void readFromFile()
	{/*
			reading from a file genarates compile time exceptions (Checked Exceptions).
			So, we need to write the whole thing in try-catch.
		*/
		try
		{
			obj3 = new FileReader(obj1);	        //creating the reader object to read from a file.		
			bfr = new BufferedReader(obj3);		    //creating the BufferedReader object using the reader object to read the file content.
			String text="", temp;					//declaring two string variables to read the file content and storing them.
			
			while((temp=bfr.readLine())!=null)		//reading one line from the file, storing it in the variable temp and checking whether it is null or not. 
			                                        //It will be null at the end of reading from the file.
			{
				text=text+temp+"\n"+"\r";			//storing the temp string in text by concating it with text and "n" and "\r" is used to go to a newline.
			}
			
			System.out.println(text);		       //printing the whole string in console.
			obj3.close();							//closing the file.
		}
		
		
		catch(IOException e)
		{
			System.out.println("An error found");
			e.printStackTrace();
		}
	}
	
}