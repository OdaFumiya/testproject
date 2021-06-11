package FileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIO {
	
	int makeFile(String filename) {
		
		Path p = Paths.get(filename);

		try{
		  Files.createFile(p);
		}catch(IOException e){
		  return 1;
		}
		return 0;
	}
	int deleteFile(String filename) {
		
		Path p = Paths.get(filename);

		try{
		  Files.delete(p);
		}catch(IOException e){
		  return 1;
		}
		return 0;
	}
	
    int count(String str){
		if(str==null) {
			return 0;
		}
    	if(str.length()==0) {
    		return 0;
    	}
        String[] words = str.split("\\s+");
        return words.length;
    }
}
