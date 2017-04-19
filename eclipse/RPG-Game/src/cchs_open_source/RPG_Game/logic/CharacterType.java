package cchs_open_source.RPG_Game.logic;

public abstract class CharacterType {
String name; 
//TODO much much more 
	public CharacterType(String name){
	 this.name = name;
	 
 }
	public abstract int attack(); 
	
	public abstract int defend();
	
	public abstract int heal();
}
