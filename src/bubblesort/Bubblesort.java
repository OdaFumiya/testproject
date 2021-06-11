package bubblesort;

public class Bubblesort {
	
	int[] sort(int[] v) {
		if(v==null) {
			return null;
		}
		int[] ret= v;
		for(int i=0;i<ret.length;i++) {
			for(int j=0;j<ret.length-(1+i);j++) {
				if(ret[j]>ret[j+1]) {
					int tmp=ret[j];
					ret[j]=ret[j+1];
					ret[j+1]=tmp;
				}
			}
		}
		return ret;
	}
}
