package Question_2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter maker: ");
		String maker = sc.nextLine();
		System.out.print("Enter price: ");
		int price = Integer.parseInt(sc.nextLine());
		System.out.print("Enter type: ");
		int type = Integer.parseInt(sc.nextLine());
		SpecCar specCar = new SpecCar(maker, price, type);
		int a = 0;
		boolean flag = true;
		do {
			System.out.println("1. Test toString()");
			System.out.println("2. Test setData()");
			System.out.println("3. Test getValue()");
			System.out.print("Enter TC (1, 2, 3): ");
			a = Integer.parseInt(sc.nextLine());
	        switch (a) {
	            case 1:
	        		Car car1 = new Car(specCar.getMaker(), specCar.getPrice());
	        		System.out.println("OUTPUT:");
	            	System.out.println(car1.toString());
	                System.out.println(specCar.toString());
	                break;
	            case 2:
	            	specCar.setData();
	            	Car car2 = new Car(specCar.getMaker(), specCar.getPrice());
	            	System.out.println("OUTPUT:");
	            	System.out.println(car2.toString());
	                break;
	            case 3:
	            	System.out.println("OUTPUT:");
	            	System.out.println(specCar.getValue());
	                break;
	            default:
	                flag = false;
	                break;
	        }
		} while (flag);
	}
}
