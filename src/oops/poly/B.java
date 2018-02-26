/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oops.poly;

/**
 *
 * @author Ganesh
 */
public class B extends A {

    @Override
    public void method1() {
        System.out.println("Class B-Method1");
    }

    @Override
    public void method2() {
        System.out.println("Class B-Method2");
    }

    public void method3(String s1) {
        System.out.println("Class B Method3-with string" + s1);
    }
    public static void method4(){
        System.out.println("class B - method4..");
    }

    public static void main(String args[]) {
        System.out.println("in class b main");

        System.out.println("1---- B b = new B()-------------");
        B b = new B();
        b.method3(53);
        b.method1();
        b.method2();
        b.method3("ganesh");
        b.method4();

        
        System.out.println("2---- A a = new A()-------------");
        A a = new A();
        a.method1();
        a.method2();
        a.method3(7);
        a.method4();


        System.out.println("3----A a2 = new B()-------------");
        A a2 = new B();
        a2.method1();
        a2.method2();
        a2.method3(55);
        a2.method4();
      
        
        I i = new B();
        I i2 = new A();
        

        //4----  B b11 =  new A(); not possible
        //ex :  String s = new Object();  //not possible
        //      Object o = new String();  // possible


        if (b instanceof A) {
            System.out.println("b instanceof A - true");
        }
        if (b instanceof B) {
            System.out.println("b instanceof B - true");
        }
        if (a instanceof A) {
            System.out.println("a instanceof A - true");
        }
        if (a2 instanceof A) {
            System.out.println("a2 instanceof A - true");
        }
        if (a2 instanceof B) {
            System.out.println("a2 instanceof B - true");
        }

       

    }
}
//Output:
//in class b main
//1---- B b = new B()-------------
//Class B-Method1
//Class B-Method2
//Class B Method3-with stringganesh
//Class A Method3-with int53
//2---- A a = new A()-------------
//Class A-Method1
//Class A-Method2
//Class A Method3-with int7
//3----A a2 = new B()-------------
//Class B-Method1
//Class B-Method2
//Class A Method3-with int55
//a2 instanceof A - true
//a2 instanceof B - true
