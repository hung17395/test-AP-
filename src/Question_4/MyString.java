package Question_4;

import java.util.Collections;

public class MyString implements IString{
	@Override
	public int f1(String str) {
		int sum = 0;
		for(int i = 0; i<str.length(); i++) {
			if(isNumeric(String.valueOf(str.charAt(i)))) {
				if(isPrimeNumber(Character.getNumericValue(str.charAt(i)))){
					sum++;
				}
			}
		}
		return sum;
	}
	@Override
    public String f2(String str) {
		String [] src = str.split(" ");
		for (int i = 0, j = src.length - 1; i < j; i++, j--){
            String temp = src[i];
            src[i]  = src[j];
            src[j] = temp;
        }
		str = String.join(" ", src);
    	return str;
    }
	
	public static boolean isNumeric(String str) {
		return str.matches("-?\\d+(\\.\\d+)?");
	}
	
	public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    
}
