package day2;
import java.util.Scanner;
public class ques9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int firsthalf=(n+1)/2;
        int secondhalf=n/2;
        int i=1;
        while(i<=firsthalf){
            int space=1;
            while(space<=firsthalf-i){
                System.out.print(" ");
                space++;}
            int star=1;
            while(star<=(2*i)-1){
             System.out.print("*");
                star++;}
            System.out.println();
                     i++; }
        int j=secondhalf;
        while(j>=1){
            int space=1;
            while(space<=secondhalf-j+1){
                System.out.print(" ");
                space++;
                }
            int star=1;
            while(star<=(2*j)-1){
                System.out.print("*");
                star++;
                }
            System.out.println();
                    j--;
                    }
	}

}
