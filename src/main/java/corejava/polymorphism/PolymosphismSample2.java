package corejava.polymorphism;

public class PolymosphismSample2 {
	public static void main(String[] args) {
		
		Parent parent = new Parent();
		Child child = new Child();
		Child secondChild = null;
		System.out.println("parent instanceof Parent:"+(parent instanceof Parent));
		System.out.println("parent instanceof Child:"+(parent instanceof Child));
		System.out.println("child instanceof Parent:"+(child instanceof Parent));
		System.out.println("secondChild instanceof Child:"+(secondChild instanceof Child));
		
	}
}
