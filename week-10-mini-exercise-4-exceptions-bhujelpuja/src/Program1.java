//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Program1 {
    public Program1() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an integer: ");

        try {
            String userInput = scanner.nextLine();
            int userNumber = Integer.parseInt(userInput);
            System.out.println("You entered the integer: " + userNumber);
        } catch (NumberFormatException var7) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            System.out.println("Program 1 execution completed.");
        }

    }
}
