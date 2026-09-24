import java.util.Scanner;

public class IT22309556Lab7Q1A {
	public static void main(String args[]){
	
	int mark1,mark2,mark3,mark4;
	double avg;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter marks for four subjects:");
	
	System.out.print("Enter Subject Mark 1: ");
	mark1 = sc.nextInt();
	
	System.out.print("Enter Subject Mark 2: ");
	mark2 = sc.nextInt();
	
	System.out.print("Enter Subject Mark 3: ");
	mark3 = sc.nextInt();
	
	System.out.print("Enter Subject Mark 4: ");
	mark4 = sc.nextInt();
	
	avg =(mark1+mark2+mark3+mark4)/4.0;
	
	System.out.println();
	System.out.println("Average is : "+avg);
	
	if(avg>=75)
	{
		System.out.println("Overall Grade is : Distinction");
	}
	else if(avg>=50)
	{
		System.out.println("Overall Grade is : Credit");
	}
	else
	{
		System.out.println("Overall Grade is : Fail");
	}
	
	}
}