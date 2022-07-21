package corejava;
import java.lang.String;
import java.util.Arrays;

public class hello {

    public static void main(String[] args) {
    /*   int person = {
               "name" : "elvin",
                "age " : 24,
               "weight" : 60 ,
       } ,{
            "name" : "hari",
                    "age " : 24,
                    "weight" : 60 ,
        }

        for(int i=0;i<person.length; i++){
            if(person[i].age > 18 ) {
                if(person[i].weight >= 50){
                    System.out.println(person[i].name);
                }
            }
        }*/


 /*       int[] ages =  { 13, 10, 30, 20 };
        int[] weights = { 10, 20, 60, 10 };

for(int i=0;i< ages.length;i++){
    for(int j=i;j<=i;j++){
        if(ages[i] >= 18){
            if(weights[j] >= 50 ){
                System.out.println(" weghit -eligible "+weights[j]);
            }else{
                System.out.println("weight not - eligible"+weights[j]);
            }

        } else{
            System.out.println("not eligible age "+ages[i]);

        }
    }
}*/
/*
String str  = "elvin maria anto r p l ";
System.out.println(str);
int len = str.length();
String firstName="" ;
String lastName="";
int flag = 0;

for(int i =0; i<len;i++){

    if(str.charAt(i)== ' '){
        flag =1;
        continue;
    }
    if(flag == 0){
        firstName= firstName+str.charAt(i);
    }
    else{
       lastName = lastName+str.charAt(i);
    }

}

System.out.println("firstName :"+firstName);
System.out.println("lastName :"+lastName);

*/
/*
        char arr [][] =new char[][]{ {'a','1','b'},{'c','2','d'},{'e','4','f'} };

        for (int i=0; i< 3 ; i++)
        {
            for (int j=0; j < 3 ; j++)
                System.out.print(arr[i][j]+ " ");

            System.out.println();
        }
    }*/
        String name = "elvin";


        System.out.print(name.charAt(2));


    }
}
