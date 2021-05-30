package corejava.polymorphism;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PolymosphismSample1 {
	public static void main(String[] args) throws IOException {
		List<Parent> list = new ArrayList<Parent>();
		list.add(new Parent());
		list.add(new Child());
		
		for(Parent person:list)
		{
			//person.test();
		}
	}
}
