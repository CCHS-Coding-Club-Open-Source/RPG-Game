package team_open_source.RPG_Game.graphics;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import team_open_source.RPG_Game.Main;
import team_open_source.RPG_Game.logic.Board;
import team_open_source.RPG_Game.logic.Room;
import team_open_source.RPG_Game.logic.Thing;

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
	int sqDim;
	Room room;
	JLabel background;
	Dimension bgrndSz;
	ImageIcon backgroundImage;
	int roomNumber;
	
	public GameDisplay(OptionPanel optionPanel, int sqDim, Board board) {
		roomNumber = 1;
		this.sqDim = sqDim;
		this.board = board;

		QUICKNESS = 1000;
		
		addKeyListener(this); //the panel will listen to the keyboard for key events

		
		timer = new Timer(QUICKNESS, new ActionListener(){   
			public void actionPerformed(ActionEvent e) {
				//If the window is selected/focused, update()
				if(isFocusOwner()) updt(); //Works most of the time
				else if(Main.displayFrame.isFocusOwner()) updt(); //Works on some computers (in case the above doesn't work)
		}});

	}
	
	
	public void addNotify() { //called internally - makes the component displayable
		super.addNotify();
		requestFocus();
	}

	public void startGame() {
		BufferedImage backgroundPicture = null;
		try {
			backgroundPicture = ImageIO.read(getClass().getClassLoader().getResource("team_open_source/RPG_Game/resources/images/backgrounds/room.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		backgroundImage = new ImageIcon(backgroundPicture.getScaledInstance(sqDim, sqDim, Image.SCALE_DEFAULT));

		
		this.room = board.get(roomNumber);  //TODO actually get the rooms in a loop or something where we can move to the next one
		
		updt();
		timer.start();
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println(e);
		if( roomNumber < 10 ){
			roomNumber++;
		}else{
			roomNumber = 1;
		}
		startGame();
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

	
	public void updt() {
		
		//updateLogic();
		
		updateGraphics();
		
		
	}
	
	public void updateGraphics() {
		removeAll();
		

		background = new JLabel(backgroundImage);
		bgrndSz = background.getPreferredSize();
		
		
		background.setBounds(0, 0, bgrndSz.width, bgrndSz.height);
		add(background);

		this.room.move();
		
		ArrayList<Thing> itemsInRoom = room.getAll();
		
		for(int i = 0; i < itemsInRoom.size(); i++) {
			Thing thing = itemsInRoom.get(i);

			int x = thing.getxPos();
			int y = thing.getyPos();
			
			int xCoord = x*(sqDim/5);
			int yCoord = y*(sqDim/5);
			
			try {
				Image img = ImageIO.read(getClass().getClassLoader().getResource("team_open_source/RPG_Game/resources/images/thing/" + thing.getImageName()));
				ImageIcon imgIcon = new ImageIcon(img.getScaledInstance(sqDim/5, sqDim/5, Image.SCALE_DEFAULT));
				JLabel imageLabel = new JLabel(imgIcon);
				
				imageLabel.setBounds(xCoord, yCoord, imageLabel.getPreferredSize().width, imageLabel.getPreferredSize().height);
				background.add(imageLabel);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		repaint();
		
		
	}
	
	
}
