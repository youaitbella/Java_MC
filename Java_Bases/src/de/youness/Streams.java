package de.youness;

import java.util.Random;
import java.util.Stack;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {
        //////////////////////////////
//        int[] nums = {1, 2, 3, 4, 5};
//        Stream.of(nums).forEach(n -> System.out.println(n));
//        Arrays.stream(nums).forEach(n -> System.out.println(n));

        //////////////////////////////////////////
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(32);
        stack.push(1024);
        stack.push(8);
        stack.push(127);
        stack.stream().sorted().forEach(n -> System.out.print(n + ", "));

        System.out.println();

        for (int i : stack) {
            System.out.print(i + ", ");
        }

        ////////////////////////////////////////////
        Stream.of("Ene", "mene", "muh", "und", "raus", "bist", "du").limit(3).forEach(System.out::println);
        Stream.of("Ene", "mene", "muh", "und", "raus", "bist", "du").limit(3).forEach(i -> System.out.println(i));
        Stream.of("Ene", "mene", "muh", "und", "raus", "bist", "du").limit(3).forEach(System.out::println);

//        Stream.iterate(0, i -> i + 1).forEach(System.out::println);
        Stream.iterate(0, i -> i + 1).limit(10).forEach(System.out::println);

        /////////////////////////////
        Integer[] i = new Integer[100];
        for (int num = 0; num < i.length; num++) {
            i[num] = new Random().nextInt(100);
        }

        int ergebnis = Stream.of(i).mapToInt(k -> k.intValue()).filter(k -> k % 3 == 0).limit(10).sum();
        System.out.println(ergebnis);
        /////////////////////////////////

        //Stream.of(1, 68, 17, 104, 15).filter(i -> System.out.println("filter: " + i); // Fehler
        Stream.of(1, 68, 17, 104, 15).filter(j -> {
            System.out.println("filter: " + j);
            return true;
        });

        //////////////////////////
        Stream.of(1, 68, 9, 104, 15).filter(k -> {
            System.out.println("filter 1: " + k);
            return k > 10;
        }).filter(k -> {
            System.out.println("filter 2: " + k);
            return k % 3 == 0;
        }).forEach(k -> System.out.println("forEach: " + k));

        ////////////////////////////////////////////////
    }

}
