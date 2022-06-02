package sandbox.pattern.visitor;

public class CallVisitor implements Visitor {

	@Override
	public void visit(Animal animal) {
		System.out.println("Common call");
	}

	@Override
	public void visit(Cat cat) {
		System.out.println("Here kitty");
	}

	@Override
	public void visit(Dog dog) {
		System.out.println("Come on boy");
	}
}
