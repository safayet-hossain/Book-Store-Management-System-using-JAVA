package classes;
import java.lang.*;
import interfaces.*;
import java.util.*;
public class Library implements LibrarianOperations,BookOperations
{
	  /* This class must have to implement both the abstract methods
    * else we will get compilation error
    */ 
	
	private Librarian librarians[] = new Librarian [50];
	private Book books[] = new Book[500];
	Scanner sc = new Scanner(System.in);                       //scanner used for get inputs.
	
	
	public void insertLibrarian(Librarian l)
	{
		int flag = 0;
		for(int i=0; i<librarians.length; i++)
		{
			if(librarians[i] == null)
			{
				librarians[i] = l;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Librarian's information is Inserted\n");
		}
		else
		{
			System.out.println("Librarian's information can Not Insert\n");
		}
	}
	
	
	public Librarian getLibrarian(String l_Id2 , String pass2)
	{
		Librarian l = null;
		int flag = 0;
		
		for(int i=0; i<librarians.length; i++)
		{
			for(int j=0; j<librarians.length; j++)
			{
				if(librarians[j] != null)
				{
					if(librarians[j].getL_Id().equals(l_Id2) && librarians[j].getPass().equals(pass2))
					{
						l = librarians[i];
						flag = 1;
						break;
					}
				}
			}
			if(flag == 1)
			{
				System.out.println("You are logged in.\n");
				break;
			}
			if(flag == 0)
			{
				System.out.println("Your Id or password is wrong.\n");

				System.out.print("Enter Librarian Id: ");
				l_Id2 = sc.next();
							
				System.out.print("Password :");
				pass2 = sc.next();
			}
		}
		return l;
	}
	
	public void insertBook1(Book b)
	{
		for(int i=0; i<books.length; i++)
		{
			if(books[i] == null)
			{
				books[i] = b;
				break;
			}
		}
	}
	
	
	public void insertBook2(Book b)
	{
		int flag = 0;
		for(int i=0; i<books.length; i++)
		{
			if(books[i] == null)
			{
				books[i] = b;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Book's information is Inserted\n");
		}
		else
		{
			System.out.println("Book's information can Not Insert\n");
		}
	}
	
	public Book getBook(String bName2 , String writterName2 , String publicationName2)
	{
		Book b = null;
		
		for(int i=0; i<books.length; i++)
		{
			if(books[i] != null)
			{
				if(books[i].getBName().equals(bName2) && books[i].getWritterName().equals(writterName2) && books[i].getPublicationName().equals(publicationName2))
				{
					b = books[i];
					break;
				}
			}
		}
		if(b != null)
		{
			System.out.println("Book Found");
		}
		else
		{
			System.out.println("Book Not Found");
		}
		return b;
	}
	
	public void removeBook(Book b)
	{
		int flag = 0;
		for(int i=0; i<books.length; i++)
		{
			if(b != null && books[i] == b)
			{
				books[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Book Removed");
		}
		else
		{
			System.out.println("Book can Not Removed");
		}
	}
}