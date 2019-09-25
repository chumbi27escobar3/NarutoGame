package Model;

public class Clan {

	private String name;
	
	private GameCharacter primero;
	
	public Clan(String name) {
	
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Clan [name=" + name + "]";
	}
	
//	_______________________________________________________________________

	

	public void searchGameCharacter() {
		
	}
	
	public void deleterGameCharacter() {
		
	}
	
	public void addGameCharacter() {
		
	}
	
	
	
}
