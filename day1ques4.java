package day1;
import java.util.*;
public class ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		if(n%4==0?n%100!=0:n%400==0) {
			
			System.out.println("Leap year");
		}
		else {
			System.out.println("Not a leap year");
		}
	}

}
