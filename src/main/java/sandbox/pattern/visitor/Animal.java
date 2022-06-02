package sandbox.pattern.visitor;

public interface Animal {
	void accept(Visitor visitor);

	default void makeSound() {
		System.out.println(this.getClass().getSimpleName() + " can't make sound.");
	}
}
