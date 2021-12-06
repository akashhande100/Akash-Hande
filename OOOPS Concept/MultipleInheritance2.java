package multipleInheritance;

public class MultipleInheritance2 extends MultipleInheritance1{
	
    public void vivo() {
		
		System.out.println("V20");
	}
    
    public static void main(String[] args) {
		
    	MultipleInheritance m = new MultipleInheritance();
    	m.samsung();
    	
    	MultipleInheritance m1 = new MultipleInheritance1();
    	m1.samsung();
    	
    	MultipleInheritance m2 = new MultipleInheritance2();
    	m2.samsung();
    	
    	MultipleInheritance1 s = new MultipleInheritance1();
    	s.oppo();
    	s.samsung();
    	
    	MultipleInheritance1 s1 = new MultipleInheritance2();
    	s1.oppo();
    	s1.samsung();
    	
    	MultipleInheritance2 a = new MultipleInheritance2();
    	a.samsung();
    	a.oppo();
    	a.vivo();
    	
    	
	}



}
