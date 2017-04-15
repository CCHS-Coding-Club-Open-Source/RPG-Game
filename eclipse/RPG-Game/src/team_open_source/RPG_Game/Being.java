package team_open_source.RPG_Game;

public abstract class Being extends Thing {
	int str;
	int con;
	int dex;
	int intel;
	int wis;
	int cha;
	

	public Being(){
	str = 1;
	con = 1;
	dex = 1;
	intel = 1;
	wis = 1;
	cha =1;
	xPos = 0;
	yPos = 0;
	
	}
	
	public Being(int str, int con, int dex, int intel, int wis, int cha){
	this.str = str;
	this.con = con;
	this.dex = dex;
	this.intel = intel;
	this.wis = wis;
	this.cha = cha;
	}
	
	public abstract int attack();
	
	public abstract int dodge();	
	
	public abstract void move(int xdir, int ydir);
	
	public void next(){
		
	}
	
}

	
