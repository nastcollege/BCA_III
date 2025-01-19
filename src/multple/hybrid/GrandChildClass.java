package multple.hybrid;

public class GrandChildClass extends ChildClass implements IGC{

    public void show(){
        System.out.println(super.ipMethod());
        super.ipMethod2();
        System.out.println(super.ip2Method());
        super.cpMethod();
    }

    public static void main(String[] args) {
        GrandChildClass gc = new GrandChildClass();
        gc.show();
        gc.igcMethod();
    }

    @Override
    public void igcMethod() {
        System.out.println("I am grand child interface");
    }
}
