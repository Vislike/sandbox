package sandbox.pattern.visitor;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		System.out.println("Animal test:");
		List<Animal> animals = List.of(new Dog(), new Cat(), new Horse(), new Mouse());

		for (Animal animal : animals) {
			animal.accept(new PetVisitor(false));
			animal.accept(new CallVisitor());
		}

		System.out.println("\nStable test:");
		Stable stable = new Stable();
		stable.add(new Horse());
		stable.add(new Horse());
		stable.add(new Horse());
		stable.add(new Cat());
		stable.add(new Mouse());
		stable.accept(new PetVisitor(true));
	}

}
