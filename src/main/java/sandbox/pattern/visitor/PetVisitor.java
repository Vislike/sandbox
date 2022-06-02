package sandbox.pattern.visitor;

import java.util.Random;

public class PetVisitor implements Visitor {

	private final Random random = new Random();
	private final boolean canMakeSound;

	public PetVisitor(boolean canMakeSound) {
		this.canMakeSound = canMakeSound;
	}

	@Override
	public void visit(Cat cat) {
		System.out.println("Petting Cat.");
		chanceSound(cat);
	}

	@Override
	public void visit(Dog dog) {
		System.out.println("Petting Dog.");
		chanceSound(dog);
	}

	@Override
	public void visit(Horse horse) {
		System.out.println("Petting Horse.");
		chanceSound(horse);
	}

	private void chanceSound(Animal animal) {
		if (canMakeSound && random.nextBoolean()) {
			animal.makeSound();
		}
	}
}
