package day2;
import java.util.Scanner;
public class day2ques17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k,n;
        Scanner s=new Scanner(System.in);
      int  p=s.nextInt();
        for(i=1;i<=p;i++)
        {
        	n=1;
            
    for(k=1;k<=i;k++)
    {
       System.out.print(n);
        n++;
    }
    
    n--;
    for(j=1;j<=i-1;j++)
    {
    	n--;
        System.out.print(n);
           }
    System.out.print(" ");
}

	}

}
