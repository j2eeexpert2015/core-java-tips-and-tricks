package jdk8.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * What is Lambda and why we need lambda in Java ?
 * Lambda is a block of code that could be passed around to execute.
 * From Java 8 ,Lambda expression enables us to treat functionality as method 
 * argument and pass a block of code around
 * @author mrayandutta21
 *
 */
public class LambdaExamples {
	public static void main(String[] args) {
		
	List<String> countryNames = new ArrayList<String>();
    countryNames.add("India");
    countryNames.add("England");
    countryNames.add("Australia");
    
	// Iterating country names through forEach using Lambda Expression
	countryNames.forEach(name -> System.out.println(name));
		
		
	}

}
