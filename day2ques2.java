package day2;
import java.util.Scanner;
public class ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int i,j;
		for(i=1;i<=n;i++) {int p=i;
			for(j=1;j<=i;j++) {
				System.out.print(p);
				p++;
			}
			System.out.println();
		}
	}

}
