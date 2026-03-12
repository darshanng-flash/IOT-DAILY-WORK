//write a program for collection package in java using ArrayList:

package day10;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> list = new ArrayList<>();

        // Add elements to the ArrayList
        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("ArrayList");

        // Print the ArrayList
        System.out.println("ArrayList: " + list);

        // Get an element at a specific index
        String element = list.get(1);
        System.out.println("Element at index 1: " + element);

        // Remove an element from the ArrayList
        list.remove("Java");
        System.out.println("ArrayList after removal: " + list);

        // Check if the ArrayList contains a specific element
        boolean contains = list.contains("World");
        System.out.println("Contains 'World': " + contains);

        // Get the size of the ArrayList
        int size = list.size();
        System.out.println("Size of ArrayList: " + size);

        // Clear the ArrayList
        list.clear();
        System.out.println("ArrayList after clearing: " + list);
    }

}
