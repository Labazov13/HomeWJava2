package org.example;

/*Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл. */
import java.util.Scanner;
import java.util.logging.*;
public class Exam2{

    public static int getRandomNumber(){
        int x = (int)(Math.random()*9);
        return x;
    }

    public static int [] fillArray(){
        int countElement = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        boolean isNumber = sc.hasNextInt();
        if(isNumber){
            countElement = sc.nextInt();
        }
        int [] array = new int[countElement];
        for (int i = 0; i < array.length; i++) {
            array[i] = getRandomNumber();
        }
        sc.close();
        return array;
    }

    public static void printArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void sortBuble(int [] array) throws Exception{
        Logger logger = Logger.getLogger(Exam2.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        int temp = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0;j < array.length - 1; j++){
                if(array[j] > array[j + 1]){
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    logger.info("Произошла замена элементов с " + array[j + 1] + " на " + array[j]);
                }
                logger.info("Переход к шагу " + j + " во внутреннем цикле");
            }
            logger.info("Переход к шагу " + i + " во внешнем цикле");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception{
        int [] array = fillArray();
        printArray(array);
        sortBuble(array);
        printArray(array);

    }
}
