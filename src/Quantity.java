import java.util.*;
public class Quantity {

	public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          System.out.println("Please enter no of quantity");
          int x = scn.nextInt();
          int a = x * 100;
          if(a > 1000) {
        	  System.out.println("Total cost " + (x * 90));
          } else {
        	  System.out.println("Total cost " + (x * 100));
          }
	}

}
