package mustafa;

public class Q73 {

	public static void main(String[] args) {
		String bike1 = "speedy";            // string replaced with String for both lines
		String bike2 = new String("speedy");
		boolean test1 = bike1 == bike2;
		boolean test2 = bike1.equals(bike2);
		System.out.println(test1 + " " + test2);

	}

}
