package mustafa;

public class Q20 {

	public static void main(String[] args) {
		int result = 8;
	    loop: while (result > 7) {
	      result++;
	      do {
	        result--;
	        //break loop;// TESTING PURPOSES
	      } while (result > 5);
	      break loop;
	    }
	    System.out.println(result);


	}

}
