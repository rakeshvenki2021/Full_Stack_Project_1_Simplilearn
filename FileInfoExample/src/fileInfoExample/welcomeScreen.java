package fileInfoExample;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Date;
import java.util.Scanner;

public class welcomeScreen {

	public static void main(String[] args) { 
		// Create a File represents a path.
		System.out.println("**********WELCOME TO THE FILE MANAGER**********");
		System.out.println("Developed by:-");
		
		System.out.println("\r\n"
				+ "__________    _____   ____  __.___________ _________ ___ ___  \r\n"
				+ "\\______   \\  /  _  \\ |    |/ _|\\_   _____//   _____//   |   \\ \r\n"
				+ " |       _/ /  /_\\  \\|      <   |    __)_ \\_____  \\/    ~    \\\r\n"
				+ " |    |   \\/    |    \\    |  \\  |        \\/        \\    Y    /\r\n"
				+ " |____|_  /\\____|__  /____|__ \\/_______  /_______  /\\___|_  / \r\n"
				+ "        \\/         \\/        \\/        \\/        \\/       \\/  \r\n"
				+ "");
		
		String CloseApplication = "YES";
		while (CloseApplication.equals("YES")|| !CloseApplication.equals("NO")){
		System.out.println("PLEASE SELECT OPTION BELOW TO PROCEED FURTHER");
		System.out.println("1. Input A for listing the file name in ascending order. \r\n"
				+ "2. Input B for adding file to existing directory list.\r\n"
				+ "3. Input C for deleting file from the existing directory. \r\n"
				+ "4. Input D for searching a user specified file from directory.\r\n");
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter Option:");
		String option = myObj.nextLine();
		System.out.println("Option selected is: " + option);

		if (option.equals("A") ){
				System.out.println("Please enter directory to list files");
			String option_1 = myObj.nextLine();
				File maindir = new File(option_1);
				 
				if (maindir.exists() && maindir.isDirectory()) {
				     
				      // array for files and sub-directories
				    // of directory pointed by maindir
				    File arr[] = maindir.listFiles();
    
				    System.out.println(
				        "**********************************************");
				    System.out.println(
				        "Files from main directory : " + maindir);
				    System.out.println(
				        "**********************************************");
				    
				 
				    fileInfoExample.fileInfo.fileSearch(arr, 0, 0);
				}
     		}else if(option.equals("B")) {
     			System.out.println("Please enter directory to create new file in");
    			String option_1 = myObj.nextLine();
    			System.out.println("Please enter filename to create new file");
    			String option_2 = myObj.nextLine();
    			fileInfoExample.fileNewcreation.fileNewcreation(option_1,option_2);
     		}else if(option.equals("C")){
     			System.out.println("Please enter directory to Delete file in");
    			String option_1 = myObj.nextLine();
    			System.out.println("Please enter filename to delete");
    			String option_2 = myObj.nextLine();
    			fileInfoExample.FileDeleteExample.FileDeleteExample(option_1, option_2);
    			}else if(option.equals("D")) {
     			System.out.println("Please enter directory to Search file in");
    			String option_1 = myObj.nextLine();
    			System.out.println("Please enter filename to Search");
    			String option_2 = myObj.nextLine();
    			fileInfoExample.fileSearch.fileSearch(option_1, option_2);
     		}
			System.out.println("Would you like to go back to the main menu: (YES/NO)");
			String option_3 = myObj.nextLine();
			CloseApplication = option_3;
		}//while loop
		System.out.println("Thanks for using this application");
	}//main 
		}

	
