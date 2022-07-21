package corejava;

class Amount{
   int accountNumber;
   String AccountHolderName;
   int amount;
   void withdraw ( int amount ,int accountNo,String name){

       accountNumber = accountNo ;
           amount = amount;
       AccountHolderName = name;

   }
}


public class account {
public static void main(String[] args){
    Amount a = new Amount();

  a.withdraw(1000 , 17,"elvin");
    System.out.print(a.accountNumber + "\n"+ a.amount);

}
}
