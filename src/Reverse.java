import java.util.*;
public class Reverse {

	public static void main(String[] args) {
           Scanner scn = new Scanner(System.in);
           int num = scn.nextInt();
           int val, rev = 0;
           while(num != 0) {
        	   val = num % 10;
        	   rev = rev * 10 + val ;
        	   num = num / 10;
           }
           System.out.println(rev);
	}

}
