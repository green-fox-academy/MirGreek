public class Counter {
   int value;

   public void add(int number) {
     this.value += number;
   }

   public  void add() {
     this.value++;
   }

   public int getValue() {
     return this.value;
   }

   public void reset() {
     this.value = 0;
   }

  public Counter() {
    this.value = 0;
  }

  public Counter(int value) {
    this.value = value;
  }

}
