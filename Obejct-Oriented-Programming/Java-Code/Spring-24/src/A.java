import java.util.ArrayList;

public abstract class A {
    abstract void m1(A a);
}
class B extends A {
    void m1(A a){
        System.out.println("One");
    }
}
class C extends B {
    void m1(B b) {
        System.out.println("Two");
        super.m1(new B());
        System.out.println("Three");
    }
}
class Test {
    public static void main(String[] args) {
        C c = new C();
        c.m1(new B());
        ArrayList<Integer> intList= new ArrayList<>();
        intList.add(2);
        intList.add(6);
        intList.add(27);
        intList.add(245);
        System.out.println("ArrayList"+intList);
        for (int i=0; i<intList.size()    ;i++){

            System.out.println(intList.get(i));
        }
        for( int a : intList){
            System.out.println(a);
        }
        intList.add(2,400);
        intList.remove(0);
        intList.set(1,3000);
        intList.add(2,5400);
        int x= intList.get(3);
        System.out.println(x);
        System.out.println(intList);
    }
}