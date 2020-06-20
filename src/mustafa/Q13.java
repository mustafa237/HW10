package mustafa;

import java.time.LocalTime;

public class Q13 {

	public static void main(String[] args) {
	    LocalTime time = LocalTime.of(1, 11);

	    System.out.println("outside loop");
	    System.out.println(time.getHour());
	    
	    while (time.getHour() < 1) {
	      time.plusHours(1);      System.out.println("in loop");
	    }
	    System.out.println("outside loop");


	}

}
