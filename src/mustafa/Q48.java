package mustafa;

public class Q48 {
	
	  class a {} 
	  class b extends a {}
	  
	  public static int test(a a){return 1;}
	  
	  public static void main(String[] args) {
	    System.out.print(test(new Q48().new b())); // Passing subclass as argument and its getting casted into superclass for method.
	  }

}
