package com.cursor;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        {
//            task 1
            ArrayList<Integer> list = new ArrayList<>(List.of(3, 9, 11, 18, 20, 22));
            System.out.println(list);
            list.removeIf(n -> (n % 3 == 0));
            System.out.println(list);
        }
        {
//            task 2
            ArrayList<String> fruit = new ArrayList<>(List.of("Apple", "Kiwi", "Lemon", "Mango", "Banana", "Orange"));
            System.out.println(fruit);

            int index = fruit.indexOf("Orange");
            if (index != -1) {
                fruit.set(index, "Grapefruit");
                System.out.println(fruit);
            } else {
                System.out.println("Value not present");
            }
            {
//            task 3
                ArrayList<String> calendar1 = new ArrayList<>(List.of("01/01/21", "15/03/18", "28/08/16", "31/12/20"));
                ArrayList<String> calendar2 = new ArrayList<>(List.of("31/12/20", "21/04/16", "17/09/21", "06/07/19"));
                System.out.println(calendar1);
                System.out.println(calendar2);

                calendar1.retainAll(calendar2);
                System.out.println("Similar date: " + calendar1);
            }
        }
    }
}
