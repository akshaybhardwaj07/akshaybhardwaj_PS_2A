package day2;
import java.util.Scanner;
public class day2ques16 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=2*n-2;
        
        for(int i=0;i<=m;i++)
        {
            for(int j=0;j<=m;j++)
            {
                day2ques16 obj=new day2ques16();
                
               int y=obj.min(j,i);
               int x=obj.min(m-j,m-i);
                x=obj.min(x,y);
               System.out.print(n-x);
            }
            System.out.println();
        }
    }
    int min(int a,int b) 
    {
       int p=a;
        if(b<a)
        p=b;
       return p;

	}

}
