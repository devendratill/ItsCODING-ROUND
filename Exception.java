
//__________________________________________Inner class
// class A {
//     public void display() {
//         System.out.println("Display IN");
//     }

//     class B {
//         public void show() {
//             System.out.println("Show In");
//         }

//     }
// }

// public class Exception {

//     public static void main(String[] args) {
//      A obj=new A();
//      A.B obj1=obj.new B();

//      obj.display();
//      obj1.show();
//     }
// }
// __________________________________Anonymous Class____________Lambda exp_____________________________________
// interface car {
//     public void drive(int n,int t);
// }

// public class Exception {
//     public static void main(String[] args) {
//         car obj = (n,t) -> {
//             System.out.println("Driving>>>>"+n+" "+t);
//         };
//         obj.drive(90,89);
//     }
// }
// ____________________________________________Try____Catch_________________________________

// public class Exception {

//   public static void main(String[] args) {
//     int a = 6;
//     int b = 0;
//     int r =0;
//     int arr[]={2,32,13,34};
//     String name=null;
//     try {

//       r = a / name.length();
//       System.out.println(arr[5]);
//     }

//     catch (ArithmeticException e) {
//       System.out.println("Something Went Wrong"+e);
//     }
// catch (ArrayIndexOutOfBoundsException e) {
//       System.out.println(arr[arr.length-1]);
//       System.out.println("Stay in your Limits ");
//     }

//     catch(Exception e){
//       System.out.println("Something went wrong here");
//     }
//     System.out.println(a + "/" + b + "=" + r);

//   }
// }

// ____________________________________multiple Catch block_____________________________

// import java.util.InputMismatchException;
// import java.util.Scanner;

// public class Exception{

//   public static void main(String[] args) {
//     int num = 0;

//    try( Scanner sc = new Scanner(System.in);){
//      num=sc.nextInt();

//    }

// //    catch(InputMismatchException e){
// //     System.out.println("Please Enter a number");
// //    }
// // finally{
// //   sc.close();
// // }

//    System.out.println(num);
//   }
// }

// ____________________________Ducking an expection_________________________

// class demo {
//   public void a() throws Exception{
//      b();
//   }

//   public void b() throws Exception {
//     int n1 = 6;
//     int n2 = 2;
//     int result = 0;

//       result = n1 / n2;
//       System.out.println(result);
//     System.out.println(result);
//   }

// }

// public class Exception {
//   public static void main(String[] args) {
//     demo obj = new demo();
    
//         try{
//       obj.a();
//     }
//     catch(Exception e){
//       System.out.println("Something Went Wrong"+e.getMessage());
//     }
//   }

// }

// ____________________________________Rethrowing an Exception________________________


// public class Exception {
// public static void main(String[] args) {
//   int n1=8;
//   int n2=-2;
//   int result=0;

//   try{
//     if(n2<0){
//       Exception e=new ArithmeticException("negative number");
//       throw e;
//     }
//     else{
//       result=n1/n2;
//       System.out.println(result);
//     }
//   }
//   catch(Exception e){
//    System.out.println("Enter a positive number"+e);
//   }

// }
  
// }
// _________________________PW practical Question___________

//   class Exception 

//            {

//                      public static void main(String args[]) 

//                      {

//                      try

//                      {

//                                 System.out.print("Hello" + " " + 1 / 0);

//                      }

//                      catch(ArithmeticException e) 

//                       {

//                                System.out.print("World");           

//                      }

//            }

//     }

  