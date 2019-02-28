package day7.com.app.core;

import java.util.*;

public class ArrayFsTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println(" enter emp details");
		
		Employee E = new Employee(sc.next(),sc.next());
		
		FixedStack F=new FixedStack();
		
		F.push(E);
		Employee E1 = new Employee(sc.next(),sc.next());
		F.push(E1);
		
		System.out.println(F.pop());
		System.out.println(F.pop());
		System.out.println(F.pop());

	}

}
