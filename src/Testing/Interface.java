package Testing;

interface anim{
    public void animsound();
    public void run();
}
class cat implements anim{
    public void animsound()
    {
        System.out.println("Sound in dog");
    }
    public void run()
    {
        System.out.println(" run the dog");
    }

}
 class Interface {
    public static void main(String[] args)
    {
     cat mydog=new cat();
     mydog.animsound();
     mydog.run();
    }
}
