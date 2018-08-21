public class Dogs {
  String name;

  public  Dogs (String name){ //constructor
    this.name =name;
  }

  public void setName(String newNameOfDoggie){
    this.name =newNameOfDoggie;
  }
    public String getName(){ //protected is available only from subclasses, not available in two diff. packages
    return name;
  }
  public String woof (){
    return "woof";
  }
}
//