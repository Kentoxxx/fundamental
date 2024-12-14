package practice;
import java.util.Scanner;
public class sss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		
		System.out.print("Enter Numebr: ");
		double x=s.nextDouble();
		
		System.out.print("Enter Numebr2: ");
		double x1=s.nextDouble();
		
		System.out.print("chose operation + -");
		char operation = s.next().charAt(0);
		double result = 0;
		
		switch(operation){
		case '+':
			result = x+x1;
			break;
		case '-':
		result = x-x1;
		break;
		
			
			
	}
		System.out.print("result"+ result);
}
}
