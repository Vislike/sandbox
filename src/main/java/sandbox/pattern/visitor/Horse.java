package sandbox.pattern.visitor;

public class Horse implements Animal {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	@Override
	public void makeSound() {
		System.out.println("Neigh");
	}
}
