package project;

public class ConnectFourRunner {

	public static void main(String[] args) {
		ConnectFour game = new ConnectFour();
		game.addcoin(1);
		
		game.addcoin(1);
		game.addcoin(0);
		game.display();
		
		Ui hi = new Ui();
		//hi.displayboard();
	}

}
