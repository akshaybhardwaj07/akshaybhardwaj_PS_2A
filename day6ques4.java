package day6;
import java.util.*;
public class ques4 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();int i,j;
     int n=sc.nextInt();
    int arr[][]=new int[m][n];
    int t;
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            arr[i][j]=sc.nextInt();
        }
    }
  
     for (i = m - 1; i >= 0; i--) {
        for ( j = n - 1; j >= 0; j--)
            System.out.print(arr[i][j] + " ");

        System.out.println();
    }
}
}
