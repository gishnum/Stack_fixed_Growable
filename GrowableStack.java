package day7.com.app.core;

public class GrowableStack implements Stack {

	private int top;
	private Employee[] Emp;
	
	private int size = STACK_SIZE;
	
	public GrowableStack()
	{
		top = -1;
		Emp = new Employee[size];
	}
	
	public void push(Employee E)
	{
		if(top < size-1)
			Emp[++top]=E;
		
		else
		{
			System.out.println(" new memory allocation");
			
			size = (Emp.length*2);
			
			Employee[] temp = new Employee[size];
			 
			 for( int i =0;i < Emp.length ;i++)
			 { temp[i]=Emp[i]; 
			 System.out.println("mem length :: "+Emp.length + " inside forloop");
			 }
			 Emp=temp;
			
			 
			 Emp[++top]=E;
			
		}
		
		
		
	}
	
	public Employee pop()
	{
		if( top == -1)
			return null;
		
		return Emp[top--];
		
	}
	
	
	public int getsize()
	{
		return size;
	}
}
