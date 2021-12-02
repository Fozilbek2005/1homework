
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num = 11;
        System.out.println(num);
        String word = "Hello word";
        System.out.println(word);
        final int costNum = 16;
        if (num < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (num > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили нуль");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String name = scanner.nextLine();
        if (name.equals("Fozilbek")) {
            System.out.println("добро пожаловать Fozilbek ");
        }
    }
}