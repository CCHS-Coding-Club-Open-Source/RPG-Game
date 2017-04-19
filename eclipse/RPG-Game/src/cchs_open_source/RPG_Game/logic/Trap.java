package cchs_open_source.RPG_Game.logic;

public abstract class Trap extends Thing {
boolean triggered; 
int dmg; 
public Trap(int xPos,int yPos){
	super(xPos, yPos);
	triggered = false;
}


}
