import java.awt.Color;

public class Zoo {

	public static void main(String[] args) {
		
		Animal blackBear = new Animal();
		blackBear.setAnimalType("bear");
		blackBear.setIsDangerous(true);
		
		Animal polarBear = new Animal();
		polarBear.setAnimalType("bear");
		polarBear.setIsDangerous(true);
		polarBear.setColor(Color.WHITE);
		
		Animal snake = new Animal();
		snake.setAnimalType("snake");
		snake.setIsMeatEater(false);
		snake.setArms(0);
		
		Animal zooAnimals[] = {blackBear,polarBear,snake};
		
		System.out.println("Zoo animals: ");
		for(int i=0; i<zooAnimals.length; i++) {
			System.out.println(zooAnimals[i]);
		}
		

	}

}
