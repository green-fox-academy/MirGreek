public abstract class Animal implements FeedAble{
  private String color;
  private  int age;
   double weight;


   abstract  void sleep();

   public void eat(){
     System.out.println("Animal is eating");
   }

  public Animal(String color,int age, double weight){
    this.age=age;
    this.color=color;
    this.weight=weight;
  }
}
