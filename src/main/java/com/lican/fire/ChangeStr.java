package com.lican.fire;

public class ChangeStr {

    public static String reverse1(String str){
        return new StringBuilder(str).reverse().toString();
    }

    public static String reverse2(String str){
        char[] chars = str.toCharArray();
        String res = "";
        for (int i = chars.length-1; i >= 0; i-- ){
            res += chars[i];
        }
        return res;
    }

    public static String reverse3(String str){
        String res = "";
        for (int i = 0; i< str.length(); i++){
            res = str.charAt(i) + res;
        }
        return res;
    }

    public static int compare(String str1, String str2){
        return  str1.compareTo(str2);
    }

    public static boolean isTrue(String str){
        int num =0;
        for (int i = 0; i < str.length(); i++){
            if (')' == str.charAt(i)){
                num++;
            }else if ('(' == str.charAt(i)){
                num--;
            }
        }
//        System.out.println(num);
        if (num != 0){
            return false;
        }else {
            return true;
        }
    }


    public static void main(String[] args) {
        String str = "L B C";
//        for (int i = str.length()-1; i>=0; i--){
//            System.out.print(str.charAt(i));
//        }
//        System.out.println("*************");
//
//        System.out.println("变换后" + reverse1(str));
//        System.out.println("变换后" + reverse2(str));
//        System.out.println("变换后" + reverse3(str));

//        String str2 = str.replace(" ", "%20");
//        System.out.println(str2);

        String str3 = "))hdfs(()()()()(";
        System.out.println(isTrue(str3));

    }
}
