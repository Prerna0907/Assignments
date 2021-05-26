/*
Create a class called Time, which has three private instance variables – hour, min and sec. 
It contains a method called add ( ) which takes one Time object as parameter and print the added value of the calling Time object and passes Time object. 
In the main method, declare two Time objects and assign values using constructor and call the add ( ) method.
*/

import java.util.*;
class Time
{
	private int hour, min, sec;
	
	Time ( ) 
	{
		this.hour = 0;
		this.min = 0;
		this.sec = 0;
	}
	
	Time (int hour, int min, int sec)
	{
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}
	
	public void printTime ()
	{
		System.out.println(hour + ":" + min + ":" + sec);
	}
	
	public Time add(Time t)
	{
		Time add1 = new Time( );
		add1.hour = this.hour + t.hour;
		add1.min = this.min + t.min;
		add1.sec = this.sec + t.sec; 
		
		if(add1.sec >= 60)
		{
			add1.min++;
			add1.sec = add1.sec - 60;
		}
		
		if(add1.min >= 60)
		{
			add1.hour++;
			add1.min = add1.min - 60;
		}
		
		return (add1);
	}
}

public class Assignment1_1 
{
	public static void main (String args [])
	{
		Scanner sc = new Scanner(System.in);
		int h, m, s;
		System.out.println ("Enter the hour, minutes and seconds for the first object:");
		h = sc.nextInt();
		m = sc.nextInt();
		s = sc.nextInt();
		Time obj1 = new Time (h, m, s);
		System.out.println ("Enter the hour, minutes and seconds for the second object:");
		h = sc.nextInt();
		m = sc.nextInt();
		s = sc.nextInt();
		Time obj2 = new Time (h,m,s);
		
		Time obj3 = obj1.add(obj2);
		obj3.printTime();
		
		sc.close();
	}
}
