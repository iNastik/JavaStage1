package training.fundamentals.maintask;

public class Task2 {
    public static void main(String[] args) {
        for (int i = args.length - 1; i < args.length && i >= 0; i--) {
            System.out.println(args[i]);
        }
    }
}
