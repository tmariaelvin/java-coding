package interfaces;

class OriginalClass {
    public void show() {
        System.out.println("Original method functionality");
    }
}

class OriginalClassInheritor extends OriginalClass {
    public void show() {
        System.out.println("Override original method functionality");
    }
}

public class TestAnnonimusClass {
    public static void main(String[] args) {
        OriginalClass object = new OriginalClassInheritor();
        object.show();
    }
}
