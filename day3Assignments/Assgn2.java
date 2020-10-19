package javaEssentialsproject;

import java.util.Scanner;

public class Assgn2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the subjects marks");
		int sub1=sc.nextInt();
		int sub2=sc.nextInt();
		int sub3=sc.nextInt();
		int sub4=sc.nextInt();
		int sub5=sc.nextInt();
		sc.close();
		double total=sub1+sub2+sub3+sub4+sub5;
		double per=(total/500)*100;
		
		if(per>=90)
		{
			System.out.println("The grade is A and percentage is "+per);
		}
		else if(per>=80 && per<90)
		{
			System.out.println("The grade is B and percentage is "+per);
		}
		else if(per>=70 && per<80)
		{
			System.out.println("The grade is C and percentage is "+per);
		}
		else if(per>=55 && per<70)
		{
			System.out.println("The grade is D and percentage is "+per);
		}
		else if(per>=35 && per<55)
		{
			System.out.println("The grade is E and percentage is "+per);
		}
		else
		{
			System.out.println("The grade is F");
		}

	}

}
