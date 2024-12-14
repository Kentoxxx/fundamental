package practice;
import java.util.Scanner;
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		String name[]= {"kentox","razelle","calvario"};
		String password[] = {"123","456","789"};
		
		int i;
		System.out.println("Kentox(0) Razelle(1) Calvario(2) ");
		System.out.print("Chose An Account from 0 to 2: ");
		i=s.nextInt();
		s.close();
		
		System.out.print("heres the account info: "+name[i]+" "+password[i]);
	
		
	}
}
