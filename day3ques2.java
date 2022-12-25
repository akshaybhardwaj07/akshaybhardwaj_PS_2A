package day3;
import java.util.*;
public class ques2 {
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int i,c,sum=0;
     for(i=1;i<=n;i++)
     {
         ques2 obj=new ques2();
         c=obj.fact(i);
         //c=c/i;
         sum=sum+c/i;
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
