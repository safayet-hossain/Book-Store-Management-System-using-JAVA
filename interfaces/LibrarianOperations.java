package interfaces;             //package used to group related classes.
import classes.*;
public interface LibrarianOperations
{
	/* All the methods are public abstract by default
    * As we see they have no body
    */
	
	
	void insertLibrarian(Librarian l);
	Librarian getLibrarian(String l_Id2 , String pass2);
}