package java_assign_abhi;

public class swap_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4. Swap two variable with out using third variable
		
		int a=3;
		int b=5;
		
		System.out.println("a= "+a+"  b= "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swapping");
		System.out.println("a= "+a+ "  b= "+b);
	}

}
