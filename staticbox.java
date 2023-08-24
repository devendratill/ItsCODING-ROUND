/**
 * prac1
 */
public class staticbox {

    public int num;
    public String brand;

    public staticbox() {
        System.out.println("NO arg constructor");
    }

    public staticbox(int num) {
        super();
        this.num = num;
    }

    public staticbox(String brand) {
        super();
        this.brand = brand;
    }

    public staticbox(int num,String brand){
        super();
        this.num=num;
        this.brand=brand;
    }

    public String toString(){
       return "staticbox [num=" + num + ", brand=" + brand + "]";
    }

    static{
        System.out.println("Static Block");
    }

    public static void main(String[] args) {
        staticbox block=new staticbox(20);
        System.out.println(block.num);
        staticbox block2=new staticbox("G-wagon");
        System.out.println(block2.brand);
        staticbox block3=new staticbox(1001,"porshe");
        System.out.println(block3.toString());
    }
}