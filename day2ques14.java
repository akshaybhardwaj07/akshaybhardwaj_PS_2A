package day2;
import java.util.Scanner;
public class day2ques14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int i=1;
		while(i<=n) {
			System.out.print("*");
			i++;
		}
		System.out.println();
		i=1;
		while(i<=n-2) {
			int space=1;
			while(space<=n-i-1) {
				System.out.print(" ");
				space++;
			}
			int star=1;
			while(star<=1) {
				System.out.print("*");
				star++;
			}
			System.out.println();
			i++;	
		}
		int j=1;
		while(j<=n) {System.out.print("*");
		j++;
			
		}
		
	}

}
