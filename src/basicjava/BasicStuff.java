package basicjava;

import java.lang.Math;
import java.util.List;

/**
 * Created by Mklapkow 9/7/19
 */

public class BasicStuff {
    public static void main(String[] args) {
        double age0 = 20;
        double age1 = 19;
        System.out.println("We are " + age0 + " and " + age1 + " years old!");

        double sumOfAges = age1 + age0;

        System.out.println("The sum of our ages is " + sumOfAges + "!");

        System.out.println("The sum of our ages is " + (age1 + age0) + "!");

        System.out.println(6/3);

        System.out.println(6/4);

        System.out.println(Integer.MAX_VALUE);

        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.MIN_VALUE - 1);

        int total = 1600;
        final int week = 168;
        final int day = 24;

        int weeks = total / week;
        total = total % week;

        int days = total / day;
        total = total % day;

        int hours = total;

        System.out.println("Weeks: " + weeks + " Days: " + days + " Hours: " + hours);

        double h = 5;
        double r = 2;
        double V;
        double A;

        V = (1.0/3.0) * 3.14159 * r * r * h;

        System.out.println(V);

        A = (3.14159 * r * r) + (3.14159 * r) * Math.sqrt(r * r + h * h);

        System.out.println(A);

        List<String> magicWords = List.of("hocus", "pocus", "abracadabra");
        System.out.println("magicWords = " + magicWords);

        List<String> people = List.of("sally", "fred");
        for(String word : magicWords) {
            for(String person : people) {
                System.out.println(person + " says " + word + "!");
            }
        }

    }
}
