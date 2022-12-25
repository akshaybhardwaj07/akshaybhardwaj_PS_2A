package day1;
import java.util.*;
public class ques6 {

	public static void main(String[] args) {
		double a,b,c;
		Scanner s=new Scanner(System.in);
		a=s.nextDouble();
		b=s.nextDouble();
		c=s.nextDouble();
		if(a==b&&a==c) {
			System.out.println("Equilateral");
		}
		else if(a==b&&a!=c) {System.out.println("Isosceles");
			
		}
		else if(b==c&&b!=a) {System.out.println("Isosceles");}
		
	
		else if(c==a&&c!=b) {System.out.println("Isosceles");}
		else {System.out.println("Scalene");}
	}

}
