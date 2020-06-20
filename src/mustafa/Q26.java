package mustafa;


interface Plant {
	  default String grow() { return "Grow!"; }
}
interface Living {
	public default String grow2() { return "Growing!"; }// changed to grow2 for compiling.
}
public class Q26 implements Plant, Living { // m1
	public String grow(int height) { return "Super Growing!"; }
	public static void main(String[] leaves) {
	    Plant p = new Q26(); // m2
	    System.out.print(((Living)p).grow2()); // m3 // changed to grow2 to see if this casting works or not.
  }
}


