package day3;
import java.util.*;
public class ques8 {
public static void main(String[] args) {
	  Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int i,sum=0;
      for(i=1;i<=n;i++)
      {
          sum=sum+(i*(i+1)*(i+2));
      }
      System.out.print("Sum of Series ="+sum);
}
}
