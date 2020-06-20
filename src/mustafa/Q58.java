package mustafa;

import java.io.*;

abstract class CarbonStructure { // class CarbonStructure needs to be abstract to declare abstract methods
	protected long count;
	public abstract Number getCount() throws IOException; // q1
	public CarbonStructure(int count) { this.count = count; }
}
public class Q58 extends CarbonStructure {
	public Q58() { super(15); }
	public Long getCount() throws FileNotFoundException { // q2
	return count;
}
public static void main(String[] cost) {
	try {
		final CarbonStructure ring = new Q58(); // q3
		System.out.print(ring.getCount()); // q4
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}