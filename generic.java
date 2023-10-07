// import java.util.*;

/**
 * generic
 */
//_________________________________________________________first
// public class generic {

//   public static void main(String[] args) {
//     String arr[]=new String[10];
//     arr[0]="dev";
//     arr[1]="jay";
//    // arr[2]=11;
//    String nm1=arr[0];
//    String nm2=arr[1];

//    ArrayList <Integer> al =new ArrayList<Integer>();
//    //al.add("dev");
//    al.add(100);
//    al.add(200);
//    al.add(300);
//   //  Integer n1=(Integer)al.get(0);
//   //  Integer n2=(Integer)al.get(1);
//   //  Integer n3=(Integer)al.get(2);
//   //  System.out.println(n1+" "+n2+" "+n3);
//  System.out.println( al.get(2));
//   }
// }

//_________________________________________________________Second
// class stud{
// private String name;
// private int num;
// }
// class empl{
// private String name;
// private int num;
// }

// public class generic {

//   public static void main(String[] args) {
//     stud s1=new stud();
//     stud s2=new stud();

//     empl e1=new empl();

//     ArrayList<stud> al=new ArrayList<stud>();
//     al.add(s1);
//     al.add(s2);
//     //al.add(e1);

//   }
// }
//_____________________________________________________________Third
/**
 * generic
 */

// class gen<T> {
// T obj;

// public gen(T obj) {
// this.obj = obj;
// }

// void disp() {
// System.out.println("the type of data is : " + obj.getClass().getName());
// }

// public T getobj() {
// return obj;
// }
// }

// public class generic {

// public static void main(String[] args) {
// gen<Integer> g1 = new gen<Integer>(10);
// g1.disp();
// System.out.println(g1.getobj());

// gen<String> g2 = new gen<String>("deven");
// g2.disp();
// System.out.println(g2.getobj());
// // ArrayList <String>list1=new ArrayList<String>();
// // List <String>list2=new ArrayList<String>();
// // Collection <Integer>list3=new ArrayList<Integer>();

// }
// }
// __________________________________________________fourth

// public class generic {

// public static void main(String[] args) {
// ArrayList<Integer> al = new ArrayList<Integer>();
// al.add(100);
// al.add(75);
// al.add(150);
// al.add(50);
// al.add(25);
// al.add(125);
// al.add(175);
// al.add(200);
// Collections.sort(al);

// System.out.println(al);

// ArrayList<String> al2 = new ArrayList<String>();
// al2.add("dev");
// al2.add("aashu");
// al2.add("jay");
// al2.add("madhuri");
// Collections.sort(al2);
// System.out.println(al2);

// Integer index = Collections.binarySearch(al, 50);
// System.out.println("Index is :" + index);

// Collections.shuffle(al2);
// System.out.println(al2);

// }
// }
// _______________________________________________________Comparator //used when
// the class is not accessible to programer so create the independent comparator
// method
// import java.util.*;

// class student {
// int age;
// int marks;
// String name;

// public student(int age, int marks, String name) {
// this.age = age;
// this.marks = marks;
// this.name = name;
// }

// public int getAge() {
// return age;
// }

// public int getMarks() {
// return marks;
// }

// public String getName() {
// return name;
// }

// public String toString() {
// return " " + age + " " + marks + " " + name;
// }
// }

// // class alpha implements Comparator<student>{
// // public int compare(student a,student b){
// // if(a.marks>b.marks)
// // return 1;
// // else
// // return-1;
// // }
// // }

// public class generic {
// public static void main(String[] args) {

// student st1 = new student(18, 82, "dev");
// student st2 = new student(20, 75, "sev");
// student st3 = new student(22, 70, "seven");

// List<student> list = new ArrayList<student>();
// list.add(st1);
// list.add(st2);
// list.add(st3);
// System.out.println(list);

// // Collections.sort(list);
// //alpha alp=new alpha();

// Comparator <student> com=(student a, student b)->{
// if(a.marks>b.marks)
// return 1;
// else
// return-1;
// };

// Collections.sort(list, com);
// System.out.println(list);

// }
// }
// _________________________________________Comparable //used when class is
// fully accessible to programer
// import java.util.*;

