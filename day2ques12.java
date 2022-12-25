package day2;
import java.util.Scanner;
public class ques12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in); 
			n=s.nextInt();
			int i=1;
			while(i<=n) {int p=1;
			int t=n-i+1;
				int j=1;
				while(j<=n-i+1) {
					System.out.print(p);
					p++;
					j++;
				}
				int space=1;
				while(space<=(2*i)+n+1) {
					System.out.print(" ");
					space++;
				}
				int num=1;
				while(num<=n-i+1) {
					System.out.print(t);
					t--;
					num++;
				}
				System.out.println();
				i++;
			}
		
	}

}
