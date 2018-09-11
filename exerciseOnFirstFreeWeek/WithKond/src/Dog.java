public class Dog extends Animal {

  public static final String CLASSIFICATION = "mammal"; //static állandó, örök, final, mert nem módosítható

  String color;
  int age;
  private String name; //encapsulation
  double weight;
  public String getName(){
    return name;
  }
  public void setName(String name){
     this.name=name;
  }


  public void bark(){
    System.out.println("Wooof");
  }

  public void doYouWantToWalk(){
    System.out.println("I'm nodding!");
  }
  public Dog(String name, String color,int age){
    super(color,age,0.0);
    this.name = name; //dog specific stuff
  }
  public Dog(){ //default constructor
    super(null,0,0); //super class constructor

  }

  public void sleep(){
    System.out.println("Snoring");
  }



  @Override
  public void eat(){
    System.out.println("The dog is eating.");
  }

  @Override
  public boolean equals(Object obj) {
    Dog otherDog =(Dog) obj;
    return otherDog.getName() == this.getName();
  }
}
