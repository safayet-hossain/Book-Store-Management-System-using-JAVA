import java.lang.*;
import classes.*;
import interfaces.*;
import java.util.*;
import fileio.*;
import java.util.Calendar; 
class Start										//Main Class Holding the main method
{
	public static void main(String[] args)		//Main Method
	{	
		System.out.println("Welcome to Library Application");
		
		Scanner sc = new Scanner(System.in);
		boolean repeat = true;
		Library lib = new Library();	//Creates a new Library object
		Calendar calndr = Calendar.getInstance();
		FileioException fioe = new FileioException();
		
		//Creating new Book objects
		Book b1 = new Book("Night_Fall", "Isaac_Asimov", "Shondesh");
		Book b2 = new Book("The_Star,Like_Dust", "Isaac_Asimov", "Doubleday");
		Book b3 = new Book("Moddhanno", "Humayun_Ahmed", "Onno_Prokash");
	
		lib.insertBook1(b1);	//using insertBook1 method to insert the book objects
		lib.insertBook1(b2);
		lib.insertBook1(b3);
		
		Records records[] = new Records[500];
			
		//Creating instances of records
		Records r1 = new Records("ABRAR", "20-42724-1", "Night_Fall", "Isaac_Asimov", "Shondesh", "Thu Sep 10 22:45:11 BDT 2020", "Thu Sep 17 22:45:11 BDT 2020");
		Records r2 = new Records("Farhana", "20-42710-1", "The_Star,Like_Dust", "Isaac_Asimov", "Doubleday", "Thu Sep 10 10:45:11 BDT 2020", "Thu Sep 17 10:45:11 BDT 2020");
		Records r3 = new Records("Halim", "20-42456-1", "Moddhanno", "Humayun_Ahmed", "Onno_Prokash", "Thu Sep 17 12:45:11 BDT 2020", "Thu Sep 24 12:45:11 BDT 2020");
		
		records[0] = r1;
		records[1] = r2;
		records[2] = r3;
		
		
		do
		{
			System.out.println("Choose an option: \n");
			System.out.println("	1. Librarian");
			System.out.println("	2. Student");
			System.out.println("	3. Exit\n");
			
			System.out.print("Your option : ");
			int option1 = sc.nextInt();				//takes user input for displaying options
			
			switch(option1)
			{
				case 1:
				
					System.out.println("You have selected Librarian");
					System.out.println("Select any Option\n");
					System.out.println("	1.Registration");
					System.out.println("	2.LogIn");
					System.out.println("	3. Go Back\n");
						
					System.out.print("Your Option :");
					int option2 = sc.nextInt();			//takes user input for displaying options
						
					switch(option2)
					{
						case 1:
						
							System.out.println("You have selected Registrstion.");
							System.out.print("User Name :");
							String userName = sc.next();
							System.out.print("Librarian Id :");
							String l_Id = sc.next();
							System.out.print("Password :");
							String pass = sc.next();
							System.out.print("Confirm Password :");
							String conPass = sc.next();
							System.out.println(" ");
							
							if(pass.equals(conPass))
							{
								Librarian l = new Librarian();				//creates a new librarian obj
								l.setName(userName);
								l.setL_Id(l_Id);
								l.setPass(pass);
							
								lib.insertLibrarian(l);				//calling insertLibrarian method from Library class
							}
							else
							{
							do{
								System.out.println("Password didn't match.Try again \n");
								System.out.print("Password :");
								pass = sc.next();
								System.out.print("Confirm Password :");
								conPass = sc.next();
								System.out.println(" ");
								System.out.println(" ");
								}
							while(!pass.equals(conPass));
								
								Librarian l = new Librarian();
								l.setName(userName);
								l.setL_Id(l_Id);
								l.setPass(pass);
							
								lib.insertLibrarian(l);
							}
							
							System.out.println("Registration Successful");
							System.out.println(" ");
							break;
						
						case 2:						//Login Option
						
							System.out.println("You have selected Login");
							
							System.out.print("Enter Librarian Id: ");
							String l_Id2 = sc.next();
							
							System.out.print("Password :");
							String pass2 = sc.next();
							
							lib.getLibrarian(l_Id2 , pass2); //To compare librarian ID and Password
							
							
							System.out.println("What do you want?\n");
							System.out.println("	1.Manage Books");
							System.out.println("	2.Check records of students");
							System.out.println("	3.Search for books");
							System.out.println("	4.Go back\n");
							
							System.out.print("Your Option :");
							int option3 = sc.nextInt();					////takes user input for displaying options
							
							switch(option3)
							{
								case 1:
									
									System.out.println("You have selected Check Books.");
									System.out.println("Select any Option\n");
									System.out.println("	1.Add books");
									System.out.println("	2.Remove books");
									System.out.println("	3.Go Back");
									
									System.out.print("Your Option :");
									int option4 = sc.nextInt();
									
									switch(option4)
									{
										case 1:
										
											System.out.println("You have selected Add books\n");
											
											System.out.print("Enter book name : ");
											String bName = sc.next();
											System.out.print("Enter writter name : ");
											String writterName = sc.next();
											System.out.print("Enter publication name : ");
											String publicationName = sc.next();
											
											Book b = new Book(bName, writterName, publicationName);		//Creates new Book object
							
											lib.insertBook2(b);
											break;			//Breaks the statements
											
										case 2:
										
											System.out.println("You have selected Remove books\n");
											
											System.out.print("Enter book name : ");
											String bName2 = sc.next();
											System.out.print("Enter writer name : ");
											String writterName2 = sc.next();
											System.out.print("Enter publication name : ");
											String publicationName2 = sc.next();
											
											lib.removeBook(lib.getBook(bName2 , writterName2 , publicationName2)); //Calling the removebBook method from Library class
											break;			//Breaks the statements
											
										case 3:
										
											System.out.println("You have Selected to Go Back");
											break;			//Breaks the statements
											
										default:
				
											System.out.println("Invalid Input");
											break;			//Breaks the statements
									}
									break;
									
								case 2:
								
									System.out.println("You have selected Check records of students.");
									
									int flag=0;
									for(int i=0; i<records.length; i++)
									{
										if(records[i] != null)
										{
											System.out.println("///////////////////////////////////////////////");
											System.out.println("Name :"+records[i].getName());							//Getting the return values of the method getName to print it to the console			
											System.out.println("Id :"+records[i].getId());								//Getting the return values of the method getId to print it to the console
											System.out.println("Book name :"+records[i].getBookName());					//Getting the return values of the method getBookName to print it to the console
											System.out.println("Book writer name :"+records[i].getBookWriter());		//Getting the return values of the method getBookWriter to print it to the console
											System.out.println("Publication name :"+records[i].getPublication());		//Getting the return values of the method getPublication to print it to the console
											System.out.println("Issue date :"+records[i].getIssueDate());				//Getting the return values of the method getIssueDate to print it to the console
											System.out.println("Last date :"+records[i].getLastDate());					//Getting the return values of the method getLastDate to print it to the console
											System.out.println("///////////////////////////////////////////////");					
											System.out.println(" ");
											flag=1;
										}
										else
										{
											break;			//Breaks the statements
										}
									}
									if(flag == 0)
									{
										System.out.println("There are no records.");
									}
									break;			//Breaks the statements
								
								case 3:
								
									System.out.println("You have search for books\n");
									
									System.out.print("Enter book name : ");
									String bName2 = sc.next();							//taking user input for Book name
									System.out.print("Enter writer name : ");
									String writterName2 = sc.next();					//taking user input writer name
									System.out.print("Enter publication name : ");
									String publicationName2 = sc.next();				//taking user input for publication name
											
									lib.getBook(bName2 , writterName2 , publicationName2); 		//returns the specified book from library
									
									break;			//Breaks the statements
									
								case 4:
								
									System.out.println("You have Selected to Go Back");
									break;			//Breaks the statements
									
								default:
				
									System.out.println("Invalid Input");
									break;			//Breaks the statements
							}
							break;
							
						case 3:
						
							System.out.println("You have Selected to Go Back");
									break;			//Breaks the statements
									
								default:
				
									System.out.println("Invalid Input");
									break;			//Breaks the statements
					}
					break;
				
				case 2:
					
					System.out.println("You have selected Student");
					
					System.out.println("Select any Option\n");
					System.out.println("	1.Registration for Student");
					System.out.println("	2.Go BAck");
					
					System.out.print("Your Option :");
					int option5 = sc.nextInt();					//taking user input
					
					switch(option5)
					{
						case 1:
						
							System.out.println("You have selected Registration");
							System.out.print("User Name :");
							String userName = sc.next();
							System.out.print("Student Id :");
							String s_Id = sc.next();
							System.out.print("Enter Book name : ");
							String bookName = sc.next();
							System.out.print("Enter writer name : ");
							String writerName = sc.next();
							System.out.print("Enter publication name : ");
							String pName = sc.next();
							
							Date c1 = calndr.getTime();				//To get the present date
							calndr.add(Calendar.DATE, 7);			//To add numbers of dates with present date
							Date c2 = calndr.getTime();
							
							if(lib.getBook(bookName , writerName , pName) != null) 			
							{
								Records r4 = new Records(userName, s_Id, bookName, writerName, pName, c1.toString(), c2.toString());
							
							
								int flag = 0;
								for(int i=0; i<records.length; i++)
								{
									if(records[i] == null)
									{
										records[i] = r4;			//Stores the Records type object into records array
										flag = 1;
										break; 			//Breaks the statements
									}
								}
								if(flag == 1)
								{
									System.out.println("Student information is Inserted\n");
								}
								else
								{
									System.out.println("Student information can Not Insert\n");				//Error message
								}
								
								fioe.writeInFile(userName+" has registered to take "+bookName+" on "+c1);	//calling writeInFile method to write in the file
							
								fioe.readFromFile();		//calling readFromFile method to read from the the file
								break; 			//Breaks the statements
							}
							break; 			//Breaks the statements
							
						case 2:

							System.out.println("You have Selected to Go Back");
							break;			//Breaks the statements
							
						default:
				
							System.out.println("Invalid Input");
							break;			//Breaks the statements
					}
					break;
					
				case 3:
				
					System.out.println("You have selected to exit the application");
					System.out.println("Thank you for using Library Application");
					repeat = false;
					break;			//Breaks the statements
					
				default:
				
					System.out.println("Invalid Input");	
					break;			//Breaks the statements
			}
			
			
		}
		while(repeat);			//Repeats the loop until repeat == false
	}
}	