// class student implements Comparable<student> {
// int age;
// int marks;
// String name;

// public student(int age, int marks, String name) {
// this.age = age;
// this.marks = marks;
// this.name = name;
// }

// public int getAge() {
// return age;
// }

// public int getMarks() {
// return marks;
// }

// public String getName() {
// return name;
// }

// public String toString() {
// return " " + age + " " + marks + " " + name;
// }

// public int compareTo(student a){

// if(this.marks>a.marks)
// return 1;
// else
// return -1;
// }

// }

// public class generic {
// public static void main(String[] args) {

// student st1 = new student(18, 82, "dev");
// student st2 = new student(20, 75, "sev");
// student st3 = new student(22, 70, "seven");

// List<student> list = new ArrayList<student>();
// list.add(st1);
// list.add(st2);
// list.add(st3);
// System.out.println(list);

// // Collections.sort(list);

// Collections.sort(list);
// System.out.println(list);

// }
// }
// ________________________________________toString method()
// class student {
//   private int age;
//   private String name;
//   private String city;

//   public student(int age, String name, String city) {
//     this.age = age;
//     this.name = name;
//     this.city = city;
//   }
//   public String toString(){
//     return "Name:"+name+"| Age:"+age+"| City:"+city;
//   }

// }

// public class generic {
//   public static void main(String[] args) {

//     student st=new student(30,"dev","mumbai");
//     System.out.println(st);
//     student st1=new student(23,"devendra","banglore");
//     System.out.println(st1);

//   }
// }

//_________________________________________fundamentals before IO Operation
// import java.io.*;
// public class generic{
//   public static void main(String[] args)  {
//// File file1=new File("pw.txt");
//// System.out.println(file1.exists());

//// file1.createNewFile();
//// System.out.println(file1.exists());

// // File dir=new File("PW2");
// // System.out.println(dir.isDirectory());
// // dir.mkdir();
// // File f1=new File(dir,"java13pro.txt");
// // try{
// //     f1.createNewFile();
// // }catch(IOException e){
// //     System.out.println("IoExeption occurs");
// // }
// // System.out.println(f1.isFile());

// int count=0;

// File f=new File("C:\\MinGW");
// String str[]=f.list();

// for(String name:str){
//   count++;
//   System.out.println(name);
// }
// System.out.println("Numbers of file are:"+count);
//   }
// }

// ______________________________________________FileWriter
// import java.io.*;
// public class generic{
// public static void main(String[] args) throws IOException {
//   File dir=new File("ALLINONE");
//   dir.mkdir();
//   System.out.println(dir.isDirectory());
//   File f11=new File(dir,"INONE.txt");
//   f11.createNewFile();
//    System.out.println(f11.isFile());
//    FileWriter fw=new FileWriter(f11,true);
//    fw.write("\n");
//    fw.write("PW Skills");
//    fw.write("\n");
//    fw.write(65);
//    fw.write("\n");
//    fw.write(97);
//    fw.write("\n");
//    char ch[]={'j','a','v','a'};
//    fw.write(ch);
//    fw.close();
//    System.out.println("Open File INONE.txt to check this result: ");
// }
// }
//_________________________________File reader

// import java.io.*;
// public class generic{

//   public static void main(String[] args)throws IOException {

//     File dir=new File("pw");
//     File file=new File(dir,"java.txt");

//     FileReader fd=new FileReader(file);
//     //int i = fd.read();
//     char ch[]=new char[(int)file.length()];

//     fd.read(ch);
//     for (char c : ch) {
//       System.out.print(c);
//     }
//     //System.out.println((char)i);
//     // while (i!=-1) {
//     //   System.out.print(i+"---->");
//     //   System.out.println((char)i);
//     //   i=fd.read();
//     // }

//   }
// }

//__________________________________________BufferedWriter FileWriter__
// import java.io.*;
// public class generic{
//   public static void main(String[] args) throws IOException {
//     File dir=new File("pw");
//     System.out.println(dir.isDirectory());
//     File file=new File(dir,"seva.txt");
//     file.createNewFile();
//     System.out.println(file.isFile());

