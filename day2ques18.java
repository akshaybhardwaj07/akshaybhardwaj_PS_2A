package day2;
import java.util.Scanner;
public class day2ques18 {

	public static void main(String[] args) {
		String s="geeks";
		int l=s.length();
		char ch[]=new char[l];
		int i,j;
		for(i=0;i<l;i++)
			ch[i]=s.charAt(i);
		for(i=l;i>=1;i--)
		{
			for(j=1;j<=l-i;j++)
				System.out.print(".");
			for(j=i;j>=1;j--)
			{
				System.out.print(ch[l-j]);
			}
			System.out.println();
		}
	}

}
