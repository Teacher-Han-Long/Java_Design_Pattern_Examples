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