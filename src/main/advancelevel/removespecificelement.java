package main.advancelevel;
import java.util.Scanner;
public class removespecificelement {


/*
////////////////////////////////////////////////////
        input n= 5
        array = 1 2 3 4 5
        remove_index=3

        output:
                1 2 3 5

//////////////////////////////////////////////////////

    public static void main(main.String[] args)

    {
        Scanner sc = new Scanner(System.in);
        int n, i, j, remove = 0;
        n = sc.nextInt();
        int a[] = new int[n];
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        remove = sc.nextInt();
     if(remove<n)
     {
        for (int index = remove + 1; index < n; index++) {
            a[index - 1] = a[index];
        }
        n--;
        for (i = 0; i < n; i++)
            System.out.print(" " + a[i]);
    }
    else
     {
         System.out.println("not found in array");
     }
    }

//////////////////////////////////////////////////

                        input n= 5
                     array = 1 2 3 4 5
                     remove_value =3

               output:
                            1 2 4 5


/////////////////////////////////////////////////////

*/

    public static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);
        int n, i, j, removevalue = 0,remove=0,flag=0;
        n = sc.nextInt();
        int a[] = new int[n];
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        removevalue = sc.nextInt();
        for(i=0;i<n;i++) {

            if (a[i] == removevalue) {
                remove = i;
                flag=1;
            }
        }
        if(flag==1)
        {
        for (int index = remove + 1; index < n; index++) {
            a[index - 1] = a[index];
        }
        n--;
        for (i = 0; i < n; i++)
            System.out.print(" " + a[i]);
    }
    else
     {
         System.out.println("value not found in array");
     }
    }


/////////////////////////////////////////////////////////

                 //  input




}
