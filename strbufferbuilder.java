/**
 * demo
 */
public class strbufferbuilder {

    public static void main(String[] args) {
        StringBuffer name = new StringBuffer("virat");
        name.append(" kohli");
        name = new StringBuffer("deva");
        System.out.println(name);
//-----------------------------------------------------------------
System.out.println();
        final int n = 10;
        // n=20;
        System.out.println(n);
//----------------------------------------------------------------
System.out.println();
        StringBuffer nm = new StringBuffer();
        nm.append("dededfhgnmkftri");
        nm.append("deva");
        System.out.println(nm);
        System.out.println(nm.capacity());
        System.out.println(nm.length());
        //--------------------------------------------------------
        System.out.println();
        StringBuilder nam=new StringBuilder("deva");
        System.out.println(nam.capacity());
        System.out.println(nam.charAt(3));
        nam.setCharAt(3,'Q' );
        System.out.println(nam);
//---------------------------------------------------------------------
System.out.println();
StringBuilder cap=new StringBuilder(150);
System.out.println(cap.capacity());
cap.append("javawiuhduiwhhwiuhfuiwhuiwhfuiwhfiuwhfuifiwfihfuwhfiheihf");
System.out.println(cap.capacity());
cap.trimToSize();
System.out.println(cap.capacity());
//-----------------------------------------------------------------------------
System.out.println();
StringBuffer p=new StringBuffer("mam OP nitin");
//p.append("mam op nitin");
System.out.println(p.reverse());


    }
}
