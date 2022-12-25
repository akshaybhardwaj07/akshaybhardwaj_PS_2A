package day1;
import java.util.*;
public class ques7 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double temp;
		temp=s.nextDouble();
		if(temp<0) {System.out.println("Freezing");}
		else if(temp>=0&&temp<10) {System.out.println("Very cold");}
		else if(temp>=10&&temp<20) {System.out.println("cold");}
		else if(temp>=20&&temp<30) {System.out.println("Normal");}
			else if(temp>=30&&temp<40) {System.out.println("Hot");}
			else {System.out.println("Very hot");}

	}

}
