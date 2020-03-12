public class DesignPattern {
	public static void main(String[] args) {
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println("s1 dot equals s2 : " + s1.equals(s2));
	}
}

/*1.
  -run w/an empty Singleton class. It creates 2 separate objects
	public static void main(String[] args) {
		
		Singleton s1 = new Singleton();
		Singleton s2 = new Singleton();
		
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println("s1 dot equals s2 : " + s1.equals(s2));
	}
	
	We can't use "new" Singleton now. The constructor is not accesible from
	another class. We have to use the class name and getInstance method.
	Now both objects are the same
	BUT
	not a good programming practice b/c the Singleton class is already 
	initialized and for memory intensive objects it can occupy unnecessary
	memory even before the obj. is being called for the first time. 
	To avoid this scenerio:  lazyInitialization
	
 */