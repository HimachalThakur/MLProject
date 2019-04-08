package demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

class StringDemo1 {
	
	public  static String message;
	
	public void show()
	{
		message="welcome";
		
		
	}
}


public class StringDemo {
	
	public String message;
	
	public static void main(String args[])
	{
		StringDemo sd=new StringDemo();
		
		StringDemo1 sd1=new StringDemo1();
		sd1.show();
		StringDemo1 sd2=new StringDemo1();

		
		System.out.println(sd2.message);
	}
}
