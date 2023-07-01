package fileInfoExample;
import java.io.File;
public class fileSearch {
	// Java Program to Search for a File in a Directory
	
public static void fileSearch(String Path, String Filename) {
			// Create an object of the File class
			// Replace the file path with path of the directory
			File directory = new File(Path);

			// store all names with same name
			// with/without extension
			String[] flist = directory.list();
			int flag = 0;
			if (flist == null) {
				System.out.println("Empty directory.");
			}
			else {

				// Linear search in the array
				for (int i = 0; i < flist.length; i++) {
					String filename = flist[i];
					if (filename.equalsIgnoreCase(Filename)) {
						System.out.println(filename + " found");
						flag = 1;
					}
				}
			}

			if (flag == 0) {
				System.out.println("File Not Found");
			}
}

}
	
