//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Main {
  public Main() {
  }

  public static void main(String[] args) {
    Human human = new Human(10);

    try {
      human.eat(5);
      System.out.println("Ate 5 units of food.");
      human.eat(4);
      System.out.println("Ate 4 units of food.");
      human.eat(3);
      System.out.println("Ate 3 units of food.");
    } catch (StomachTooFullException var3) {
      StomachTooFullException e = var3;
      System.out.println("Exception: " + e.getMessage());
    }

  }
}
