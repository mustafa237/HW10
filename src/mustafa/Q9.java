package mustafa;

public class Q9 {

	public static void main(String[] args) {
	    final String ceiling = "up";
	    String floor = new String("up");
	    final String wall = new String(floor);
	    System.out.print((ceiling==wall) +" "+
	                        (floor==wall) +" "+
	                            ceiling.equals(wall));


	}

}
