package javaEssentialsproject;

import java.util.Scanner;


public class Assignq2 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = sc.next();
		System.out.println("Enter  birth date");
		int birth_date = sc.nextInt();
		System.out.println("Enter birth month");
		int birth_mon = sc.nextInt();
		System.out.println("Enter the birth year");
		int birth_year = sc.nextInt();
     	System.out.println("Enter the sal amount");
        int monthly_sal = sc.nextInt();
        
        int sal=monthly_sal*12;
        int age=2020-birth_year;
        System.out.println("Employee name is "+name);
        System.out.println("Age is "+age);      
        System.out.println("The annual salary is "+sal);
		
				
		
		
	
		if(sal>=500000)
		{
	       double tax=(20.0/100.0)*sal;
	       System.out.println("The tax amount is "+tax);
		}
		else if(sal>=400000 && sal<500000)
		{
			double tax=(15.0/100.0)*sal;
			System.out.println(tax);
		}
		else if(sal>=300000 && sal<400000)
		{
			double tax=(10.0/100.0)*sal;
			System.out.println(tax);
		}
		else if(sal>=200000 && sal<300000)
		{
			double tax=(5.0/100.0)*sal;
			System.out.println(tax);
		}
		else
		{
			System.out.println("N0 tax");
		}
	}
	

}
