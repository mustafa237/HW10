package mustafa;

@SuppressWarnings("serial")
class OpenDoorException extends Exception {}
@SuppressWarnings("serial")
class CableSnapException extends OpenDoorException {}

public class Q71 {
	@SuppressWarnings("finally")
	public void openDrawbridge() throws Exception {
		try {
			throw new Exception("Problem");
		} catch (CableSnapException e) {
			throw new OpenDoorException();
		} catch (OpenDoorException ex) {// already handled swap places with OpenDoorException
			try {
				throw new OpenDoorException();
			} catch (Exception ex1) { // ex renamed to ex1
			} finally {
				System.out.println("Almost done");
			}
		} finally {
			throw new RuntimeException("Unending problem");
		}
	}
		public static void main(String[] moat) throws IllegalArgumentException {
			try {
				new Q71().openDrawbridge();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}

