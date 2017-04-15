package team_open_source.RPG_Game.logic;

public class Enemy extends Being {
	public Enemy(int xPos, int yPos){
		super(xPos, yPos);
	}
	public int attack(){
		return ((int)( Math.random() * 3) + 1) + super.str;
	}
	
	public int dodge(){
		return ((int)( Math.random() * 3) + 1) + super.dex;
	}
	
	public void move(int xDir, int yDir){
	super.xPos += xDir;
	super.yPos += yDir;
	}
	
	public void next(){

	int numSelector = (int) (Math.random() * 8 )+ 1;
	switch(numSelector){
	
	case 1:
	{
		xPos--;
		yPos--;
		break;
	}
	case 2: 
	{
		yPos--;
		break;
	}
	case 3: 
	{
		xPos ++;
		yPos--;
		break;
	}
	
	case 4: 
	{
		xPos --;
		break;
	}
	
	case 5:
	{
		xPos ++;
		break;
	}
	
	case 6: 
	{
		xPos--;
		yPos++;
		break;
	}
	case 7:
	{
		yPos++;
		break;
	}
	
	case 8:
	{
		yPos++;
		xPos++;
		break;
	}
		
	
	}
	
	if(xPos >= 5){
		xPos = 4;
	}
	if(xPos < 0){
		xPos = 0; 
	}
	if(yPos >= 5){
		yPos = 4;
	}
	if(yPos < 0){
		yPos = 0;
	}
	
	System.out.println(xPos);
	System.out.println(yPos);
	}
	
	public String getImageName(){ return "Enemy?"; }
	
	
}
