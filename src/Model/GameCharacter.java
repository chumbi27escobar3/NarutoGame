package Model;

import java.util.Date;

public class GameCharacter {

	private String name;
	private String personality;
	private Date dayCreation;
	private String power;
	
	private GameCharacter siguiente;
	private GameCharacter anterior;
	
	private Technique primero;	
	
	public GameCharacter(String name, String personality, Date dayCreation, String power) {
		this.name = name;
		this.personality = personality;
		this.dayCreation = dayCreation;
		this.power = power;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPersonality() {
		return personality;
	}

	public void setPersonality(String personality) {
		this.personality = personality;
	}

	public Date getDayCreation() {
		return dayCreation;
	}

	public void setDayCreation(Date dayCreation) {
		this.dayCreation = dayCreation;
	}
	
	@Override
	public String toString() {
		return "GameCharacter [name=" + name + ", personality=" + personality + ", dayCreation=" + dayCreation
				+ ", power=" + power + "]";
	}
	
//	__________________________________________________________________________________________________________________

	public void deleterTechine(String name) {
		
	}
	
	public void addTechnique(Technique e) {
		
	}
	
	public void searchTechnique() {
		
	}
	
}
