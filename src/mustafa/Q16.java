package mustafa;

public class Q16 {

	public static void main(String[] args) {
		  String shoe1 = new String("sandal");
		  String shoe2 = new String("flip flop");
		  String shoe3 = new String("croc");
		  shoe1 = shoe2;
		  shoe2 = shoe3;
		  shoe3 = shoe1;
		  shoe3 = shoe3.replace("f","o"); // checking if shoe1 changes too
		  System.out.println(shoe1);
		  System.out.println(shoe2);
		  System.out.println(shoe3);


	}

}
