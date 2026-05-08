import java.util.Scanner;
class OutOfRangeException extends Exception {
    public OutOfRangeException() { super("OutOfRangeException"); }
}
class AddZeroException extends Exception {
    public AddZeroException() { super("AddZeroException"); }
}
class SubtractZeroException extends Exception {
    public SubtractZeroException() { super("SubtractZeroException"); }
}
public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		try {
			int a,b,ans;
			char c;
			if(input.contains("+")) {
				String str[] = input.split("\\+");
				a = Integer.parseInt(str[0]);
				b = Integer.parseInt(str[1]);
				c = '+';
			}
			else{
				String str[] = input.split("-");
				a = Integer.parseInt(str[0]);
				b = Integer.parseInt(str[1]);
				c = '-';
			}
			
			if(c=='+' && (a==0 || b==0)) {
				throw new AddZeroException();
			}
			if (c=='-' && (a==0 || b==0)) {
                throw new SubtractZeroException();
            }
			if (a<0 || a>1000 || b<0 || b>1000) {
                throw new OutOfRangeException();
            }
			if(c=='+')
				ans = a+b;
			else 
				ans = a-b;
			if(ans<0||ans>1000)
				throw new OutOfRangeException();
			System.out.println(ans);
		}catch(OutOfRangeException|AddZeroException|SubtractZeroException e) {
			System.out.println(e.getMessage());
		}
	
	}
}
