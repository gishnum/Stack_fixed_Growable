package day7.com.tester;

import java.util.*;
import day7.com.app.core.*;
import day7.com.app.core.Stack;

public class Tester {

	public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in);

		
		boolean exit = false;
		System.out.println("1 -- Choose Fixed Stack\r\n" + 
				"2 -- Choose Growable Stack \nAccept following options only after initial selection.\r\n" + 
				"3 -- Push data \r\n" + 
				"4 --- Pop data");
		
		Stack st = null;
		
//		FixedStack f = new FixedStack();
		//GrowableStack g = new GrowableStack();
		do
		{
			
			System.out.print("\n Your Choice ??? ");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1:
					if(st == null)
					{
						st = new FixedStack();
						System.out.println("*Fixed stack created ");
					}else
					{
						System.out.println("**GrowableStack is already created");
					}
					break;
				case 2:
					if(st == null)
					{
						st = new GrowableStack();
						System.out.println("*Growable stack created ");
					}else
					{
						System.out.println("**FixedStack is already created");
					}
					
					break;
				case 3:
					if(st!=null) {
						System.out.println(" Enter id and name");
						Employee e = new Employee(sc.next(), sc.next());
						st.push(e);
					}else
					{
						System.out.println("Please create a Stack First");
					}
					break;
				case 4:
//					st.pop();
					if(st!=null) {
						System.out.println(st.pop());
					}
					break;
				case 5:
					System.out.println(st);
					break;
				default:
					System.out.println("Exiting.........");
					exit = true;
			}
		}while( !exit );
	}



		
		

	}

