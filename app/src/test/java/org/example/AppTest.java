package org.example;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testRemoveDuplicatesEmpty() {
        ArrayList<Integer> input = new ArrayList<>();
        ArrayList<Integer> expected = new ArrayList<>();
        assertEquals(expected, App.removeDuplicates(input));
    }

    @Test
    void testRemoveDuplicatesSingle() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1));
        assertEquals(expected, App.removeDuplicates(input));
    }

    @Test
    void testRemoveDuplicatesMultiple() {
        ArrayList<String> input = new ArrayList<>(Arrays.asList("A", "A", "B"));
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("A", "B"));
        assertEquals(expected, App.removeDuplicates(input));
    }

    @Test
    void testRemoveDuplicatesNumbers() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 1, 3, 3, 5, 5));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 3, 5));
        assertEquals(expected, App.removeDuplicates(input));
    }
}
