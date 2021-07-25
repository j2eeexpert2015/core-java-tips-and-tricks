package jdk8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MethodReferenceExample {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1,12,433,5);
		/*
		 * Method reference to static method – Class::staticMethodName 
		 * An example to use Math.max() which is static method.
		 */
		
		Optional<Integer> max = integers.stream().reduce( Math::max ); 
		max.ifPresent(value -> System.out.println(value)); 
		/*
		 * Method reference to instance method from instance – ClassInstance::instanceMethodName
		 */
		max.ifPresent( System.out::println ); 
	}

}
