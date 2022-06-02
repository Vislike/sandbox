package sandbox.pattern.visitor;

public interface Visitor {

	default void visit(Animal animal) {
		System.out.println(
				animal.getClass().getSimpleName() + " have no behavior for: " + this.getClass().getSimpleName());
	}

	void visit(Cat cat);

	void visit(Dog dog);

	default void visit(Horse horse) {
		System.out.println("Horse can not: " + this.getClass().getSimpleName());
	}
}
