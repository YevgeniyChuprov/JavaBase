package org.example;


import java.util.Random;

public class Main {
    public static void main(String[] args) {
//    1) поупражняться с математическими и логическими операторами, добиться переполнения при вычислениях, посмотреть результаты (вывести в консоль)
        byte varByte = 127, maxByte;
        maxByte = (byte) (varByte + 1);
        System.out.println(maxByte);

        short varShort = 32767, maxShort;
        maxShort = (short) (varShort + 1);
        System.out.println(maxShort);

        char varChar = 65535, maxChar;
        maxChar = (char) (varChar + 1);
        System.out.println(maxChar);

        int varInt = Integer.MAX_VALUE;
        System.out.println(varInt + 1);

        long varLong = Long.MAX_VALUE;
        System.out.println(varLong + 1);

        Random random = new Random();

        if(random.nextBoolean()){
            System.out.println("Это правда");
        }else {
            System.out.println("Это ложь");
        }

        if(random.nextBoolean()){
            System.out.println("Это правда");
        }else {
            System.out.println("Это ложь");
        }

        int b = (int) (Math.random()*100);
        if(b <= 40 || b >= 70){
            System.out.println("b находится вне диапазона между 40 и 70 и равняется " + b);
        }else {
            System.out.println("b находится в диапазоне между 40 и 70 и равняется " + b);
        }


//    2) попробовать вычисления комбинаций типов данных (int и double)

        int anInt = 10;
        double aDouble = 1.5;
        System.out.println(anInt + aDouble);
        System.out.println((int) (anInt + aDouble));
    }

}