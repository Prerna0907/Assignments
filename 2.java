/*
Create a class Stack that declares a stack and the methods to perform push ( ), pop ( ) and checkEmpty () operations on the stack. 
Create two stacks and write a menu-driven program to perform operations on the two stacks. 
Whenever the number of elements in the two stacks becomes equal, a message should automatically be generated displaying the number of elements in each stack.
*/

import java.util.*;
class Stack
{
	private int [] stack;
	private int top,max;

	Stack (int i)
	{
		max = i;
		stack = new int [max];
		top = -1;
	}
	
	boolean checkEmpty()
	{
		if (max == -1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	void push (int data)
	{
		if (top == max)
		{
			System.out.println ("Overflow");
		}
		else
		{
			stack[++top] = data;
			
		}
	}
	
	int pop()
	{
		if (top == -1)
		{
			System.out.println ("Underflow");
			return 0;
		}
		else
		{
			return (stack[top--]);
		}
	}
	
	public int count()
	{
		if (top > -1)
		{
			return (top+1);
		}
		else 
		{
			return 0;
		}
	}
}


public class Assignment1_2 
{
	static void check (Stack s1, Stack s2)
	{
		if(s1.count() == s2.count())
		{
			System.out.println ("Both the stack have equal number of elements equal to:" + s1.count());
		}
	}
	
	public static void main (String args[])
	{
		Scanner sc = new Scanner (System.in);
		int x,y,choice,element,ch;
		
		System.out.println ("Enter the maximum number of elements for both the stack");
		x = sc.nextInt();
		y = sc.nextInt();
		
		Stack ob1 = new Stack(x);
		Stack ob2 = new Stack(y);
		
		do
		{
			System.out.println("MENU \n1. Push in Stack 1 \n2. Push in Stack 2 \n3. Pop in Stack 1 \n4. Pop in Stack 2 \n5.Check if Stack 1 is empty \n5.Check if Stack 2 is empty");
			System.out.println ("Enter your choice");
			ch= sc.nextInt();
			
			switch(ch)
			{
				case 1:
					System.out.println("Enter the element");
					element = sc.nextInt();
					ob1.push(element);
					check(ob1,ob2);
					break;
					
				case 2:
					System.out.println("Enter the element");
					element = sc.nextInt();
					ob2.push(element);
					check(ob1,ob2);
					break;
					
				case 3:
					element = ob1.pop();
					System.out.println(element);
					check(ob1,ob2);
					break;
					
				case 4:
					element = ob2.pop();
					System.out.println(element);
					check(ob1,ob2);
					break;
					
				case 5:
					ob1.checkEmpty();
					check(ob1,ob2);
					break;
				
				case 6:
					ob2.checkEmpty();
					check(ob1,ob2);
					break;
			}
			
			System.out.println("If you wish to continue press 0");
			choice = sc.nextInt();
			
		} while(choice == 0);
		
		sc.close();
	}
}
