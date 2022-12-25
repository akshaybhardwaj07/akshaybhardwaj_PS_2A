package day6;
import java.util.*;
public class ques2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();int i,j;
     int n=sc.nextInt();
    int a[][]=new int[m][n];
    int b[][]=new int[m][n];
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            a[i][j]=sc.nextInt();
        }
    }
     for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            b[j][i]=a[i][j];
}
}
for(i=0;i<m/2;i++)
{
for(j=0;j<n;j++)
{int t = b[i][j];
            b[i][j] = b[m-i-1][j];
            b[m-i-1][j] = t;
}
}
for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            System.out.print(b[i][j]+" ");
}
System.out.print("\n");
}
}
}
