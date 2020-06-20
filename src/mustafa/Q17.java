package mustafa;

@SuppressWarnings("serial")
class BubbleException extends Exception {}
class Fish {
  Fish getFish() throws BubbleException {
    throw new RuntimeException("fish!");
  }
}

public final class Q17 extends Fish{

  public final Q17 getFish() {
    throw new RuntimeException("clown!");
  }

  public static void main (String[] bubbles) {
    final Fish f = new Q17();
    try {
    f.getFish();
    } catch (BubbleException e){

    }

    System.out.println("swim!");
  }
  
}

