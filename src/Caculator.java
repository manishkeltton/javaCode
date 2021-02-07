
import java.util.Scanner;
public class Caculator {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int input1 = scn.nextInt();
		int input2 = scn.nextInt();
		System.out.println("Enter value 1 for add\n"+"Enter value 2 for sub\n"+"Enter value 3 for mul\n"
		+"Enter value 4 for div\n");
		int input3 = scn.nextInt();
		switch(input3) {
		
		case 1 :
			int add = input1 + input2;
			System.out.println(add);
			break;
			
		case 2 :
			int sub = input1 - input2;
			System.out.println(sub);
			break;
			
		case 3 :
			int mult = input1 * input2;
			System.out.println(mult);
			break;
			
		case 4:
			if(input2 > 0) {
				int div = input1/input2;
				System.out.println(div);
			}else {
				System.out.println("Please enter valid input value");
			}
			break;
		default :
			System.out.println("Please enter valid input3 value");
		}

	}

}
