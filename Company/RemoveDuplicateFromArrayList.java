package Company;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

//Write program to remove duplicate from arraylist.
public class RemoveDuplicateFromArrayList {
    public static void main(String[] args) {
        System.out.println("---- Remove Duplicate From Array List ----");
        List<String> al = new ArrayList<String>();
        al.add("Apple");
        al.add("Oppo");
        al.add("Vivo");
        al.add("Samsung");
        al.add("Apple");

        System.out.println(al);

        Set<String> ss = new LinkedHashSet<>(al);
        System.out.println(ss);

    }
}
