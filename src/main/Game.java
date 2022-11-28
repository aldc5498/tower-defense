package main;

import javax.swing.JFrame;

public class Game extends JFrame {
	
	private GameScreen gameScreen;	
	
	public Game() {
//		System.out.println("Hello from constructur");
		setSize(640,640);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		gameScreen = new GameScreen();
		add(gameScreen);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start of our Tutorial.Hello there!!");

		Game game = new Game();
	}

}
