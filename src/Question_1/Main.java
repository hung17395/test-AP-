package Question_1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter title: ");
		String title = sc.nextLine();
		System.out.print("Enter price: ");
		int price = Integer.parseInt(sc.nextLine());
		Book book = new Book(title, price);
		int a = 0;
		boolean flag = true;
		do {
			System.out.println("1. Test getTitle()");
			System.out.println("2. Test setPrice()");
			System.out.print("Enter TC (1 or 2): ");
			a = Integer.parseInt(sc.nextLine());
	        switch (a) {
	            case 1:
	            	System.out.println("OUTPUT:");
	                System.out.println(book.getTitle());
	                break;
	            case 2:
	                System.out.print("Enter new price: ");
	                int newPrice = Integer.parseInt(sc.nextLine());
	                book.setPrice(newPrice);
	                System.out.println("OUTPUT:");
	                System.out.println(book.getPrice());
	                break;
	            default:
	                flag = false;
	                break;
	        }
		} while (flag);
	}
}
