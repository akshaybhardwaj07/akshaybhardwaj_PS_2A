package day1;
import java.util.*;
public class ques2 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		if(a>b) {
			if(a>c) {System.out.println(a+ " is greatest");}
			else {System.out.println(c+ " is greatest");}
		}
		else if(b>c) {
			if(b>a) {
				System.out.println(b+ " is greatest");
			}
			else {System.out.println(a+ " is greatest");}
		}
		
	}

}
