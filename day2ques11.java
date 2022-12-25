package day2;
import java.util.Scanner;
public class ques11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int i=1;
		while(i<=n) {int p=1;
		int t=i;
		
		
			int j=1;
			while(j<=i) {
				System.out.print(p);
				p++;
				j++;
			}
			int space=1;
			while(space<=(2*n)-(2*i)) {
				System.out.print(" ");
				space++;
			}
			int num=1;
			while(num<=i) {
				System.out.print(t);
				t--;
				num++;
			}
			
			
			System.out.println();
			i++;
		}
	}

}
