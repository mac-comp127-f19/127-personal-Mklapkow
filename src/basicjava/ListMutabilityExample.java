package basicjava;

import java.util.ArrayList;
import java.util.List;

public class ListMutabilityExample {
    public static void printBulletList(List<String> items) {
        for (String item : items) {
            System.out.println("• " + item);
        }

        items.add("Kelp");
        items.add("Nails");
    }

    public static void main(String[] args) {
        List<String> animals = new ArrayList();

        System.out.println("Step 0");
        animals.add("Dolphin");
        printBulletList(animals);

        System.out.println("Step 1");
        animals.add("Lemur");
        printBulletList(animals);

        System.out.println("Step 2");
        animals.add("Cow");
        printBulletList(animals);
    }
}
