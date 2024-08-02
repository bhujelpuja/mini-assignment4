//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program2 {
  public Program2() {
  }

  public static void main(String[] args) {
    int[] numbers = new int[6];

    try {
      Scanner fileScanner = new Scanner(new File("inFile.txt"));

      for(int index = 0; fileScanner.hasNextLine() && index < numbers.length; ++index) {
        numbers[index] = Integer.parseInt(fileScanner.nextLine());
      }

      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter an index to access (0-5): ");
      int userIndex = scanner.nextInt();

      try {
        System.out.println("Value at index " + userIndex + " is: " + numbers[userIndex]);
      } catch (ArrayIndexOutOfBoundsException var12) {
        System.out.println("Error: Index out of bounds.");
      }
    } catch (FileNotFoundException var13) {
      System.out.println("Error: File not found.");
    } catch (NumberFormatException var14) {
      System.out.println("Error: File contains no integers.");
    } finally {
      System.out.println("Execution completed.");
    }

  }
}
