
//_____________________________Array Linklist_
// import java.util.ArrayList;

// public class collection {
//     public static void main(String[] args) {
//         ArrayList al = new ArrayList();
//         al.add(100);
//         al.add(200);
//         al.add(300);
//         al.add(1);

//         ArrayList al2 = new ArrayList();
//         al2.add("PW");
//         al2.add("Devendra");
//         al2.add(120);
//         al2.add('t');

//         al.add(200);
//         al2.add(200);
//         System.out.println(al);
//         System.out.println(al2);

//     ArrayList al3=new ArrayList();
//     al3.add(1);
//     al3.add(2);
//     al3.add(3);
//     System.out.println(al3);
//     System.out.println("After adding");
//     al3.addAll(al);
//     System.out.println(al3);
//         al3.add(1, "PAWA");
//         System.out.println(al3);

//     }
// }

//_________________________________Array Deque-

// import java.util.ArrayDeque;

// public class collection {

//     public static void main(String[] args) {
//         ArrayDeque ad=new ArrayDeque();

//         ad.add(100);
//         ad.add(200);
//         ad.add(200);

//         System.out.println(ad);
//         ad.addFirst("dev");
//         ad.addLast("35");

//         System.out.println(ad);

//         ad.offer(300);
//         ad.offerFirst(11);
//         ad.offerLast(10);
//         System.out.println(ad);
//     }
// }
//____________________________Priority Queue

// import java.util.PriorityQueue;

// /**
//  * collection
//  */
// public class collection {

//     public static void main(String[] args) {
//         PriorityQueue pq=new PriorityQueue();

//         pq.add(100);
//         pq.add(300);
//         pq.add(1);
//         pq.add(430);
//         pq.add(40);
//         pq.add(49);  
//         pq.add("pw");
//         System.out.println(pq);
//     }
// }

//__________________________Tree Set

// import java.util.TreeSet;

// public class collection {

//     public static void main(String[] args) {
//             TreeSet ts =new TreeSet();
//             ts.add(100);
//             ts.add(50);
//             ts.add(150);
//             ts.add(200);
//             ts.add(250);
//             ts.add(25);
//         System.out.println(ts);
//         ts.add(100);//duplicate not allowed in TreeSet
//         System.out.println(ts.higher(50));
//         System.out.println(ts.lower(200));

//         System.out.println(ts.ceiling(30));
//         System.out.println(ts.floor(175));

//     }
// }

//______________________________________HashSet

// import java.util.HashSet;
// import java.util.LinkedHashSet;

// public class collection {

//     public static void main(String[] args) {

//         HashSet hs = new HashSet();

//         hs.add(100);
//         hs.add(20);
//         hs.add(30);
//         hs.add(40);

//         System.out.println(hs);

// LinkedHashSet lhs=new LinkedHashSet();

//         lhs.add(100);
//         lhs.add(20);
//         lhs.add(30);
//         lhs.add(40);

//         System.out.println(lhs);
//     }
// }

//________________________________iterator

// import java.util.ArrayList;

// public class collection {

//     public static void main(String[] args) {
//         ArrayList al = new ArrayList();

//         al.add(200);
//         al.add(50);
//         al.add(100);
//         al.add(150);

//         for (int i = 0; i < al.size(); i++) {
//         // Object O=new Object();
//         // O=al.get(i);
//         // System.out.println(O);

//         System.out.println(al.get(i));
//         }

//         for (Object O : al) {
//             System.out.println(O);
//         }
//     }
// }

//_________________________________________________________________________
// import java.util.ArrayList;
// import java.util.Iterator;
// import java.util.ListIterator;

// /**
//  * collection
//  */
// public class collection {

//     public static void main(String[] args) {
//         ArrayList al = new ArrayList();
//         al.add(100);
//         al.add(200);
//         al.add(300);
//         al.add(400);
//         al.add(500);

//         // for (int i = 0; i < al.size(); i++) {
//         //      Object o=al.get(i);
//         //     System.out.println(o);

//         // }

//         // for (Object o: al) {
//         //     System.out.println(o);
//         // }

//     //  Iterator itr=al.iterator();
//     //  while(itr.hasNext())
//     //  {
//     // //    Integer i =(Integer) itr.next();
//     // //    System.out.println(i);

//     // System.out.println(itr.next());
//     //  }

//      ListIterator li=al.listIterator(al.size());
//      while(li.hasPrevious()){
//        Integer i=(Integer) li.previous();
//        System.out.println(i);
//      }
//     }
// }

//________________________________________HASH MAP

// import java.util.*;

// public class collection {

// public static void main(String[] args) {
//     HashMap hm1=new HashMap();
//    hm1.put(101,"devendra");
//    hm1.put(null,"sevendra");
//    hm1.put(103,"keven");
//     hm1.put(5,"raosaab");
//     hm1.put(5,"raosaab");
//    System.out.println(hm1);

//    LinkedHashMap hm2=new LinkedHashMap();
//    hm2.put("google","devendra");
//    hm2.put("microsoft","piyush");
//    hm2.put("meta","jayesh");
//    hm2.put("accenture","pranchu");

//    System.out.println(hm2);
// }    
// }
//__________________________________________HASH Table

// import java.util.Hashtable;
// import java.util.TreeMap;

// public class collection {

//   public static void main(String[] args) {
//     Hashtable ht=new Hashtable();
//     ht.put(1,"rohan");
//     //ht.put(2,"rahul");
//     ht.put(3,"rohit");


//     ht.putIfAbsent(2, "neha");
//     System.out.println(ht);

//     TreeMap tm=new TreeMap();
//     Integer i=new Integer(4);
//     tm.put(i,"teven");
//     tm.put(18,"seven");
//     tm.put(7,"keven");

//     System.out.println(tm);

//   }  
// }

import java.util.*;

class collection {

   public static void main(String[] args) {

        List < Integer > intList = new ArrayList < > ();

        intList.add(10);

        intList.add(20);

        System.out.println("The list is: " + intList);

}

}