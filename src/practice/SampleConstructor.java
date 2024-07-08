package practice;

public class SampleConstructor {
    public static void main(String[] args) {
        Data data = new Data("Elvin",27);
        System.out.println(data.calculate());
        Data data1 = new Data("Anto",20);
        System.out.println(data1.calculate());
        /*Data data1 = new Data("elvin");
        System.out.println(data1);
        Data data2 = new Data("elvin", 1);
        System.out.println(data2);
        DefaultConst dc = new DefaultConst();
        System.out.println(dc);*/
    }
}

class Data extends DefaultConst {
    String name;
    int id;

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    Data(String name, int id) {
        super(name+id);
        this.name = name;
        this.id = id;
    }
}

class DefaultConst {
    String name;
    DefaultConst(String name){
       this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String calculate(){
        return this.name;
    }

    @Override
    public String toString() {
        return "DefaultConst{" +
                "name='" + name + '\'' +
                '}';
    }
}