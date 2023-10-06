package interfaces;					//package used to group related classes.
import classes.*;
public interface BookOperations
{
	 /* All the methods are public abstract by default
    * As you see they have no body
    */
	
	void insertBook1(Book b);
	void insertBook2(Book b);
	void removeBook(Book b);
	Book getBook(String bName , String writterName , String publicationName);
}