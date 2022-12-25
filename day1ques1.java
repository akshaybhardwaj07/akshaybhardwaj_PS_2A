package day1;
import java.util.*;
public class ques1 {

	public static void main(String[] args) {
		double bs;
		 char ch;
		 Scanner s=new Scanner(System.in);
		 bs=s.nextDouble();
		 String str=s.next();
		 ch=str.charAt(0);
		 double all;
		 if(ch=='A') {
			 all=1700;
		 }
		 else if(ch=='B') {
			 all=1500;
		 }
		 else {
			 all=1300;
		 }
		 double ts=(bs+(0.2*bs)+(0.5*bs)+all)-(0.11*bs);
		 double p=Math.round(ts);
		 int h=(int)p;
		 System.out.println(h);

	}

}
