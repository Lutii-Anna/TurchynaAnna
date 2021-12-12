package lecture6;

import java.util.*;

public class Maps {
    // Kyiv 27
    // Lviv 14
    // Odessa 17
    // Kharkiv 19
    public static void main(String[] args) {
        //Map map = new HashMap<>();  //зберігає значення в довільному порядку, дозволяє задавати ключ або значення, це може бути <null>
        //Map map2 = new LinkedHashMap(); // зберігає в порядку додавання
        //Map map3 = new TreeMap();   // сортування

        Map<String, Integer> map = new HashMap<>();
        map.put("Kyiv", 27);
        map.put("Lviv", 14);
        map.put("Odessa", 17);
        map.put("Kharkiv", 19);

        //System.out.println(map); // виведення в один рядок

        // видалення
        //map.remove("Lviv");

        // виведення з нового рядку
        for (Map.Entry<String, Integer> m : map.entrySet())
            System.out.println(m.getKey() + " " + m.getValue());


    }
}

