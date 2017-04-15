package team_open_source.RPG_Game.logic;
import java.util.ArrayList;
public class RoomGenerator {
	public RoomGenerator(){
}
	public ArrayList<Thing> genRoom(int floorNum){
		ArrayList<Thing> returns = new ArrayList<Thing>();
		switch(floorNum){
		case 1: {
			Goblin Gobbo = new Goblin(3,3);
			returns.add(Gobbo);
			return returns;
		}
		case 2: 
		{
			Enemy e1 = RoomGenerator.genEnemy();
			returns.add(e1);
			return returns;
		}
		case 3:
		{
			Enemy e1 = RoomGenerator.genEnemy();
			returns.add(e1);
			return returns;
		}
		case 4: 
		{
			Enemy e1 = RoomGenerator.genEnemy();
			returns.add(e1);
			return returns;
		}
		case 5: 
		{
			Enemy e2 = RoomGenerator.genEnemy();
			returns.add(e2);
			return returns;
		}
		case 6: 
		{
			Enemy e2 = RoomGenerator.genEnemy();
			returns.add(e2);
			return returns;
		}
		case 7: 
		{
			Enemy e2 = RoomGenerator.genEnemy();
			returns.add(e2);
			return returns;
		}
		case 8: 
		{
			Enemy e3 = RoomGenerator.genEnemy();
			returns.add(e3);
			return returns;
		}
		
		case 9: 
		{
			DarkKnight allways = new DarkKnight(3,3); //He always triumphs;
			returns.add(allways);
			return returns;
		}
		case 10: 
		{
			Enemy e3 = RoomGenerator.genEnemy();
			returns.add(e3);
			return returns;
		}
		case 11:
		{
			Dragon smaug = new Dragon(3,3);
			returns.add(smaug);
			return returns;
		}
		default:
		{
			return returns;
		}
		
		}
	}
	
	public static Enemy genEnemy(){
		int monNum = (int) (Math.random() * 6) + 1;
		switch(monNum){
		case 1: {
			Zombie zoombie = new Zombie(3,3);
			return zoombie;
		}	
		case 2:{
			Ogre shrek = new Ogre(3,3); //It's all ogre now...
			return shrek;
		}
		case 3:{
			Golem g = new Golem(3,3);
			return g;
		}
		case 4: {
			DarkElf drizzt = new DarkElf(3,3);
			return drizzt;
			}
		case 5: {
			EldAbom spoopy = new EldAbom(3,3);
			return spoopy;
		}
		case 6: {
			Trickster loki = new Trickster(3,3);
			return loki;
		}
		default:{
			Goblin failure = new Goblin(3,3);
			return failure;
		}
		}
	}
}
