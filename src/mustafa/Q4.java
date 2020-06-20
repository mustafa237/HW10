package mustafa;

public class Q4 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int[] crossword [] = new int[10][20];
		for (int i = 0; i < crossword.length; i++)
			for (int j = 0; j < crossword.length; j++)
				crossword[i][j] = 'x';
		System.out.println(crossword.length);  // Changed size() to length
		
		// Debug
		for (int[] cross : crossword)
		    for (int c : crossword[2])       
		    	System.out.println((char)c); // 'x' 's integer equilavent is 120 ascii table 


	}

}
