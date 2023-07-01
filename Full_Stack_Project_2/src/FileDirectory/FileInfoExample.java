package FileDirectory;

import java.io.File;

import java.util.Date;

public class FileInfoExample { 
	public static void main(String[] args) { 
		// Create a File represents a path.
		File apath = new File("C:/test/mytext.txt");

		// Check if exists.
		System.out.println("Path exists? " + apath.exists()); 
		if (apath.exists()) { 
			// Check if 'apath' is a directory.
			System.out.println("Directory? " + apath.isDirectory());

			// Check 'apath' is a Hidden path.
			System.out.println("Hidden? " + apath.isHidden());

			// Simple name.
			System.out.println("Simple Name: " + apath.getName());

			// Absolute path.
			System.out.println("Absolute Path: " + apath.getAbsolutePath());

			// Check file size (in bytes):
			System.out.println("Length (bytes): " + apath.length());

			// Last modify (in milli second)
			long lastMofifyInMillis = apath.lastModified();
			Date lastModifyDate = new Date(lastMofifyInMillis); 
			System.out.println("Last modify date: " + lastModifyDate); 
		} 
	} 
}