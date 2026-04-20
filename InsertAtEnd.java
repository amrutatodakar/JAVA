package linkedlist;

import java.util.*;

public class InsertAtEnd {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Blue");

        list.offerLast("Pink");

        System.out.println("After inserting at end: " + list);
    }
}