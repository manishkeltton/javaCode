import java.util.*;
public class RaisePower {

	public static void main(String[] args) {
           Scanner scn = new Scanner(System.in);
           System.out.println("Enter two Number");
           int input1 = scn.nextInt();
           int input2 = scn.nextInt();
           int val = 1;
           for(int i=1;i<=input2;i++) {
        	   val = val * input1 ;
           }
           System.out.println(val);
	}

}
