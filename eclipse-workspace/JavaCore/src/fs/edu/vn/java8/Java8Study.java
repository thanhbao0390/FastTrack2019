package fs.edu.vn.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Java8Study {

	public static void main(String[] args) {

		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		
		Random random = new Random(10);
		random.ints(10).limit(3).forEach(System.out::println);
		
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

		//get list of unique squares
		List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
		squaresList.forEach(System.out::println);
		
		List<String> strings2 = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

		//get count of empty string
		int count = (int) strings2.stream().filter(string -> string.isEmpty()).count();
		System.out.println(count);
		
	}
}
