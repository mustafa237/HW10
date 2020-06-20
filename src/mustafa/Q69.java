package mustafa;

interface MakesNoise {}
abstract class Instrument implements MakesNoise {
	public Instrument(int beats) {}
	public void play() {}
	}
public class Q69 extends Instrument {
	public Q69() {
		super(5);
		// TODO Auto-generated constructor stub
	}
	public void play(int count) {}
	public void concert() {
	super.play();//deleted 5
}
@SuppressWarnings("unused")
public static void main(String[] beats) {
MakesNoise mn = new Q69();
//mn.concert();
}
}
