package ModelL2;

import java.util.Scanner;

public class pattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,i,j,x=0,y=0;
        n=sc.nextInt();
        x=1;
        y=n;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
               // System.out.print(" abc");
                if(j>=n-y+1&&j<=n-x+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }if(i<=n/2){
                x++;y--;
            }else{
               x--;y++;
            }
            System.out.println();
        }
    }
}
