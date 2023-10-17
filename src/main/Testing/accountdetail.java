package main.Testing;

class Account{
    int accno;
    String holdername;
    float amount;
    void insert(int id,String name,float amt)
    {
        accno=id;
        holdername=name;
        amount=amt;
    }
    void display()
    {
        System.out.println("accno :"+accno+"\naccholdername :"+holdername+"\namount :"+amount);
    }
    void withdraw(float amt)
    {
        if(amount<amt)
        {
            System.out.println("insficiant balance");
        }
        else
        {
            amount=amount-amt;
            System.out.println("avaliable balance"+amount);
        }
    }
    void deposit(float amt)
    {
        amount=amount+amt;
        System.out.println("available balance"+amount);
        display();
    }
}
public class accountdetail {
    public static void main(String[] args)
    {
        Account ac=new Account(),ac1=new Account();
        ac.insert(10022,"ElvinAntony",1500);
        ac1.insert(100244,"Antony",10000);
        ac.display();
        ac1.display();
        ac.withdraw(150);
        ac.deposit(300);
    }
}
