package jdk8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamSamples {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,10, 2, 3);
		int result = numbers
		  .stream()
		  .reduce(0, (subtotal, element) -> subtotal + element);
		
		Optional<Integer> max = numbers
				  .stream()
				  .reduce(Math::max);
		
		System.out.println(result);
		System.out.println("max:"+max
				.get());
	}

}
