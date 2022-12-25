package day1;
import java.util.*;
public class ques8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x,y;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the coordinate");
		x=s.nextDouble();
		y=s.nextDouble();
             if(x>0&&y>0) {System.out.println("First quadrant");}
             else if(x<0&&y>0) {System.out.println("Second quadrant");}
             else if(x<0&&y<0) {System.out.println("Third quadrant");}
             else {System.out.println("Fourth quadrant");}

	}

}
