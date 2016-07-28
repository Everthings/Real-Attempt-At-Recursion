import java.util.*;

public class Recursion2 {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		String s;
		System.out.print("Enter A Number: ");
		int numA = input.nextInt();
		System.out.print("Enter Another Number: ");
		int numT = input.nextInt();
		switch(numA){
		case(1): s = "uni";
			break;
		case(2): s = "fibo";
			break;
		case(3): s = "tribo";
			break;
		case(4): s = "quadra";
			break;
		case(5): s = "quinta";
			break;
		case(6): s = "hexa";
			break;
		case(7): s = "septa";
			break;
		case(8): s = "octa";
			break;
		case(9): s = "nona";
			break;
		case(10): s = "deca";
			break;
		default: s = "";
			break;
		}
		if(s.equals("")){
			System.out.println("The " + numT + "th term of " + numA + "-nacci is: "+ nacci(numA, numT));
		}else{
			System.out.print("The " + numT + "th term of " + s + "nacci is: "+ nacci(numA, numT));
		}
	}
	
	public static long nacci(int numAdd, int term){
		long a = 0;
		if(term == 0)
			return 0;
		if(term <= numAdd)
			return 1;
		for (int i = 1; i <= numAdd; i++)
			a += nacci(numAdd, term - i);
		return a;
	}
}