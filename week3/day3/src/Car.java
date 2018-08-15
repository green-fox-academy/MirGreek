public class Car {
  private double fuelLevel=0;
  private String licencePlate = "aaa-000";

  public Car (int index, double fuelLevel){
    if (index ==1) {
      licencePlate = "aaa-000";
    } else  if (index ==2){
      licencePlate = "aaa-001";
    }
    this.fuelLevel = fuelLevel;

  }
  public String getLicencePlate(){
    licencePlate = "aaa-000";
    return licencePlate;
  }
}
