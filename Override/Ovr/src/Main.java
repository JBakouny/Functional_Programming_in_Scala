
abstract class Base {

    public int foo() {
        return 1;
    }
    public abstract int bar();
}

class Sub extends Base {

    // Pour faire un singleton
    public static Sub getInstance() {
        return instance;
    }
    private static Sub instance = new Sub();
    private Sub()  {
    }
    // ===========================

    @Override
    public int foo() {
        return 2;
    }

    @Override
    public int bar() {
        return 10;
    }
}

public class Main {
    public static void main(String[] args) {
        // Singleton
        Sub s1 = Sub.getInstance();
        Sub s2 = Sub.getInstance();
    }
}
