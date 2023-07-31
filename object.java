public class object {
    int a;
    String name = "ra";

    public static void main(String[] args) {
       // int num = 9;
        object obj1 = new object();
        object obj2 = new object();

        obj1.name="hul";

        System.out.println(obj1.name);
        System.out.println(obj1.a);

        System.out.println(obj2.name);
        System.out.println(obj2.a);
    }
}
