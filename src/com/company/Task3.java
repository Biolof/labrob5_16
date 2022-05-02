package com.company;

public class Task3 {

    public static void main(String[] args)
    {
        int num = (int) ( Math.random() * 102 );
        System.out.println("Число - " + num);
        String str = Integer.toString(num);
        System.out.println("Кількість цифр у числі - "+str.length());

    }
}