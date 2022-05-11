package methodtypes;

public class Runmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pragathimethods pa=new Pragathimethods();
pa.add();
pa.adding(10, 20);
int a;
a=pa.hashCode();
System.out.println(a);
String b;
b=pa.toString();
System.out.println(b);
Class<? extends Pragathimethods> c;
c =pa.getClass();
System.out.println(c);
Class<?> d=pa.getClass();
System.out.println(d);

//return type method use
 boolean e=pa.equals(pa);
 System.out.println(e);
int h=pa.addreturn();
System.out.println(h);
int i=pa.hashCode();
System.out.println(i);
int s=pa.subreturn();
System.out.println(s);







	}

}
