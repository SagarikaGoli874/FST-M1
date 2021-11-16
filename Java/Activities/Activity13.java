package activities;

import java.util.ArrayList;
import java.util.Scanner;

public class Activity13  {
	
	public static void main(String[] args)
	{
	 
	 Scanner scan=new Scanner(System.in);	
	 ArrayList<Integer> list = new ArrayList<Integer>();
	 System.out.print("Enter integers please ");
	 while(scan.hasNextInt())
	 {
		 list.add(scan.nextInt());	
	 }
		System.out.print("Below are the entered integers"); 
		list.forEach(System.out::println);  
	}


}
