public class TerneryDemo {
    public static void main(String[] args) {
        int a, b, c; //a=0,b=0,c=0
        a = 10; //a=10
        b = ++a; // a=11, b=11
        c = a++; // c=11, a=12
        System.out.println(a + b + c); //33 (12+11+11)
        c++; //c=12
        b = --c; // b=11, c=11
        a = --b; //a=10, b=10
        System.out.println(--a); //8 (9)
        b=a>b?a:b; //9>10 b=10
        System.out.println(b--); //print 10, b=9
        System.out.println(++c); //c=12
    }
}
