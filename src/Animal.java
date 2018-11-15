import java.awt.Color;

public class Animal {
	private String animalType;
	private boolean canFly;
	private int legs;
	private boolean hasFurr;
	private boolean canSwim;
	private int eyes;
	private Color color;
	private int arms;
	private boolean isDangerous;
	private boolean isMeatEater;
	
	public Animal() {
		setAnimalType("Unknown");
		setCanFly(false);
		setLegs(4);
		setHasFurr(true);
		setCanSwim(false);
		setEyes(2);
		setColor(Color.BLACK);
		setArms(0);
		setIsDangerous(false);
		setIsMeatEater(true);
	}
	
	public Animal(
			String animalType,
			boolean canFly, int legs, boolean hasFurr, 
			boolean canSwim, int eyes, Color color, int arms, 
			boolean isDangerous, boolean isMeatEater) {	
		setAnimalType(animalType);
		setCanFly(canFly);
		setLegs(legs);
		setHasFurr(hasFurr);
		setCanSwim(canSwim);
		setEyes(eyes);
		setColor(color);
		setArms(arms);
		setIsDangerous(isDangerous);
		setIsMeatEater(isMeatEater);

	}
	
	
	String getAnimalType() {
		return animalType;
	}
	
	void setAnimalType(String type) {
		animalType  = type;
	}
	
	boolean getCanFly() {
		return canFly;
	}
	
	void setCanFly(boolean b) {
		canFly = b;
	}
	
	int getLegs() {
		return legs;
	}
	
	void setLegs(int number) {
		legs = number;
	}
	
	boolean getHasFurr() {
		return hasFurr;
	}
	
	void setHasFurr(boolean b) {
		hasFurr = b;
	}
	
	boolean getCanSwim() {
		return canSwim;
	}
	
	void setCanSwim(boolean b) {
		canSwim = b;
	}
	
	int getEyes() {
		return eyes;
	}
	
	void setEyes(int number) {
		eyes = number;
	}
	
	Color getColor() {
		return color;
	}
	
	void setColor(Color c) {
		color = c;
	}
	
	int getArms() {
		return arms;
	}
	
	void setArms(int number) {
		arms = number;
	}
	
	boolean getIsDangerous() {
		return isDangerous;
	}
	
	void setIsDangerous(boolean b) {
		isDangerous = b;
	}
	
	boolean getIsMeatEater() {
		return isMeatEater;
	}
	
	void setIsMeatEater(boolean b) {
		isMeatEater = b;
	}
	
	public String toString() {
		return 	" Animal = " + getAnimalType() + 
				" can fly =" + getCanFly() +
				" number legs  = " + getLegs() +
				" has furr = " + getHasFurr() +
				" can swim = " + getCanSwim() +
				" number eyes = " + getEyes() + 
				" color = " + getColor() +
				" number arms = " + getArms() +
				" is dangerous = " + getIsDangerous() +
				" is meat eater " +  getIsMeatEater();
		
	}
}

