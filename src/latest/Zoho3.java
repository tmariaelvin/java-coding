package latest;

import java.util.Scanner;

public class Zoho3 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int colo=sc.nextInt();
        String str[][]=new String[3][2];

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<2;j++)
            {
                str[i][j]=sc.nextLine();
            }
        }
        System.out.println("Enter the name");
        String father=sc.nextLine();
        int count=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<2;j++)
            {
                if(str[i][j]==father)
                {
                   System.out.print("" +str[i-1][j]);

                }
                if(str[i-1][j]==str[i][j])
                {
                    count++;
                    System.out.print(" "+str[i][j]);
                }
            }
        }
        System.out.println(" "+count);



    }
}
