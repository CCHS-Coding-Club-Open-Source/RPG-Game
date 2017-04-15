package team_open_source.RPG_Game;

public abstract class Being {
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
	
	}
	
	public int attack(){
		return str +(int) (Math.random() * 3) + 1;
	}
	
	public int dodge(){
		return dex + (int) (Math.random() * 3) + 1;
	}
	
	
}
