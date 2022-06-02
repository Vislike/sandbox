package sandbox.pattern.visitor;

public class Dog implements Animal {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	@Override
	public void makeSound() {
		System.out.println("Woof");
	}
}
