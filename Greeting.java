public class Greeting {
    public static String greet(String name) {
        return "Hello, " + name + "!";
    }
    public static String greetColor(String name) {
        // ANSI green: \u001B[32m, reset: \u001B[0m
        return "\u001B[32mHello, " + name + "!\u001B[0m";
    }
}