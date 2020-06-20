package mustafa;

class Q29{
	  public Q29(boolean a) {
	    super();
	  }
	  public static void main(String[] args) {
	    
	  }
	}


class Trouble extends Q29 {
		  public Trouble() {super(false); // super doesnt have no parameter constructor.
		  }
		  public Trouble(int deep) {
		    super(false);
		    //this(); Either this or super should be first statement cant have them both.
		  }
		  public Trouble(String now, int... deep) {
		    this(3);
		  }
		  public Trouble(int... deep) {// changed long to int... for dissolving compile errors.
		    this("check",deep);// There are no String, double constructor in "this".
		  }
		  public Trouble(double test) {
		  super(test>5 ? true : false);
		  }
		}

