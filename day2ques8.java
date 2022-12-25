package day2;
import java.util.Scanner;
public class ques8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int i;
		for(i=1;i<=n;i++) {
		
			for(int space=1;space<=n-i;space++) {
				System.out.print(" ");
			}
			for(int star=1;star<=i;star++) {
				System.out.print("*");
				
			}
			for(int star=1;star<=i-1;star++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}

}
