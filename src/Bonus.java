import java.util.*;
public class Bonus {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int salary = scn.nextInt();
		int yos = scn.nextInt();
		double amnt;
		if(yos > 5) {
			amnt = (salary * 5 * 1.0)/100;
			System.out.println("Net Bonus amount is "+ amnt);
		}else {
			System.out.println("Net amount is " + salary);
		}

	}

}
