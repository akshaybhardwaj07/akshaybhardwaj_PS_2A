package day2;
import java.util.Scanner;
public class day2ques15 {

	static void main(String args[])
	{
	    day2ques15 obj=new day2ques15();
	    String ans=obj.count(5);
	    System.out.print(ans);
	}
	String count(int n)
	{
	    if(n==1)
	    return "1";
	    if(n==2)
	    return "11";
	    String s=count(n-1);
	    String p="";
	    int c=0,i,l=s.length();
	    for(i=0;i<l;i++){
	        c++;
	        if(i==l-1||s.charAt(i)!=s.charAt(i+1))
	        {
	            p=p+c+s.charAt(i);
	            c=0;
	        }
	      
	    }
	      return p;
	}

}
