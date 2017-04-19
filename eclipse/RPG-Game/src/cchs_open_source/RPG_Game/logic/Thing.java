package cchs_open_source.RPG_Game.logic;

public abstract class Thing {
int xPos;
int yPos;
 
	public Thing(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
	public abstract String getImageName();

	public int getxPos() {
		return this.xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public int getyPos() {
		return this.yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}
	
	public abstract void next();
	
		
	
}
