package main.corejava;
import java.util.ArrayList;

public class compiler {
    public static void main(String[] args) {
        String inputString = "  Repeat var=m start=5 until=20       ";
        char space = ' ';
        printArray(tokenization(inputString,space)) ;
    }
    public static ArrayList<String> tokenization(String inputString, char space){
        String outputText="";
        int inputStringLengh = inputString.length();
        ArrayList<String> resultArray = new ArrayList<String>();
        for(int i=0; i<inputStringLengh; i++){

            if (inputString.charAt(i) != space) {
                outputText += inputString.charAt(i);
                if (i == inputStringLengh - 1 ) {
                    resultArray.add(outputText);
                    return resultArray;
                }
            } else {
                resultArray.add(outputText);
                outputText = "";
            }
        }
       return resultArray;
    }
public static void printArray(ArrayList<String> resultArrays){
        for(String resultArray : resultArrays){
            System.out.println(resultArray);
        }
    System.out.println(resultArrays);
}
}




   /*if(program.charAt(i) != space){
                outputText +=program.charAt(i);
            }
            if (programlength-1 == i || program.charAt(i) == space) {
                resultArray.add(outputText);
                outputText = "";
            }*/

   /* main.String str  = "elvin maria anto r p l ";
        System.out.println(str);
        int len = str.length();
         int index = 0;
        main.String firstName="" ;
        main.String lastName="";
        main.String[] stringArray1 = new main.String[7];
        ArrayList<main.String> line = new ArrayList<main.String>();
        int flag = 0;

        for(int i =0; i<len;i++){

            if(str.charAt(i)== ' '){
                flag =1;
                stringArray1[index++] = firstName;
                line.add(firstName);
                firstName = "";
                continue;
            }
            if(flag == 0){
                firstName= firstName+str.charAt(i);
            }
            else{
                firstName = firstName+str.charAt(i);
            }

        }

        System.out.println("firstName :"+firstName);
        System.out.println("lastName :"+lastName);
        for(int i=0;i< stringArray1.length;i++){
            System.out.println(stringArray1[i]);
        }
        System.out.println(line);

        int array[]={1,1,2,3,4,4,5,5};

            System.out.println(Arrays.toString(array));


        System.out.println(" //////////////////////////////////////////////////// ");
        ////////////////////////////////////////////////////*/