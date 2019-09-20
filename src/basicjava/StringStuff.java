package basicjava;

public class StringStuff {
    public static void main(String[] args) {
        System.out.println(sayHello("Jeff"));
        System.out.println(sayHello("Hannah"));
        System.out.println(sayHello("Myles"));


    }

    public static String sayHello(String name) {
        int lengthOfName = name.length();
        String lastHalfOfName = name.substring(lengthOfName / 2);
        return "Hello, " + name + lastHalfOfName + "!";
    }
}
