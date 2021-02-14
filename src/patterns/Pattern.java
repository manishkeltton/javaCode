package patterns;

public class Pattern {
	
	public static void printPatten1(int n) {
		int row = 1;
		int cst = 1;
		int nst = 1;
		while(row <= n) {
			cst = 1;
			while(cst <= nst) {
				System.out.print("*");
				cst++;
			}
			System.out.println();
			nst++;
			row++;
		}
	}
	
	public static void printPattern2(int n) {
		int row = 1;
		int cst = 1;
		int nst = 1;
		while( row <= n) {
			cst = 1;
			while(cst <= nst) {
				System.out.print(cst+ " ");
				cst++;
			}
			System.out.println();
			nst++;
			row++;
		}
	}

	public static void main(String[] args) {
		//printPatten1(5);
		printPattern2(5);
		char ch = 'A';
		System.out.println((int)ch);
	}

}
