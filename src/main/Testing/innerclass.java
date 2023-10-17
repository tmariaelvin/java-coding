package main.Testing;
class inner{
    int x=5;
    static class outer{
        int y=10;
    }
}

public class innerclass {
    public static void main(String[] args)
    {
        inner in=new inner();
        inner.outer ou=new inner.outer();
        System.out.println("inner x="+in.x+" outer y="+ou.y);
    }
}
