package snake;

import javax.swing.JFrame;


public class GameFrame extends JFrame{
	//extends the Jframe Class
	GameFrame(){
		this.add(new GamePanel());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		
		this.setVisible(true);
		this.setLocationRelativeTo(null); //appear in the middle of the screen
		
	}

}
