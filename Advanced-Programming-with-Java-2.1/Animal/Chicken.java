package Animal;

public class Chicken extends Animal implements Edible {
	@Override
	public String makeSound() {
		return "Chicken: cluck";
	}

	@Override
	public String howToEat() {
		return "Chicken can be fried or grilled.";
	}
}
