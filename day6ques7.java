package day6;
import java.util.*;
public class ques7 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	   System.out.println("Enter size of 1:");
	   int m=sc.nextInt();
	 int a[]=new int[m];   int i,j,flag;
	   System.out.println("Enter elements:");
	for(i=0;i<m;i++)
	a[i]=sc.nextInt();
	for(i=0;i<m;i++)
	{
	    flag=0;
	    for(j=0;j<m;j++)
	    {
	        if(a[i]==a[j])
	        flag+=1;
	        if(flag==2)
	        break;
	    }
	    if(flag==1)
	    System.out.print(a[i]+" ");
	}
}
}
