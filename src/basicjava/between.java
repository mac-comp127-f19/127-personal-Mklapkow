package basicjava;

import java.util.*;

public class between {
    public static void main(String[] args) {
        Random generator = new Random();
        System.out.println("Input Maximum value");
        Scanner UI = new Scanner(System.in);
        Integer max_value = UI.nextInt();
        int random_out = generator.nextInt(max_value);
        System.out.println(random_out);

    }
}
