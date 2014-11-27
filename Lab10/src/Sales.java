// ***************************************************************
// Sales.java
//
// Reads in and stores sales for each of 5 salespeople. Displays
// sales entered by salesperson id and total sales for all salespeople.
//
// ***************************************************************
import java.util.Scanner;
public class Sales
{
	public static void main(String[] args)
	{
	//	final int SALESPEOPLE = 5;
	//	int[] sales = new int[SALESPEOPLE];
		int sum;
		int topSalesNum =-1;
		int topSalesAmount = 0;
		int minSalesNum =-1;
		int minSalesAmount = 100000;
		int salesFilter = 0;
		int numOfWinners = 0;
		int numberOfTeamMembers = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter how many people in the team:");
		numberOfTeamMembers = scan.nextInt();
		int[] sales = new int[numberOfTeamMembers];
		for (int i=0; i<sales.length; i++)
		{
			System.out.print("Enter sales for salesperson " + (i + 1) + ": ");
			sales[i] = scan.nextInt();
			if(sales[i] > topSalesAmount){
				topSalesAmount = sales[i];
				topSalesNum = i;
			}
			if(sales[i] < minSalesAmount){
				minSalesAmount = sales[i];
				minSalesNum = i;
			}
		}
		System.out.println("\nSalesperson Sales");
		System.out.println(" ------------------ ");
		sum = 0;
		for (int i=0; i<sales.length; i++)
		{
			System.out.println(" " + (i + 1) + " " + sales[i]);
			sum += sales[i];
		}
		System.out.println("\nTotal sales: " + sum);
		System.out.println("\nAverage sales: " 
		    + (int)((double)sum/ sales.length *100)/100.0);
		System.out.println("Salesperson " + topSalesNum 
				+" had the highest sale with $" + topSalesAmount + ".");
		System.out.println("Salesperson " + minSalesNum 
				+" had the lowest sale with $" + minSalesAmount + ".");
		System.out.println();
		System.out.println("Please enter a number as sales filter:");
		salesFilter = scan.nextInt();
		for (int i=0; i<sales.length; i++)
		{
			if(sales[i] > salesFilter){
				System.out.println("Salesperson " + (i + 1) 
					+ " with amount of $" + sales[i]);
				numOfWinners++;
			}
		}
		if (0 == numOfWinners) System.out.println("No one got so good!");
		else if (1 == numOfWinners) System.out.println("We have only one winner." );
		else System.out.println("We have " + numOfWinners + " winners." );
	}
}