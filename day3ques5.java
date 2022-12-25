package day3;
import java.util.*;
public class ques5 {
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int x=sc.nextInt();
     int i,c;
     double sum=0,p;
     for(i=1;i<=n;i++)
     {
         ques5 obj=new ques5();
         c=obj.fact(2*i-1);
         p=Math.pow(x,2*i-1);
         if(i%2==0)
         sum=sum-p/c;
         else
         sum=sum+ p/c;
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
