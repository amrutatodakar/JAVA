package arraylist;

import java.util.*;

public class SubListColors {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        List<String> subList = colors.subList(0, 2);

        System.out.println("SubList (1st & 2nd): " + subList);
    }
}