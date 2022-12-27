package day2;
import java.util.Scanner;
public class day2ques13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n,i,j,min,max,t;
	        Scanner sc=new Scanner(System.in);
	       
	        n=sc.nextInt();
	        int a[][]=new int[10][10];
	
	        for(i=0;i<n;i++)
	        {
	            for(j=0;j<n;j++)
	            {
	            a[i][j]=sc.nextInt();
	        }
	    }
	        for(i=0;i<n;i++)
	        {
	            for(j=0;j<n;j++)
	            { min=a[i][j];
	                for(t=1;t<n;t++)
	                {
	                    if(a[j][t]<min)
	                    {
	                        min=a[j+1][t];
	                    }
	                }
	    a[i][j]=min;
	                    
	                }       
	                        
	    }
	        for(i=0;i<n;i++)
	        {
	            for(j=0;j<n;j++)
	            {
	                System.out.print(a[i][j]+" ");
	            }
	            System.out.println();
	        }

	}

}
