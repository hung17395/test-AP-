package Question_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		MyCar myCar = new MyCar();
		List<Car> lstCar = new ArrayList<Car>();
		lstCar.add(new Car("A",6));
		lstCar.add(new Car("B",2));
		lstCar.add(new Car("C",9));
		lstCar.add(new Car("D",17));
		lstCar.add(new Car("E",8));
		lstCar.add(new Car("F",17));
		lstCar.add(new Car("G",2));
		int a = 0;
		boolean flag = true;
		do {
			System.out.print("Enter TC(1-f1;2-f2;3-f3): ");
			a = Integer.parseInt(sc.nextLine());
	        switch (a) {
	            case 1:
	            	System.out.println("The list before running f1: ");
	            	for(Car car: lstCar) {
	            		System.out.print("("+car.getMaker()+","+car.getRate()+") ");
	            	}
	            	System.out.println("\nOUTPUT:");
	            	System.out.println(myCar.f1(lstCar));
	                break;
	            case 2:
	            	System.out.println("The list before running f1: ");
	            	for(Car car: lstCar) {
	            		System.out.print("("+car.getMaker()+","+car.getRate()+") ");
	            	}
	            	myCar.f2(lstCar);
	            	System.out.println("\nOUTPUT:");
	            	for(Car car: lstCar) {
	            		System.out.print("("+car.getMaker()+","+car.getRate()+") ");
	            	}
	            	System.out.print("\n");
	                break;
	            case 3:
	            	myCar.f3(lstCar);
	            	System.out.println("OUTPUT:");
	            	for(Car car: lstCar) {
	            		System.out.print("("+car.getMaker()+","+car.getRate()+") ");
	            	}
	            	System.out.print("\n");
	                break;
	            default:
	                flag = false;
	                break;
	        }
		} while (flag);
	}
}
