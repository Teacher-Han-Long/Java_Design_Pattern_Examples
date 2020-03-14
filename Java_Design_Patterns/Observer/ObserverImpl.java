public class ObserverImpl implements Observer {
	
	private String name;
	private Board board;
	
	public ObserverImpl(String name) {
		this.name = name;
	}
	
	@Override
	public void update() {
		String msg = (String) board.getUpdate(this);
		if (msg == null) {
			System.out.println(name + ": no new message");
		} else {
			System.out.println(name + ": consuming message--> " + msg);
		}
	}
	
	@Override
	public void subscribe(Board board) {
		this.board = board;
	}
	
}