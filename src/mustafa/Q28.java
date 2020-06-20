package mustafa;

public class Q28 {
	
	public static void main(String[] args) {
	int a = 5;
    int b = 5;
    int c;
    c = --a;    
    System.out.println(c); //prints 4 pre-decrement
    
    c = b--;
    System.out.println(c); //prints 5 post-decrement
	}
}

