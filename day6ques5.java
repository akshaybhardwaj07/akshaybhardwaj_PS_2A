package day6;
import java.util.*;
public class ques5 {
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
     System.out.println("Enter M and N");
     int m=sc.nextInt();
     int n=sc.nextInt();
     int a[][]=new int[m][n];
     System.out.println("Enter Elements");
     for(int i=0;i<m;i++)
     {
         for(int j=0;j<n;j++){
      a[i][j]=sc.nextInt();
     }
 }
 ques5 obj=new ques5();
 obj.spiral(a,m,n);
}
void spiral(int [][]a,int m,int n)
{
  
     for(int i=0;i<m;i++)
     {
         for(int j=0;j<n;j++)
         System.out.println(a[i][j]+" ");
     }

 int top=0;
 int bottom=m-1;
 int left=0;
 int right=n-1;int i;
 while(top<=bottom && left<=right)
 {
     for(i=left;i<=right;i++)//first row
     {
     System.out.print(a[top][i]+" ");
 } top++;
     for(i=top;i<=bottom;i++)//first colum
         {System.out.print(a[i][n-1]+" ");
     } right--;
     if(top<=bottom){
     for(i=right;i>=left;i--)
     {
         System.out.print(a[m-1][i]+" ");
     }bottom--;}
     if(left<=right)
     {
         for(i=bottom;i>=top;i--)
         {
             System.out.print(a[i][left]+" ");
            
         } left++;
     }
 }
}
}
