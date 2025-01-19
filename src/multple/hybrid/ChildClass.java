package multple.hybrid;

public class ChildClass extends CP implements  IP, IP2{
    @Override
    public String ipMethod() {
        return "Method from Parent Interface";
    }

    @Override
    public void ipMethod2() {
        System.out.println(" Method from parent interface 2nd one");
    }

    @Override
    public int ip2Method() {
        return 50;
    }
}
