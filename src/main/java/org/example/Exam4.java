package org.example;

import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;

public class Exam4 {
    public static void Calculator(){
        Logger log = Logger.getLogger(Exam4.class.getName());
        ConsoleHandler ch = new ConsoleHandler();
        log.addHandler(ch);

        int firstNumber, secondNumber;
        String operation;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        firstNumber = sc.nextInt();
        System.out.print("Введите операцию (+, -, *, /): ");
        operation = sc.next();
        System.out.print("Введите второе число: ");
        secondNumber = sc.nextInt();
        sc.close();

        if(operation.equals("+")){
            log.info("Выполнение операции сложения...");
            log.info("Результат: " + (firstNumber + secondNumber));
        }
        if(operation.equals("-")){
            log.info("Выполнение операции вычитания...");
            log.info("Результат: " + (firstNumber - secondNumber));
        }
        if(operation.equals("*")){
            log.info("Выполнение операции умножения...");
            log.info("Результат: " + firstNumber * secondNumber);
        }
        if(operation.equals("/")){
            log.info("Выполнение операции деления...");
            log.info("Результат: " + firstNumber / secondNumber);
        }

    }

    public static void main(String[] args) {
        Calculator();
    }
}
