package collection;

import java.util.ArrayList;

public class ProgramsOfList {
    public static void main(String[] args) {
        ArrayList l1 = new ArrayList();
        l1.add(12);
        l1.add('A');
        l1.add("string");
        l1.add(true);
        System.out.println(l1);
        ArrayList l2 = new ArrayList();
        l2.addAll(l1);
        System.out.println(l2);
        l2.clear();
        System.out.println(l2);
        System.out.println(l1.size());
        System.out.println(l1.get(2));
        System.out.println(l1.lastIndexOf(12));


    }
}
