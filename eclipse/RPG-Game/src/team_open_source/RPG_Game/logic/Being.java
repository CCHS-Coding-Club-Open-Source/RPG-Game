package team_open_source.RPG_Game.logic;

public abstract class Being extends Thing {
	int str;
	int con;
	int dex;
	int intel;
	int wis;
	int cha;
	int health;
	

	public Being(int xPos, int yPos){
	super(xPos, yPos);
	str = 1;
	con = 1;
	dex = 1;
	intel = 1;
	wis = 1;
	cha =1;
	
	}
	
	public Being(int xPos, int yPos, int str, int con, int dex, int intel, int wis, int cha){
	super(xPos, yPos);
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
	
	public void subHealth(int damage){
		health -= damage;
	}
	
	public void addToStat(int stat){
	switch(stat){
	case 1:
	{
		str++;
	}
	case 2:
	{
		con++;
	}
	case 3:
	{
		dex++;
	}
	case 4:
	{
		intel++;
	}
	case 5:
	{
		wis++;
	}
	case 6:
	{
		cha++;
	}
	
	}	
	}
	
}

	
