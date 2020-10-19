package javaEssentialsproject;

import java.util.Scanner;

public class Aveng {

	public static void main(String[] args) 
	{
		 Avenger[] arr=new Avenger[5];
		 
		 
		 for(int i=0;i<5;i++)
		 {
			 arr[i]=new Avenger();
			 arr[i].getDetails();
			 arr[i].displayDetails();
		 }
		 
		 
	}

}



class Avenger
{
	Scanner sc=new Scanner(System.in);
	String name;
	int age;
	int power;
	String weapon;
	String planet;
	
	
	public void getDetails()
	{
		
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter age");
		age=sc.nextInt();
		System.out.println("Enter power");
		power=sc.nextInt();
		System.out.println("Enter weapon");
		weapon=sc.next();
		System.out.println("Enter planet");
		planet=sc.next();
		
		
		
	}
	
	public void displayDetails()
	{
		System.out.println("Name: "+name+" "+"Age: "+age+" "+"Power: "+power);
		System.out.println("Weapon: "+" "+weapon+" "+"Planet: "+planet);
	}
}