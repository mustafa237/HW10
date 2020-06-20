package mustafa;

public class Q21 {

	static int teeth;
	  double scaleToughness;
	  public Q21() {
	    teeth++;
	  }

	  public void snap(int teeth) {
	      System.out.print(teeth+" ");
	      teeth--;  
	  }
	    public static void main(String[] unused) {
	    new Q21().snap(teeth);
	    new Q21().snap(teeth);
	  }


}
