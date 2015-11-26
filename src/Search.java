
public class Search {
	
	public static boolean sequentialSearch(String sourceString, String searchString) {
		
		int foundcount = 0;
		
		for (int i = 0; i < searchString.length(); i++) {
			
			for (int j = 0; j < sourceString.length(); j++) {
			
				if (sourceString.charAt(j) == searchString.charAt(i)) {
					foundcount += 1;
					break;
				}
			}		
		}
		
		if (foundcount == (searchString.length()))
			return true;
		else 
			return false;
			
	}
	
	public static boolean binarySearch(String sourceString, char find) {
		
		int low = 0;
		int middle = 0;
		int high = sourceString.length() - 1;
	
		while (low <= high) {
		
			middle = (low + high) / 2;
			if (sourceString.charAt(middle) > find) {
				high = middle - 1;
			} else if (sourceString.charAt(middle) < find) {
				low = middle + 1;
			} else return true;
			
		}
		
		return false;
		
	}

}