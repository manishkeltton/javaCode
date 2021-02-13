package javaCode;

import java.util.Scanner;

public class IsPrime {
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
	    int num = scn.nextInt();
	    boolean p = true;
	    for(int i=2 ; i<num ; ++i ) {
	    	if(num % i == 0) {
	    		p = false;
	    		break;
	    	}
	    }
	    System.out.println(p);
	
	}
}
