package wordcount;

public class Wordcount {
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
