import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of apples: ");
        int apple = sc.nextInt();
        System.out.println("Number of apples: " + apple);

        System.out.print("Enter your name: ");
        String name = sc.next();
        System.out.println("Hello, " + name + "!");

        Runtime runtime = Runtime.getRuntime();

        long usedMemory = runtime.totalMemory() - runtime.freeMemory();
        long maxMemory = runtime.maxMemory();
        double usedPercentage = (double) usedMemory / maxMemory * 100;

        System.out.println("Used memory: " + usedMemory + " bytes");
        System.out.println("Max memory: " + maxMemory + " bytes");
        System.out.println("Memory used percentage: " + usedPercentage + "%");
    }
}
