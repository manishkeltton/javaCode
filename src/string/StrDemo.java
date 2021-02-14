package string;

public class StrDemo {

	public static void main(String[] args) {
           String str1 = "abc";
           String str2 = "abc";
           // str1 = "def";
           //str1 += 'a';
           String str3 = new String("abc");
           System.out.println(str1==str3);
           System.out.println(str1.equals(str3));
	}

}
