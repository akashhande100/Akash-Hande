package Inheritance;

public class SingleInheritanceChild1 extends SingleInheritanceParent1{
	
	public void cycle() {
		System.out.println("Atlas");
	}
	
	public static void main(String[] args) {
		
		SingleInheritanceParent1 parent = new SingleInheritanceParent1();
		parent.bike();
		parent.car();
		
		SingleInheritanceParent1 parent1 = new SingleInheritanceChild1();
		parent1.bike();
		parent1.car();
		
		SingleInheritanceChild1 child = new SingleInheritanceChild1();
		child.bike();
		child.car();
		child.cycle();
		
		//SingleInheritanceChild1 child1 = new SingleInheritanceParent1();
		
		
	}

}
