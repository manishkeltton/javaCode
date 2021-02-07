import java.util.*;
public class Rectangle {

	public static void main(String[] args) {
	       Scanner scn = new Scanner(System.in);
	       float length = scn.nextFloat();
	       float breath = scn.nextFloat();
	       if(length == breath) {
	    	   System.out.println("Square");
	       }else {
	    	   System.out.println("Not square");
	       }

	}

}
