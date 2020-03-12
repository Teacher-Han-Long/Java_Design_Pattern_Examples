import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class DesignPattern {
	
	/*
		How to break the Singleton design pattern in Java
		and get multiple objects of same class.
		2 ways Serialization or Reflection
		Reflection:  Better way to create an object since it doesn't require
		the Singleton class to implement serialization.
		1. Make s2 variable null
		2. import Constructor from Reflect class and get the array of all
			constructors of Singleton class.
		3. Loop through constructors and for each one set accessible to true
		4. Create a new instance of Singleton class and assign it to s2
		5. Put it inside a try / catch block and 
			cast new instance to type Singleton
			NOW 2 new objects are being created
	*/
	public static void main(String[] args) {
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = null;
		
		Constructor[] constructors = Singleton.class.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			constrctor.setAccessible(true);
			try {
				s2 = (Singleton) constructor.newInstance();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		
		
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println("s1 dot equals s2 : " + s1.equals(s2));
	}
	/*
		JUnit and other Frameworks use reflection to break the singleton 
		behavior of database connection objects and so on....
	*/
}
