package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        StreamMain.streamAPI();

        List<Integer> numbers = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        for (Integer i : numbers) {
            System.out.println(i);
        }

        //сортировка положительных чисел
        numbers = positiveNumbers(numbers);
        System.out.println("//сортировка положительных чисел");
        for (Integer i : numbers) {
            System.out.println(i);
        }

        //сортировка по четности
        numbers = evenNumbers(numbers);
        System.out.println("//сортировка по четности");
        for (Integer i : numbers) {
            System.out.println(i);
        }

        //сортировка по возрастанию
        numbers = ascendingOrderOfNumbers(numbers);
        System.out.println("//сортировка по возрастанию");
        for (Integer i : numbers) {
            System.out.println(i);
        }
    }

    public static ArrayList<Integer> positiveNumbers(List<Integer> numbers) {
        ArrayList<Integer> supportNumbers = new ArrayList<>();
        for (Integer i : numbers) {
            if(i > 0) {
                supportNumbers.add(i);
            }
        }
        System.out.println("");
//        for (Integer i : supportNumbers) {
//            System.out.println(i);
//        }
        return supportNumbers;
    }

    public static ArrayList<Integer> evenNumbers(List<Integer> numbers){
        ArrayList<Integer> supportNumbers = new ArrayList<>();
        for(Integer i : numbers){
            if(i % 2 == 0){
                supportNumbers.add(i);
            }
        }
        System.out.println("");
//        for (Integer i : supportNumbers) {
//            System.out.println(i);
//        }
        return supportNumbers;
    }

    public static ArrayList<Integer> ascendingOrderOfNumbers(List<Integer> numbers) {
        ArrayList<Integer> supportNumbers = new ArrayList<>();
        supportNumbers.addAll(0, numbers);
        System.out.println("supportNumbers.addAll");
        for (Integer y : supportNumbers) {
            System.out.println(y);
        }

        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for(int i = 0; i < supportNumbers.size() - 1; i++){
                if(supportNumbers.get(i) > supportNumbers.get(i+1)) {
                    isSorted = false;

                    Integer buf1 = supportNumbers.get(i);
                    Integer buf2 = supportNumbers.get(i+1);
                    supportNumbers.set(i, buf2);
                    supportNumbers.set(i+1, buf1);
                }
            }
        }
        return supportNumbers;
    }
}