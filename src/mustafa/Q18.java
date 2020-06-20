package mustafa;

import java.util.*;
import java.util.function.Predicate;

public class Q18 {
	public static void main(String[] args) {
		List<Integer> list= new ArrayList<>();
		list.add(-5);
		list.add(0);
		list.add(5);
		print(list, e -> e < 0);
	}
	public static void print(List<Integer> list, Predicate<Integer> p) {
		for (Integer num : list)
			if (p.test(num))
				System.out.println(num);
	}

}
