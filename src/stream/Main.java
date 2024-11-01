package stream;

@FunctionalInterface
interface MyFunctionalInterface {
    void execute(String message);
}

// Using the functional interface with a lambda expression
public class Main {
    public static void main(String[] args) {
        MyFunctionalInterface func = (msg) -> System.out.println(msg);
        func.execute("Hello from Functional Interface!");  // Output: Hello from Functional Interface!
    }
}
