package mustafa;

public class Q65 {
	@SuppressWarnings("finally")
	public int aaa() throws Exception { try {return 1;} finally{ throw new Exception();}}
	public static void main(String[] args) {
		try {
			new Q65().aaa();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
