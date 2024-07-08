package main;

 class Cadilac extends Bentley{
    public Cadilac(){
        System.out.println("In Cadillac");
    }

    public static void main(String[] args){
        new Cadilac();
    }
}

class Bentley extends Audi{
    public Bentley(){
        System.out.println("In Bentley");
    }
}

class Audi {
    public Audi(){
        System.out.println("In Audi");
    }
}
