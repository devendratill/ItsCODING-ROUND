import java.util.Scanner;

class farmer {
    int pa; // principle
    float td;// time duration
    static float ri;// rate of intrest
    float si;// simple intrest

    void input() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the amount of principle ");
        pa = obj.nextInt();
        System.out.println("Enter the time time duration");
        td=obj.nextFloat();
        ri = 4.5f;

    }

    void calculate() {
        si = (pa * ri * td) / 100f;
    }

    void disp() {
        System.out.println("Simple intrest on amount : " + si);
    }
}

public class simpleint {
    public static void main(String[] args) {
        farmer f1 = new farmer();
        farmer f2 = new farmer();

        f1.input();
        f1.calculate();
        f1.disp();

        f2.input();
        f2.calculate();
        f2.disp();
    }
}
