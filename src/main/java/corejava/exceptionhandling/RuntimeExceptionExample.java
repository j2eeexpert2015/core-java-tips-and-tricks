package corejava.exceptionhandling;

public class RuntimeExceptionExample {

	public static void main(String[] args) {
		String sampleArr[] = { "India", "US", "England"};
		String countryName = sampleArr[4]; // This throws ArrayIndexOutOfBoundException
		System.out.println(countryName);
	}

}
