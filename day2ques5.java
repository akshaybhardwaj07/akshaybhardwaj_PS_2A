package day2;
import java.util.Scanner;
public class ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int i,j,n;
	        Scanner sc=new Scanner(System.in);
	        n=sc.nextInt();
	        for(i=n;i>=1;i--)//row
	        {        
	            for(j=i;j<=n;j++)//col
	            {
	              char ch=(char)(j+64);  //64+5=E
	                System.out.print(ch);
	            }
	            System.out.println();}
	}

}
