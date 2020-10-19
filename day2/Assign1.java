package javaEssentialsproject;

public class Assign1 {

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		e1.name="Saurab";
		e1.age=23;
		e1.city="Chennai";
		e1.display();
		Employee e2=new Employee();
		e2.name="Saurab";
		e2.age=23;
		e2.city="Chennai";
		e2.display();
		

	}

}


class Employee
{
	String name;
	int age;
	String city;
	
	public void display()
	{
		System.out.println("The name is "+name);
		System.out.println("The age is "+age);
		System.out.println("The city is "+city);
	}
}
