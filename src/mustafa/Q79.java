package mustafa;

abstract class Bear {
	protected int sing;
	protected abstract int grunt();
	int sing() {
		return sing;
	}
}
public class Q79 extends Bear {

	@Override
	protected int grunt() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	/*int grunt() {
		sing() += 10;
		return super.grunt()+1;*/
		//return 10;
	}


