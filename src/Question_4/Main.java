package Question_4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		MyString myString = new MyString();
		int a = 0;
		boolean flag = true;
		do {
			System.out.println("1. Test f1()");
			System.out.println("2. Test f2()");
			System.out.print("Enter TC (1, 2): ");
			a = Integer.parseInt(sc.nextLine());
	        switch (a) {
	            case 1:
	        		System.out.println("Enter a string: ");
	        		String str1 = sc.nextLine();
	        		System.out.println("OUTPUT: ");
	        		System.out.println(myString.f1(str1));
	                break;
	            case 2:
	            	System.out.println("Enter a string: ");
	        		String str2 = sc.nextLine();
	        		System.out.println("OUTPUT: ");
	        		System.out.println(myString.f2(str2));
	                break;
	            default:
	                flag = false;
	                break;
	        }
		} while (flag);
	}
}
