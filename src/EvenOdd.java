import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
    	Scanner scn = new Scanner(System.in);
    	int t = scn.nextInt();
    	int num, sumE = 0, sumO = 0;
    	while(t != 0) {
    		num = scn.nextInt();
    		if(num%2 == 0) {
    			sumE = sumE + num;
    		} else {
    			sumO = sumO + num;
    		}
    		t--;
    	}
    	System.out.println("sum of even number " + sumE + "\nsum of odd number " + sumO);
    }
}
