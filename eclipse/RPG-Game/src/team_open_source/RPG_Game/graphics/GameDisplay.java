package team_open_source.RPG_Game.graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import team_open_source.RPG_Game.Main;
import team_open_source.RPG_Game.logic.Board;

/**
 * GameDisplay is responsible for the game's graphics, and triggering the game's logic from controls.
 * Most things that make this a 'game' are in here somewhere, or referenced in here.
 * @author Peter Maar 
 * @version April 2017
 */
@SuppressWarnings("serial")
public class GameDisplay extends JPanel implements KeyListener  {
	Timer timer;
	int QUICKNESS;  //controls speed of movement; smaller number = faster
	Board board;

	public GameDisplay(OptionPanel optionPanel, int sqDim, Board board) {
		this.board = board;

		QUICKNESS = 1000;
		
		addKeyListener(this); //the panel will listen to the keyboard for key events

		
		timer = new Timer(QUICKNESS, new ActionListener(){   
			public void actionPerformed(ActionEvent e) {
				//If the window is selected/focused, update()
				if(isFocusOwner()) update(); //Works most of the time
				else if(Main.displayFrame.isFocusOwner()) update(); //Works on some computers (in case the above doesn't work)
		}});

		update();
	}
	
	
	public void addNotify() { //called internally - makes the component displayable
		super.addNotify();
		requestFocus();
	}

	public void startGame() {
		BufferedImage myPicture = null;
		try {
			myPicture = ImageIO.read(getClass().getClassLoader().getResource("team_open_source/RPG_Game/resources/images/backgrounds/room.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JLabel picLabel = new JLabel(new ImageIcon(myPicture));
		add(picLabel);
		

		timer.start();
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println(e);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(e);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println(e);
		// TODO Auto-generated method stub
		
	}

	
	public void update() {
		
		//updateLogic();
		
		updateGraphics();
		
		
		
		System.out.println("tick");
	}
	
	public void updateGraphics() {
		this.board.get(0);
	}
	
	
}
