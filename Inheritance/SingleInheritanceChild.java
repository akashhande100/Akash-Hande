package Inheritance;

public class SingleInheritanceChild extends SingleInheritanceParent{
	
	public void multiplication(int a, int b) {
		
		int c = a*b;
		System.out.println("Multiplication ="+c);
		}
	
	public static void main(String[] args){
		//Reference						   //Object
		SingleInheritanceParent obj = new SingleInheritanceParent();		//In Parent obj. you can not call Child Class methods
		obj.addition(45,7);
		obj.subtraction(10,7);
		//The method multiplication(int, int) is undefined for the type SingleInheritanceParent
		//obj.multiplication(3,5);
		
		SingleInheritanceChild child = new SingleInheritanceChild();		//In Child obj. you can call Parent Class methods
		child.multiplication(7,3);
		child.addition(45,7);
		child.subtraction(10,7);
		
		SingleInheritanceParent parentChild = new SingleInheritanceChild();		//In Parent Reference you can not call Child class methods
		parentChild.addition(10, 20);
		parentChild.subtraction(35, 21);
		//The method multiplication(int, int) is undefined for the type SingleInheritanceParent
		//parentChild.multiplication(7,3);
		
		//SingleInheritanceChild childParent = new SingleInheritanceParent();	//In Child Reference you can not call Parent class methods
		//Type mismatch: cannot convert from SingleInheritanceParent to SingleInheritanceChild
		
	}

}
