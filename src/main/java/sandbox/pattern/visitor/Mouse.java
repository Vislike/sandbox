package sandbox.pattern.visitor;

public class Mouse implements Animal {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	@Override
	public void makeSound() {
		System.out.println("Squeak");
	}
}
