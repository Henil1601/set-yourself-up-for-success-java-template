package org.example;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class App {

    // Method to remove duplicates using a Set
    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {
        Set<T> set = new LinkedHashSet<>(list); // Keeps original order
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("A");
        words.add("A");
        words.add("B");
        System.out.println("Original: " + words);
        System.out.println("No Duplicates: " + removeDuplicates(words));

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(1);
        nums.add(3);
        nums.add(3);
        nums.add(5);
        nums.add(5);
        System.out.println("Original: " + nums);
        System.out.println("No Duplicates: " + removeDuplicates(nums));
    }
}
