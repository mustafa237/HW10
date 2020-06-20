package mustafa;

import java.util.*;

public class Q51 {

	public static void main(String[] args) {
		List<String> drinks = Arrays.asList("can", "cup");
		for (int container = drinks.size(); container > 0; container++) {
		System.out.print(drinks.get(container-1) + ",");
		}

	}

}
