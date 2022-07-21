package Testing;


//  abstrct method ///
// abstract class not create in object and method is without body of the method ////

//   normal class using create object and method with in body of conntent   ////////
abstract class animal{
    public abstract void animalsound();
    public void animalso()
    {
        System.out.println("This is a animal sound");
    }
}
class dog extends animal{
    public void animalsound()
    {
        System.out.println("dog sound is Lol Lol..");
    }
}
class big extends animal{
    public void animalsound(){
        System.out.println("dog sound is ere ere..");
    }
}
public class polymorphism {
    public static void main(String[] args)
    {
     dog mydog=new dog();
     mydog.animalsound();
     mydog.animalso();
    }
}
