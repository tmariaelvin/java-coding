package Array;

import java.util.Scanner;

public class closestzero {
    public static void main(String args[])
    {

        int sizeOfArray,index,value	;
        boolean flag = false ;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Size of Array : ");
        sizeOfArray = scanner.nextInt();

        int array[] = new int[ sizeOfArray ] ;

        System.out.println("Input the Integer Values : " );
        for( index = 0 ; index < sizeOfArray ; index ++ )
        {
            array[ index ] = scanner.nextInt();
        }

        for( index = 0 ; index < sizeOfArray ; index ++ )
        {
            for( int iteration = 0 ; iteration < sizeOfArray ; iteration ++ )
            {
                if( index != iteration )
                {
                    value = array[ index ] + array[ iteration ] ;
                    if( value == 1 || value == -1 )
                    {
                        System.out.println("The values are : " + array[ index ] + " " + array[ iteration ] ) ;
                    }
                }
            }
        }


    }
}
