/**
 * demo
 */
public class Stringconcat {
    public static void main(String[] args) {
        String name = new String("dev");
        name = name.concat("endra");
        System.out.println(name);

        String name2 = "aash";
        name2 = name2.concat("utosh");
        System.out.println(name2);
        System.out.println();

        String s1 = "pw";// string constent pool
        String s2 = s1.concat("Skilll");
        String s3 = new String("pwjava");
        s3 = s3.concat("skil");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        String a1 = "pw";// "string constent pool"
        String a2 = "pw" + "java";// "string constent pool"
        String a3 = "pw" + "java" + "skills";// "string constent pool"
        String a4 = a1 + a2;// Heap memory
        System.out.println();

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
System.out.println();
        String f1="dev"+100+99;
        System.out.println(f1);
        
    }

}
