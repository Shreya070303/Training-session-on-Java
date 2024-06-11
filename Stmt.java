package statement;
import java.util.*;

public class Stmt {

	public static void main(String[] args) {
		String answer;
		do {
		Scanner ip = new Scanner(System.in);
		System.out.println("WELCOME");
		System.out.println("Enter quantity");
		 int Quantity = ip.nextInt();
		 System.out.println("Enter the price");
		 int Price = ip.nextInt();
		 int total = Quantity*Price;
		 System.out.println("Total is "+total);
		 System.out.println("-----------");
		 System.out.println("Do you Wann Continue");
		 answer=ip.next();
		 }while(answer.equals("yes"));

}
}
