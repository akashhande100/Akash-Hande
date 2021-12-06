package Inheritance;

import oOOPSConcept.SingleInheritanceChild;		//Import Child class Package
import oOOPSConcept.SingleInheritanceParent;	//Import Parent class Package

public abstract class SingleInheritaceChildWithAbstract extends SingleInheritanceParentWithAbstract{

public void multiplication(int a, int b) {
		
		int c = a*b;
		System.out.println("Multiplication ="+c);
		}
	
public static void main(String[] args){
						  
	SingleInheritanceParent obj = new SingleInheritanceParent();		
	obj.addition(45,7);
	obj.subtraction(10,7);

	SingleInheritanceChild child = new SingleInheritanceChild();		
	child.multiplication(7,3);
	child.addition(45,7);
	child.subtraction(10,7);
	
	SingleInheritanceParent parentChild = new SingleInheritanceChild();		
	parentChild.addition(10, 20);
	parentChild.subtraction(35, 21);
		
}
}
