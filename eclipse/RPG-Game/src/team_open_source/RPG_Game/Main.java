package team_open_source.RPG_Game;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import team_open_source.RPG_Game.graphics.GameDisplay;
import team_open_source.RPG_Game.graphics.OptionPanel;
import team_open_source.RPG_Game.logic.Board;
import team_open_source.RPG_Game.logic.Player;

/**
 * The main/runner class that is run by java to start the game
 * @author Team Open Source
 * @version 0.1.0
 */

public class Main {
	public static Player thePlayer;
    public static JFrame displayFrame;            //the frame will hold the JPanel 
    public static GameDisplay displayPanel;     //the panel will hold the text or graphics
    public static Dimension dim;
    public static int dim1;
    public static int dim2;
    public static int sqDim;
    public static OptionPanel optionPanel;
    public static Board board;
    
	/**
	 * @param args The arguments given when running the program.
	 */
	public static void main(String[] args) {
		board = new Board();
		
		
		// Get dimensions for the window
		dim = Toolkit.getDefaultToolkit().getScreenSize();
        dim1 = (int) dim.getWidth();
        dim2 = (int) dim.getHeight();
        if(dim1 > dim2) sqDim = (int) (dim2/1.5);
        else sqDim = (int) (dim1/1.5);
        

        displayFrame = new JFrame("RPG Game");
        displayFrame.setResizable(false);        
        displayFrame.setLayout(new BorderLayout());
        
        
        // When they close the window, call "exitGame()" to exit gracefully
        displayFrame.addWindowListener(new WindowAdapter() { @Override public void windowClosing(WindowEvent we){exitGame();} });
        displayFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        
        optionPanel = new OptionPanel();
        displayFrame.getContentPane().add(optionPanel, BorderLayout.NORTH);
        

        displayPanel = new GameDisplay(optionPanel, sqDim, board);
        displayPanel.setLayout(null);  // No layout manager because we want to set positions ourself
        displayPanel.setPreferredSize(new Dimension(sqDim, sqDim));
        displayPanel.startGame();
        displayFrame.getContentPane().add(displayPanel, BorderLayout.SOUTH);  //add the panel with the keylistener to the frame
        
        
        displayFrame.pack();
        displayFrame.setLocation(dim.width/2-displayFrame.getSize().width/2, dim.height/2-displayFrame.getSize().height/2);
        displayFrame.setVisible(true);         //let's see it
        

	}

	protected static void exitGame() {
		// TODO make sure to check and be sure this exits gracefully
		System.exit(0);
		
	}

}
