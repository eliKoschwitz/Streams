package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[] {9,1,8,2,7,3,6,4,5};

        int[] sortedArray = Arrays.stream(numbers).sorted().toArray(); //.forEach(s -> System.out.println(s));
        System.out.println(Arrays.toString(sortedArray));

        int sum = Arrays.stream(numbers).reduce((a, b) -> a + b).getAsInt();
        System.out.println("alle addiert " + sum);

        int sum2 = Arrays.stream(numbers).reduce((a, b) -> a * b).getAsInt();
        System.out.println("alle multipliziert " + sum2);



    }
}