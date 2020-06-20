package mustafa;

import java.time.*;
import java.time.format.*;

public class Q59 {
	@SuppressWarnings("static-access")
	public static void main(String... h) {
		LocalDate newYears = LocalDate.now();
		Period period = Period.ofYears(1).ofDays(1);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("MM-dd-yyyy");
		System.out.print(format.format(newYears.minus(period)));
	}
}
