import java.util.Scanner;
public class Shopping{
	public static void main(String[] args){
		String name;
		double price;
		int quantity;
		char stop = 'n';
		Scanner scan = new Scanner(System.in);
		ShoppingCart myShoppingCart = new ShoppingCart();
		do{
			System.out.println("Enter product name:");
			name = scan.next();
			System.out.println("Enter product price:");
			price = scan.nextDouble();
			System.out.println("Enter product quantity:");
			quantity = scan.nextInt();
			myShoppingCart.addToCart( name, price, quantity);
			System.out.println(myShoppingCart);
			System.out.println("Do you want to continue: (y or n)");
			stop =scan.next().charAt(0);
		} while (stop == 'y');
		System.out.println("Shopping finished.");
	}
}