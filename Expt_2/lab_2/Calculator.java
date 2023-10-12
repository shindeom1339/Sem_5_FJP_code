import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		int choice;
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Roll No: 32358");
		System.out.println("Name: Om Shinde");
		System.out.println("Batch: M7\n");
		
		System.out.println("Welcome to Calculator, we have following operation:\n1. Addition \n2. Substraction \n3. Multiplication \n4. Division \n5. Factorial \n6. Sqaure \n7. Cube\n");
		
		int testcase;
		System.out.println("Number of operations you want to perform: ");
		testcase = obj.nextInt();
		
		while (testcase>0)
		{
			System.out.println("Enter your choice for performing respective operation: ");
			choice = obj.nextInt();
			
			switch(choice) {
			case 1:
			{
				int num_1;			
				int num_2;
				System.out.println("Enter num1: ");
				num_1 = obj.nextInt();
				
				System.out.println("Enter num2: ");
				num_2 = obj.nextInt();
				
				System.out.println("The sum of " + num_1 + " and " + num_2 + " is: " + (num_1 + num_2) + "\n");
				break;
			}
			case 2:
			{
				int num_1;			
				int num_2;
				System.out.println("Enter num1: ");
				num_1 = obj.nextInt();
				
				System.out.println("Enter num2: ");
				num_2 = obj.nextInt();
				
				System.out.println("The substraction of " + num_1 + " and " + num_2 + " is: " + (num_1 - num_2) + "\n");
				break;
			}
			case 3:
			{
				int num_1;			
				int num_2;
				System.out.println("Enter num1: ");
				num_1 = obj.nextInt();
				
				System.out.println("Enter num2: ");
				num_2 = obj.nextInt();
				
				System.out.println("The multiplication of " + num_1 + " and " + num_2 + " is: " + (num_1 * num_2) + "\n");
				break;
			}
			case 4:
			{
				float num_1;			
				float num_2;
				System.out.println("Enter num1: ");
				num_1 = obj.nextInt();
				
				System.out.println("Enter num2: ");
				num_2 = obj.nextInt();
				
				System.out.println("The division of " + num_1 + " and " + num_2 + " is: " + (num_1 / num_2) + "\n");
				break;
			}
			case 5:
			{
				long num_1;
				System.out.println("Enter the number of numbers you want to calculate factorial for: ");
				num_1 = obj.nextInt();
				
				long fact = 1;
				for (long i=1; i<=num_1; i++) {
					fact = fact*i;
				}
				
				System.out.println("The factorial of first " + num_1 + " numbers is: " + (fact) + "\n");
				break;
			}
			case 6:
			{
				int num_1;
				System.out.println("Enter number: ");
				num_1 = obj.nextInt();
				
				System.out.println("The sqaure of " + num_1 + " is: " + (num_1 * num_1) + "\n");
				break;
			}
			case 7:
			{
				int num_1;
				System.out.println("Enter number: ");
				num_1 = obj.nextInt();
				
				System.out.println("The cube of " + num_1 + " is: " + (num_1 * num_1 * num_1) + "\n");
				break;
			}
			default:
				System.out.println("Please choose valid operation!");
			}
			testcase--;
		}
		
	}

}
