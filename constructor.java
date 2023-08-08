/**
 * demo
 */

class Student {
        private int age;
        private String name;

        Student(int age, String name) {// constructor
                this.age = age;
                this.name = name;
        }

        Student() {
                System.out.println("zero value");
        }

        public int getAge() {// getter method
                return age;
        }

        public String getName() {
                return name;
        }

        void disp() {
                System.out.print(age + " ");
                System.out.println(name);
        }

}

public class constructor {

        public static void main(String[] args) {
                Student obj = new Student(18, "devendra");
                Student obj2 = new Student(35, "sevendra");
                Student obj3 = new Student();

                int stud1Age = obj.getAge();
                String stud1Name = obj.getName();
                int stud2Age = obj2.getAge();
                String stud2Name = obj2.getName();

                System.out.print(stud1Age + " ");
                System.out.println(stud1Name);
                System.out.print(stud2Age + " ");
                System.out.println(stud2Name);

                obj3.disp();
                obj2.disp();
                obj.disp();
                // obj.name = "devv";
                // obj.age = 20;
                // obj.info();

        }
}