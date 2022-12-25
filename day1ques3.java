package day1;
import java.util.*;
public class ques3 {

	public static void main(String[] args) {
		char ch;
		Scanner s=new Scanner (System.in);
		String str=s.next();
		ch=str.charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='0'||ch=='U')
		{
			System.out.println("It is a vowel");
		}
		else {
			System.out.println("It is a consonant");
		}
	}

}
