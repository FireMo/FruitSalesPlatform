package com.lican.DouYin;

/**
 * @Descirption TODO
 * @Author FireMo
 * @Date 2019/9/10 11:35
 */
public class Test {
    public static void main(String[] args) {

        //测试除数为0的情况
//        int a = 0;
//        int b = a / 0;
//        System.out.println(b); //算术运算异常

        double c = 3.14;
        double d = c / 0;
        System.out.println(d); //正常，结果为无穷大


        Dog dog = new Dog();
        Change.dogToNull(dog);
        dog.eat();//会不会出现空指针异常
        /*
         * 不会出现空指针异常
         * 局部变量只在当前大括号有效！
         * 引用传递dog对象是引用类型，两个对象占着不同的堆内存
         */
    }
}

class Dog {
    void eat() {
        System.out.println("eat()");
    }
}

class Change {
    static void dogToNull(Dog dog){
        dog = null;
    }
}
