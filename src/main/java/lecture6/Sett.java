package lecture6;

import java.util.*;
//import java.util.HashSet;

public class Sett {
    public static void main(String[] args) {

        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        for (int i : hashSet) {
            System.out.println(i);
        }
    }
}


