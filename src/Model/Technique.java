package Model;

public class Technique {

	private String nameTechine;
	private String power;
	
	public Technique(String nameTechine, String power) {
		this.nameTechine = nameTechine;
		this.power = power;
	}

	public String getNameTechine() {
		return nameTechine;
	}

	public void setNameTechine(String nameTechine) {
		this.nameTechine = nameTechine;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}
		
	
}
