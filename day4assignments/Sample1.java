package javaEssentialsproject;

import java.util.Scanner;

public class Sample1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int arr[]=new int[5];
		 int sum=0;
		 for(int i=0;i<5;i++)
		 {
			 System.out.println("Enter values");
			 arr[i]=sc.nextInt();
			  sum +=arr[i];
			 
		 }
		 System.out.println("Total sum is: "+sum);
		 sc.close();

	}

}
