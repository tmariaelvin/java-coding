package main.Testing;

class mathfunc {int data=50;
    public static void call(int n)
    {
        n=n+50;
    }
    public static void main(String[] args)
    {
      int i=10;
      mathfunc ma=new mathfunc();
      System.out.println(i+""+ma.data);
        call(i);
      System.out.println(i);
    }

}

