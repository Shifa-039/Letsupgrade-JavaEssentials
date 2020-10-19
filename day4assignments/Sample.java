package javaEssentialsproject;


//create an int array with 5 values and print only odd values
public class Sample {

	public static void main(String[] args) {
            

		int arr[]={23,45,78,51,60};
		for(int i=0;i<5;i++)
		{
			if(arr[i]%2==1)
			{
				System.out.println(arr[i]);
			}
		}
	}

}
