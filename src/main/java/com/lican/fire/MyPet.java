package com.lican.fire;

public class MyPet {
    public static void greet(String word){
        word = "Hey!";
        System.out.println(word);
    }

    public static void main(String[] args) {
        String word = "Hello";
        greet(word);
        System.out.println(word);
    }
}
