/**
 * inheritance
 */
class demo1 {
    int no, num;

    public demo1() {
        System.out.println("parent ZEro parameterize demo1");
    }

    public demo1(int n1, int n2) {
        no = n1;
        num = n2;
        System.out.println(no + " paramiterize " + num);
    }
}

class demo2 extends demo1 {
    int a, b;

    public demo2() {
        this(20, 39);
        System.out.println("child zero parameterize demo2");
    }

    public demo2(int c, int d) {
        // super(90,23);
        a = c;
        b = d;
        System.out.println(a + " parameterize " + b);
    }
}

public class inheritance {

    public static void main(String[] args) {
        demo2 d1 = new demo2();
        // System.out.println();
        // demo2 d2 = new demo2(55, 50);

    }
}