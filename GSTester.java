package day7.com.app.core;

import java.util.Scanner;

public class GSTester {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println(" enter emp details");
		
		Employee E = new Employee(sc.next(),sc.next());
		
		GrowableStack G = new GrowableStack();
		
		G.push(E);
		
		Employee E1 = new Employee(sc.next(),sc.next());
		
		G.push(E1);
		
		Employee E2 = new Employee(sc.next(),sc.next());
		
		G.push(E2);
		
		G.push(E);
		G.push(E1);
		G.push(E2);
		
		G.push(E);
		G.push(E1);
		G.push(E2);
		
		G.push(E);
		G.push(E1);
		G.push(E2);
		
		G.push(E);
		
		
		System.out.println(G.getsize());
		
		/*
		 * boolean exit = false;
		 * 
		 * while(! exit) {
		 * 
		 * switch(ch) {
		 * 
		 * case 1:
		 * 
		 * 
		 * }
		 * 
		 * 
		 * }
		 * 
		 */
				
		
		
		
	}

}
