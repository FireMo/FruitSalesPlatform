package com.lican.fire;

public class Test {
    public static void main(String[] args) {
//        A a = new B();
//        test(a);
        Float s = new Float(3.2345);
        System.out.println(s);
    }
    public static void test(A a){
        System.out.println("test A");
        a.whoAmI();
    }
    public static void test(B b){
        System.out.println("test B");
        b.whoAmI();
    }

    class A {
        public void whoAmI(){
            System.out.println("I am A");
        }
    }
    class B extends A {
        public void whoAmI(){
            System.out.println("I am B");
        }
    }
}
