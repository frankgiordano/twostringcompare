
public class QuickSort {
	
	public static String qsort(char[] text, int low, int high) {
		
		int i = low;
		int j = high; 
		char pivot = text[(high+low)/2];
		
		while (i <= j) {
			
			while (text[i] < pivot) {
				i++;
			}
		    while (text[j] > pivot) {
				j--;
			}
		    if (i <= j) {
		    	exchange(text, i,j);
		    	i++;
		    	j--;
		    }
		
		}
		
		if (low < j)
			qsort(text, low, j);
		if (i < high)
		    qsort(text, i, high);
		 
		
		 String b = new String(text);
		 return (b);			 
	}
	
	public static void exchange(char[] string, int x, int y)
	{
		char temp = string[x];
		string[x] = string[y];
		string[y] = temp;
	}

}
