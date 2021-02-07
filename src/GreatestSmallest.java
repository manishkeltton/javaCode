import java.util.*;
public class GreatestSmallest {

	public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
         int small=0, mid, big=0 ;
         int t = scn.nextInt();
         int count = 0;
         while(t != 0) {
        	 mid = scn.nextInt();
        	 count++;
        	 if(count < 2) {
        		 small = mid;
        		 big = mid;
        	 } else {
        	     if( small <= mid && mid >= big ) {
        	    	 big = mid;
        	     } else if(small>=mid){
        	    	 small = mid;
        	 }
        	 t--;
         }   
         
	}
         System.out.println(small + " " + big);
	}

}
