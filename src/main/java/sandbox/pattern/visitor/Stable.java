package sandbox.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

public class Stable implements Animal {

	private List<Animal> animals = new ArrayList<>();

	public void add(Animal animal) {
		animals.add(animal);
	}

	@Override
	public void accept(Visitor visitor) {
		for (Animal animal : animals) {
			animal.accept(visitor);
		}
	}
}
