package classes;
import java.lang.*;
import interfaces.*;
public class Records extends Book
{
//to inherit from a class, use the extends keyword
 
 
		private String name;
		private String id;
		private String issueDate;
		private String lastDate;
		
		public Records(String name, String id, String bName, String writterName, String publicationName, String issueDate, String lastDate)
		{
			super(bName, writterName, publicationName);        //super keyword used to the class being inherited from
			this.name = name;
			this.id = id;
			this.issueDate = issueDate;
			this.lastDate = lastDate;
			
		}
		
		public void setName(String name)            //take name by the set method
		{
			this.name = name;                      //use this keyword
		}
		public void setId(String id)              //take id by the set method
		{
			this.id = id;                          //use this keyword
		}
		public void setBookName(String bName)     // take book name by the set method
		{
			this.bName = bName;                     //use this keyword
		}
		public void setBookWriter(String writterName)  //take book writer name by the set method
		{
			this.writterName = writterName;            //use this keyword
		}
		public void setPublication(String publicationName)  //take publicationName by the set method
		{
			this.publicationName = publicationName;        //use this keyword
		}
		public void setIssueDate(String issueDate)        //by using set method ,taken issueDate
		{
			this.issueDate = issueDate;                  //use this keyword
		}
		public void setLastDate(String lastDate)        //take lastDate by the set method
		{
			this.lastDate = lastDate;                  //use this keyword
		}
		
		
		
	public String getName(){return name;}             		//use get method and return type to take name
	public String getId(){return id;}						//use get method and return type to take id
	public String getBookName(){return bName;}				//use get method and return type to take book name 
	public String getBookWriter(){return writterName;}		//use get method and return type to take writterName
	public String getPublication(){return publicationName;}	//use get method and return type to take publicationName
	public String getIssueDate(){return issueDate;}			//use get method and return type to take issueDate
	public String getLastDate(){return lastDate;}			//use get method and return type to take lastDate
}