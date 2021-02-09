package javaCode;
import java.util.*;
public class FirstLastDigit {

	public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          int num = scn.nextInt();
          int firstDigit, val, rev=0;
          int lastDigit = num % 10;
          while(num != 0) {
        	  val = num %10;
        	  rev = rev * 10 + val;
        	  num = num / 10;
          }
          firstDigit = rev %10;
          
          System.out.println(firstDigit + " " + lastDigit);

	}

}
