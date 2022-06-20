import java.util.*;
import java.io.*;

class mainmenu
{
	void mmenu()
	{
		Scanner sc = new Scanner(System.in);
		File f=new File("C:\\Users\\HP\\Desktop\\Simplilearn\\Project 1");  
		String filenames[]=f.list();
		fileoperations fo = new fileoperations();
		mainmenu mm = new mainmenu();
		
		
		
		System.out.println("************************************************************************");
		System.out.println("************************************************************************");
		System.out.println("*                            LOCKEDME.COM                              *");
		System.out.println("************************************************************************");
		System.out.println("************************************************************************");
		System.out.println("------------------------Welcome to LockedMe.Com------------------------ ");
		System.out.println("************************************************************************");
		System.out.println("////////////This Application is created by Pratyaksh Saxena.\\\\\\\\\\\\");
		System.out.println("========================================================================");
		System.out.println("                                                                        ");
		System.out.println("                                                                        ");
		
		System.out.println("                          File Management System                        ");
		System.out.println("                         ========================                       ");
		System.out.println("                        |        MAIN MENU       |                      ");
		System.out.println("                         ========================                       ");
		
		System.out.println("         **Select any option number from below and press ENTER.**       ");
			
		
		System.out.println("1) Retrieve all files.");
		System.out.println("2) File Operations.");
		System.out.println("3) EXIT APPLICATION.");
		System.out.println("----Enter Choice----");
		
		int choice1 = sc.nextInt();
		
		switch(choice1)
		{
		 	case 1: //To retrieve all files in ascending order.
		 	{
		 		System.out.println("------The Files in Ascending order are---------");
			 
		 		for(String filename:filenames)
		 		{  
		 				System.out.println(filename); 
		 		}
		 		
		 		System.out.println("                                                          ");
		 		System.out.println("Do you wish to return to : (1) Previous Menu or (2) Exit? ");
		 		int res=sc.nextInt();
		 		
		 		if(res==1)
		 		{
		 			mm.mmenu();
		 		}
		 		else
		 		{
		 			System.out.println("Bye-Bye!!");
		 			System.exit(0);
		 		}
		 		
		 	}
		 
		 	case 2: //for file operations.
		 	{
		 		fo.fileops();
		
		 	}
		 
		 	case 3: //to exit application.
		 	{
		 		System.out.println("Bye-Bye!");
		 		System.exit(0);
		 	}
		 	
		 	default:
		 	{
		 		System.out.println("Invalid Input, Please enter a Valid Value.");
		 		System.out.println("                                          ");
		 		mm.mmenu();
		 	}
		 
		}
	}
}




class addfile
{
	
	
	void addnewfile()
	{
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		mainmenu mm = new mainmenu();
		
		
		try
		{
			System.out.println("--------------ADD A NEW FILE--------------");
			System.out.println("Enter File Name: ");
			String myfile = br.readLine();
			String s = "C:\\Users\\HP\\Desktop\\Simplilearn\\Project 1\\" + myfile +".txt"; 
			File f = new File(s);
		
			if(f.exists())
			{
				System.out.println("File already exists.");
			}
			else
			{
				f.createNewFile();
				System.out.println("New File created successfully!");
			}
			System.out.println("                                                          ");
	 		System.out.println("Do you wish to return to : (1) Previous Menu or (2) Exit? ");
	 		int res=sc.nextInt();
	 		
	 		if(res==1)
	 		{
	 			mm.mmenu();
	 		}
	 		else
	 		{
	 			System.out.println("Bye-Bye!!");
	 			System.exit(0);
	 		}
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
	}
	
	
}

class deletefile
{
	void deletethefile()
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		mainmenu mm = new mainmenu();
		
		
		try
		{
			System.out.println("--------------DELETE A FILE--------------");
			System.out.println("Enter File Name: ");
			String myfile = br.readLine();
			String s = "C:\\Users\\HP\\Desktop\\Simplilearn\\Project 1\\" + myfile +".txt";
			File f = new File(s);
		
			if(f.exists())
			{
				f.delete();
				System.out.println("File Deleted Successfully.");
			}
			else
			{
				System.out.println("File does not exist.");;
			}
			
			System.out.println("                                                          ");
	 		System.out.println("Do you wish to return to : (1) Previous Menu or (2) Exit? ");
	 		int res=sc.nextInt();
	 		
	 		if(res==1)
	 		{
	 			mm.mmenu();
	 		}
	 		else
	 		{
	 			System.out.println("Bye-Bye!!");
	 			System.exit(0);
	 		}
			
			
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class searchfile
{
	void searchforfile()
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		mainmenu mm = new mainmenu();
		
		
		try
		{
			System.out.println("--------------SEARCH FOR A FILE--------------");
			System.out.println("Enter File Name: ");
			String myfile = br.readLine();
			String s = "C:\\Users\\HP\\Desktop\\Simplilearn\\Project 1\\" + myfile +".txt";
			File f = new File(s);
		
			if(f.exists())
			{
				System.out.println("File Found in Directory!");
			}
			else
			{
				System.out.println("File Not Found in Directory.");;
			}
			
			System.out.println("                                                          ");
	 		System.out.println("Do you wish to return to : (1) Previous Menu or (2) Exit? ");
	 		int res=sc.nextInt();
	 		
	 		if(res==1)
	 		{
	 			mm.mmenu();
	 		}
	 		else
	 		{
	 			System.out.println("Bye-Bye!!");
	 			System.exit(0);
	 		}
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class fileoperations
{
	void fileops()
	{
		Scanner sc = new Scanner(System.in);
		addfile af = new addfile();
		deletefile df = new deletefile();
		searchfile sf = new searchfile();
		mainmenu mm = new mainmenu();
	
		System.out.println("                         ========================                       ");
		System.out.println("                        |     FILE OPERATIONS    |                      ");
		System.out.println("                         ========================                       ");
		System.out.println("         **Select any option number from below and press ENTER.**       ");
		System.out.println("(1) Add a File.");
		System.out.println("(2) Delete a File");
		System.out.println("(3) Search for a File.");
		System.out.println("(4) Back to Previous Menu.");
		System.out.println("(5) EXIT APPLICATION.");
		System.out.println("----Enter Choice----");
		int choice2 = sc.nextInt(); 
	
		switch(choice2)
		{
			case 1: // to add a new file.
			{
				af.addnewfile();	
				System.exit(0);
			}
		
			case 2: // to delete a file.
			{
				df.deletethefile();
				System.exit(0);
			}
		
			case 3: // to search for a file.
			{
				sf.searchforfile();
				System.exit(0);
			}
		
			case 4: // back to previous menu.
			{
				mm.mmenu();
			}
		
			case 5: // exit application.
			{
				System.out.println("Bye-Bye!");
				System.exit(0);
			}
			
			default: 
			{
				System.out.println("Invalid Input, Please enter a Valid Value.");
		 		System.out.println("                                          ");
		 		mm.mmenu();
			}
		}
	}
}






public class LockedMe 
{

	public static void main(String[] args)
	{
			mainmenu mm = new mainmenu();
			mm.mmenu();
	}
}



	




	




	




	




	


