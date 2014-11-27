//*************************************************
// Reversing.java
//
//*************************************************
import java.util.Scanner;
public class Reversing{
	public static void main(String[] args){
		int arraySize = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many int in your array:");
		arraySize = scan.nextInt();
		int[] array = new int[arraySize];
		for(int i = 0; i< array.length; i++){
			System.out.println("Enter the #" + (i + 1) + " integer:");
			array[i] = scan.nextInt();
		}
		System.out.println("Your array is: ");
		for (int val : array) System.out.print("  " + val);
		swap(array);
		System.out.println();
		System.out.println("Your reversed array is: ");
		for (int val : array) System.out.print("  " + val);
	}
	private static void swap(int[] myArray){
		int temp;
		int length = myArray.length;
		for( int i = 0; i < (length/ 2); i++){
			temp = myArray[i];
			myArray[i] = myArray[length -1 -i];
			myArray[length -1 -i] = temp;
		}
	}
}