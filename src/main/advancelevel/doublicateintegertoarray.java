package main.advancelevel;
import java.util.Scanner;
public class doublicateintegertoarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, j, k = 0,flag=0;
        n = sc.nextInt();
        int a[] = new int[n];
       // int b[] = new int[n];
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            for (j = i+1; j < n; j++) {
                if (a[i] == a[j]) {
                    a[k++] = a[i];
                    flag=1;//b[k++]=a[i];
                }
            }
        }
        if(flag==0)
        {
            System.out.println(" NO DOUBLICATE VALUE IN THIS ARRAY");
        }
        System.out.println(k+"  DOUBLICATE VALUE IN THIS ARRAY");
        for(i=0;i<k;i++)
        {
        System.out.print(a[i]);  // b[i];
    }
    }
}
