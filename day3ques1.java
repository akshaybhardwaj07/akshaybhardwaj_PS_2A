package day3;
import java.util.*;
public class ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,c,sum=0;
        for(i=1;i<=n;i++)
        {
            ques1 obj=new ques1();
            c=obj.fact(i);
            sum=sum+c;
        }
        System.out.print(sum);
    }
    int fact(int a)
    {
        if(a==0)
        return 1;
        else if(a==1)
        return 1;
        else
        return a*fact(a-1);
	}

}
