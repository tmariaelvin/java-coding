package Testing;

/*
class Animal{
    void run(){System.out.println("eating...");}
}
class Dog extends Animal{
    void run(){System.out.println("barking...");}
}
class BabyDog extends Dog{
    void run(){System.out.println("weeping...");}
}
class objectclass{
    public static void main(String args[]){
        BabyDog d=new BabyDog();
        d.run();

    }}

class car{
    void run(){
        System.out.println("Vehicle is running");
    }
}
class Bike2 extends car{
    void run(){
        System.out.println("Vehicle is aaaarunning");
    }
}
class Bike3 extends Bike2{
    //void run(){
       // System.out.println("Bike is running safely");
   // }
}
class objectclass{
    public static void main(String args[]){
        Bike3 obj = new Bike3();
        obj.run();
    }
}
*/
class A{
    int data=40;
    protected void msg(){System.out.println("Hello java");}
}

public class objectclass{
    public static void main(String args[]){
        A obj=new A();
        System.out.println(obj.data);//Compile Time Error
        obj.msg();//Compile Time Error
    }
}