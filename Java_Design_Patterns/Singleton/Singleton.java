public class Singleton {
	
	private static Singleton initializeSingleton = new Singleton();
	// make constructor inaccessible from other classes
	private Singleton () {}
	// provide a static method that returns the class object
	//returns initialized Singleton var which is already initialized
	public static Singleton getInstance() {
		return  initializeSingleton;
	}
	
}
/*
	GOF design pattern - creational desing pattern
	caching, creating driver objects, and logging objects
	THE MAIN CONCEPT - Singleton class :
	to create or return a single object of that class to save 
	memory ex. Every time we use a new Driver class, it should
	return the OLD object instead of returning a new object reference,
	as the Driver class will never get changed.
*/
/*
	public class Singleton {
		
		private static Singleton lazyInitialization = null;
		private Singleton () {}
		public static Singleton getInstance() {
			if (lazyInitialization == null) {
				lazyInitialization = new Singleton();
			}
			return lazyInitialization;
		}
	}
	NOW it creates the object the first call is made
	BUT there is an issue:
	multi-threaded environment - the method is unsynchronized
	Synchronize the method - provides a thread lock while running 
	the method.   
	BUT This will slow down the process:
	So, we can use synchronized block and double check if the variable
	is null. If it's not null, it will not go through the synchronized block.
	public class Singleton {
		
		private static Singleton lazyInitialization = null;
		private Singleton () {}
		public static Singleton getInstance() {
			if (lazyInitialization == null) {
				synchronized(Singleton.class) {
					if (lazyInitialization == null) {
						lazyInitialization = new Singleton();
					}
				}
			}
			return lazyInitialization;
		}
	}
	Now, both objects are the same BUT 
	we can break this type of Singleton class.
*/