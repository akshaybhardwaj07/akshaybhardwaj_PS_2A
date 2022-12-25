package day2;
import java.util.Scanner;
public class ques10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i,j,k,n;
	        Scanner sc=new Scanner(System.in);
	        n=sc.nextInt();
	        for(i=(n+1)/2;i>=1;i--)//row
	        {
	            for(j=1;j<=(n+1)/2-i;j++)//left space row-i it is not starting with space
	            {
	                System.out.print(" ");
	            }
	            for(k=1;k<=2*i-1;k++)//middle * 
	            {
	                System.out.print("*");
	            }
	            System.out.println(); /* ***** 3
	                                      *** 2
	                                       *  1*/
	        
	        }
	        
	        for(i=1;i<=n/2;i++)//row
	        {
	            for(j=1;j<=n/2-i;j++)//left space row-i
	            {
	                System.out.print(" ");
	            }
	            for(k=1;k<=2*i+1;k++)
	            {
	                System.out.print("*");
	            }
	            System.out.println(" ");
	            /* *** 1
	              ***** 2*/ 
	        }
	}

}
