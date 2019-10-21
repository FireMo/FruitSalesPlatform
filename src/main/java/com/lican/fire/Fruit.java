package com.lican.fire;

public class Fruit {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void show_name(int num){
        System.out.println("Fruit: " + num);
    }

    public static void main(String[] args) {
//        Fruit apple = new Apple();
//        apple.show_name(2);

        Fruit fruit = new Fruit();
        fruit.setName("fire");
        String name = fruit.getName();
        System.out.println(name);
    }
}