//     FileWriter fw=new FileWriter(file,true);
//     BufferedWriter bf=new BufferedWriter(fw);
//     bf.write("JAva");
//     bf.newLine();
//     bf.write(65);
//     bf.newLine();
//     char ch[]={'J','A','V','A'};
//     bf.write(ch);

//     bf.flush();
//     bf.close();
//    }
// }
//________________________________________BufferReader FileReader
// import java.io.*;
// public class generic{
//   public static void main(String[] args) throws IOException {

//     File dir=new File("pw");
//     File file=new File("java.txt");

//     FileReader fr=new FileReader(file);
//     BufferedReader br=new BufferedReader(fr);

//     String line=br.readLine();

//     while(line!=null){
//       System.out.println(line);
//       line=br.readLine();
//     }

//    }
// }
//_________________________________________PrintWriter
// import java.io.*;

// public class generic {
//   public static void main(String[] args) {

//     File dir = new File("pw");
//     File file = new File(dir, "java.txt");

//     FileWriter fw = null;
//     PrintWriter pw = null;
//     try {
//        fw = new FileWriter(file);
//        pw = new PrintWriter(fw);

//       pw.println(97);
//       pw.println("EVEn");
//       pw.println(65);
//       pw.print(100);
//       pw.println('a');
//       pw.println('A');
//       pw.println(50.5);
//       pw.println(true);

//     } catch (IOException e) {
//       e.printStackTrace();
//     } finally {
//       try {
//         if (pw != null) {
//           pw.close();
//         }
//         if (fw != null) {
//           fw.close();
//         }
//       } catch (IOException e) {
//         e.printStackTrace();
//       }

//     }

//   }
// }
//________________Serialization & Deserialization

// import java.io.*;

// class cricketer implements Serializable {
//   private int age;
//   private String name;
//   private int runs;

//   public cricketer(int age, String name, int runs) {
//     this.age = age;
//     this.runs = runs;
//     this.name = name;
//   }

//   public void disp() {
//   System.out.println(name);
//   System.out.println(age);
//   System.out.println(runs);
//   }

// }

// public class generic {
//   public static void main(String[] args)throws IOException  {

//     cricketer ck = new cricketer(20, "devendra", 55);
//     ck.disp();

//    // Serialization

//     FileOutputStream fos = new FileOutputStream("deva.txt");
//     BufferedOutputStream bf = new BufferedOutputStream(fos);
//     ObjectOutputStream oos = new ObjectOutputStream(fos);

//     oos.writeObject(ck);

//     oos.close();
//     fos.close();

// Deserialization

// try{
// FileInputStream fis = new FileInputStream("deva.txt");
// BufferedInputStream bis = new BufferedInputStream(fis);
// ObjectInputStream ois = new ObjectInputStream(bis);
// cricketer cr = (cricketer) ois.readObject();
// cr.disp();

// ois.close();
// }
// catch(FileNotFoundException e){
// System.err.println("File not Found "+e.getMessage());
// }catch(IOException e){
// System.err.println("IO error"+e.getMessage());
// }catch(ClassNotFoundException e){
// System.err.println("ClassNot found"+e.getMessage());
// }
// finally{
// cricketer c=new cricketer(18,"dev",53 );
// c.disp();
// }
//   }
// }
//__________________________Transient Keyword
import java.io.*;

class student implements Serializable {
  int age;
  transient String name;
  int runs;

  public student(String name, int age, int runs) {
    this.age = age;
    this.runs = runs;
    this.name = name;
  }

  void disp() {
    System.out.println(name);
    System.out.println(age);
    System.out.println(runs);
  }
}

public class generic {
  public static void main(String[] args) throws Exception{
    // student st = new student("dev", 20, 50);
    // st.disp();

    // FileOutputStream fos=new FileOutputStream("deva.txt");
    // BufferedOutputStream bos=new BufferedOutputStream(fos);
    // ObjectOutputStream oos=new ObjectOutputStream(bos);

    // oos.writeObject(st);

    // oos.flush();
    // oos.close();

    FileInputStream fis=new FileInputStream("deva.txt");
    BufferedInputStream bis=new BufferedInputStream(fis);
    ObjectInputStream ois=new ObjectInputStream(bis);

    student st=(student)ois.readObject();
    st.disp();
  }
}