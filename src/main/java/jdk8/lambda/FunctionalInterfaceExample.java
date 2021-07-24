package jdk8.lambda;

public class FunctionalInterfaceExample {
	
	public static void main(String[] args) {
		// Lambda Expression 1
		ComputeInterface c1 = (int a, int b) -> {
	      System.out.println(a * b);
	    };
	    
	    c1.compute(10, 10);
	    
	    // Lambda Expression 2
	    ComputeInterface c2 = (a, b) -> System.out.println(a + b);
	    c2.compute(10, 10);
	}
    
    
    
    

}
