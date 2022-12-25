package day2;
import java.util.Scanner;
public class ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int i;
		for(i=1;i<=n;i++) {int p=i;
		int t=(2*i)-2;
			for(int space=1;space<=n-i;space++) {
				System.out.print(" ");
			}
			for(int num=1;num<=i;num++) {
				System.out.print(p);
				p++;
			}
			for(int j=1;j<=i-1;j++) {
				System.out.print(t);
				t--;
			}
			System.out.println();
		}
	}

}
