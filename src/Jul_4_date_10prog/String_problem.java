package Jul_4_date_10prog;
import java.util.Scanner;
import java.util.Scanner;

public class String_problem {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("my name is yogesh");
		String str="my name is yogesh i am from latur i am doing engineering from Sinhgad college of ";
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			if(Character.isAlphabetic(ch)) {
				System.out.print(ch);
			}
			
			
		}
	}
}
