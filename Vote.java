package Operator;
import java.util.Scanner;

public class Vote {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		 int age =sc.nextInt();
		 if(age>=18) {
			 System.out.println("YOU ARE ELIGIBLE");
			 
		 }else {
			 System.out.println("NO YOU ARE NOT ELIGIBLE");
		 }
	}

}
