package day2;
import java.util.Scanner;
public class ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		char ch='A';
		int i,j;
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(ch);
				}
			System.out.println();
			ch++;
		}
	}

}
