package multple;

public class Child extends Parent implements Parent2 {

    public void parentMethod() {
        System.out.println("I am  parent 2");

    }

    public void parentMethod2() {
        System.out.println("I am Parent 2 method 2");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.parent();
        c.parentMethod();
        c.parentMethod2();

    }
}
