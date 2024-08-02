public class Human {
  private int foodInStomach;
  private int maxFood;

  public Human(int maxFood) {
    this.maxFood = maxFood;
    this.foodInStomach = 0;
  }

  public void eat(int food) throws StomachTooFullException {
    if (this.foodInStomach + food > this.maxFood) {
      throw new StomachTooFullException("Cannot eat more, stomach is too full!");
    } else {
      this.foodInStomach += food;
    }
  }
}
