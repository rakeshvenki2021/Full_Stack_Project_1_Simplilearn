package fileInfoExample;

import java.io.File;


public class FileDeleteExample  
{ 
	public static void FileDeleteExample(String Path, String Filename) {
     
try  
{         
File f= new File(Path + Filename);           //file to be delete  
if(f.delete())                      //returns Boolean value  
{  
System.out.println(f.getName() + " deleted");   //getting and printing the file name  
}  
else  
{  
System.out.println("Ststus of the File you're trying to Delete - File Not Found");  
}  
}  
catch(Exception e)  
{  
e.printStackTrace();  
}  

}

	
		// TODO Auto-generated method stub
		
	} 