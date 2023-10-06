package classes;
import java.lang.*;
import interfaces.*;
public class Book
{
	protected String bName;
	protected String writterName;
	protected String publicationName;
	
	public Book(String bName, String writterName, String publicationName)
	{
		this.bName = bName;                          //this keyword references the class attribute name 
		this.writterName = writterName;              // this keyword references to the class attribute writtername.
		this.publicationName =publicationName;       //this keyword references the class attribute publication name
	}
	
	//using set mathod to set the values.
	public void setBName(String bName){this.bName = bName;}                              //using set mathod to set the values.
	public void setWritterName(String writterName){this.writterName = writterName;}      
	public void setPublicationName(String publicationName){this.publicationName = publicationName;}

	//using get method to return the variable value
	public String getBName(){return bName;}                                 
	public String getWritterName(){return writterName;}                     
	public String getPublicationName(){return publicationName;} 						
}