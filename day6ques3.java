package day6;
import java.util.*;
public class ques3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();int i,j;
     int n=sc.nextInt();
    int arr[][]=new int[m][n];
   int rs=0,cs=0,ds=0;
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            arr[i][j]=sc.nextInt();
        }
    }
       for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
          if(i==j)
          ds=ds+arr[i][j];
        }
    }
    for(i=0;i<m;i++)
    {rs=0;
        for(j=0;j<n;j++)
        {
            rs=rs+arr[i][j];
        }
    if(rs!=ds)
    {
    System.out.print("Not Magic Matrix");
    System.exit(0);
    }
}   
    for(i=0;i<m;i++)
    {cs=0;
        for(j=0;j<n;j++)
        {
            cs=cs+arr[j][i];
        }
    if(cs!=ds)
    {
    System.out.print("Not Magic Matrix");
    System.exit(0);
    }
}
System.out.print("Magic Matrix");
}
}
