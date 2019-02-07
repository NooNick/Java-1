package lesson_2;

import jdk.nashorn.api.tree.ForInLoopTree;

import java.util.Arrays;

public class Main {

    // 1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static int[] task1(int[] list) {


        for (int i = 0; i < list.length; i++) {
            if (list[i] == 1) {
                list[i] = 0;
            } else {
                list[i] = 1;
            }

        }
        return list;

    }

    // 2 Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    public static int[] task2(int[] list) {


        for (int i = 0; i < list.length; i++) {
            list[i] = i * 3;
        }
        return list;

    }

    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static int[] task3(int[] list) {


        for (int i = 0; i < list.length; i++) {
            if (list[i] < 6)
                list[i] = list[i] * 2;

        }
        return list;

    }

    //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    public static int[][] task4(int[][] list) {


        for (int i = 0, j = list.length - 1; i < list.length; i++, j--) {
            list[i][i] = 1;
            list[i][j] = 1;
        }
        return list;

    }


    //5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    public static String task5(int[] list) {
        int max = list[0];
        int min = list[0];

        for (int i = 0; i < list.length; i++) {
            if (list[i] < min)
                min = list[i];
            if (list[i] > max)
                max = list[i];
        }


        return "минимальное значение " + min + " Максимальное значение " + max;

    }

    //6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
    public static String task6(int[] list) {
        int max;
        int min = 0;
        String maxString = "";
        String minString = "";

        for (int i = 0; i < list.length; i++) {
            max = 0;
            maxString = "";
            min = min + list[i];
            minString = minString + " " + list[i];
            for (int j = list.length - 1; j > i; j--) {
                max = max + list[j];
                maxString = list[j] + " " + maxString;
            }
            if (min == max) {
                return "[" + minString + " || " + maxString + "] (" + min + " || " + max + " ) - true";
            }
        }
        return " False";

    }

    //7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементымассива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    public static int[] task7(int[] list, int n) {
        int a;
        int b;
        for (int j = 0; j < n; j++) {

            a = list[list.length - 1];
            for (int i = 0; i < list.length; i++) {
                b = list[i];
                list[i] = a;
                a = b;
            }
        }
        return list;
//Евклидова метрика
    }
    public static double task8(int[] list, int[] list2) {
        double result = 0;
        for (int i = 0; i < list.length ; i++) {
        result = result + Math.pow(list[i] - list2[i],2);
        }
        result=Math.sqrt(result);
        return result;

    }
// значения в масиве на оборот.
    public static int[] task9(int[] list) {
        int x = 0;
        for (int i = 0, j = list.length - 1; i < j; i++ , j--) {
            x= list[i];
            list[i] = list[j];
            list[j] = x;
        }
        return list;
    }

    public static void main(String[] args) {

        System.out.println("задание 1 - " + Arrays.toString(task1(new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0})));
        System.out.println("задание 2 - " + Arrays.toString(task2(new int[8])));
        System.out.println("задание 3 - " + Arrays.toString(task3(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1})));
        int[][] arrTask4 = task4(new int[8][8]);
        System.out.println("задание 4 - " + Arrays.toString(arrTask4[0]));
        for (int i = 1; i < arrTask4.length; i++) {
            System.out.println("          - " + Arrays.toString(arrTask4[i]));
        }
        int[] arrTask5 = arrTask(new int[10], 100);
        System.out.println("задание 5 - " + Arrays.toString(arrTask5) + task5(arrTask5));
        int[] arrTask6 = arrTask(new int[10], 10);
        System.out.println("задание 6 - " + task6(arrTask6));
        int[] arrTask7 = arrTask(new int[8], 100);
        System.out.println("задание 7 - " + Arrays.toString(arrTask7) + Arrays.toString(task7(arrTask7, 3)));

        System.out.println("задание 8 - " + task8(new int[]{1,2,3,4,5},new int[]{9,8,7,6,5}));
        int[] arrTask9 = arrTask(new int[8], 100);
        System.out.println("задание 9 - " + Arrays.toString(arrTask9) + Arrays.toString(task9(arrTask9)));
    }

    // метод заполнения масива случайными числами.
    public static int[] arrTask(int[] list, int n) {
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * n);
        }
        return list;
    }
}
