public class ObserverPattern {
	
	public static void main(String[] args) {
		
		ScoreBoard sb = new ScoreBoard();
		
		Observer observer1 = new ObserverImpl("observer 1");
		Observer observer2 = new ObserverImpl("observer 2");
		Observer observer3 = new ObserverImpl("observer 3");
		
		sb.register(observer1);
		sb.register(observer2);
		sb.register(observer3);
		
		observer1.subscribe(sb);
		observer2.subscribe(sb);
		observer3.subscribe(sb);
		
		observer1.update();
		
		sb.postMessage("Cards 3, Braves 1");
		System.out.println();
		sb.unRegister(observer2);
		sb.postMessage("All games CANCELLED : Corona virus outbreak");
	}
	
}