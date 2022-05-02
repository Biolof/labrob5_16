package com.company;
import java.util.Scanner;

public class Task4
{
    public static void main(String[] args)
    {
        int num1, num2, num3, enteredNumber1, enteredNumber2, enteredNumber3, a = 0;
        do
        {
            a++;
            System.out.println("Введіть три цілих числа від 1 до 3 (у вас залишилося 2 спроби) - ");
            Scanner num = new Scanner(System.in);
            num1 = (int)(Math.random() * 3 + 1);
            num2 = (int)(Math.random() * 3 + 1);
            num3 = (int)(Math.random() * 3 + 1);
            if (num.hasNextInt())
            {
                enteredNumber1 = num.nextInt();
                enteredNumber2 = num.nextInt();
                enteredNumber3 = num.nextInt();
                if (num1 == enteredNumber1 && num2 == enteredNumber2 && num3 == enteredNumber3)
                    System.out.println("Ви вгадали всі три числа");
                else
                {
                    System.out.println("На жаль ви не  вгадали, спробуйте ще раз (залишилася 1 спроба) - ");
                    num1 = (int) (Math.random() * 3 + 1);
                    num2 = (int) (Math.random() * 3 + 1);
                    num3 = (int) (Math.random() * 3 + 1);
                    if (num.hasNextInt())
                    {
                        enteredNumber1 = num.nextInt();
                        enteredNumber2 = num.nextInt();
                        enteredNumber3 = num.nextInt();
                        if (num1 == enteredNumber1 && num2 == enteredNumber2 && num3 == enteredNumber3)
                            System.out.println("Ви вгадали всі три числа");
                            else
                            System.out.println("Ви використали всі спроби і не вгадали три числа");
                    }
                    else
                        System.out.println("Ви не ввели ціле число ");
                }
            }
            else
                System.out.println("Ви не ввели ціле число ");
        }while (a!=1);
    }
}