package fileInfoExample;

import java.io.File;
import java.io.IOException;
 
public class fileInfo {
    static void fileSearch(File[] arr, int index, int level)
    {
    	try {
        // terminate condition
        if (index == arr.length)
            return;
 
        // tabs for internal levels
        for (int i = 0; i < level; i++)
            System.out.print("\t");
 
        // for files
        if (arr[index].isFile())
            System.out.println(arr[index].getName());
 
        // for sub-directories
        else if (arr[index].isDirectory()) {
            System.out.println("[" + arr[index].getName()
                               + "]");
 
            // recursion for sub-directories
            fileSearch(arr[index].listFiles(), 0,
                           level + 1);
        }
 
        // recursion for main directory
        fileSearch(arr, ++index, level);
    }
    
    catch(Exception e)
    {
    	e.printStackTrace();
    }
    	
    	
    }

    }

 