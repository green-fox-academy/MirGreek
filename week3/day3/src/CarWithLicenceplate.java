public class CarWithLicenceplate {
    private double fuelLevel=0;
    private int carCount = 0;
    private String licencePlate = "aaa-000";

    public CarWithLicenceplate (int carCount, double fuelLevel){
      if (carCount ==1) {
        licencePlate = "aaa-000";
      } else  if (carCount ==2){
        licencePlate = "aaa-001";
      }
      carCount++;

    }
    public String getLicencePlate(){
      licencePlate = "aaa-000";
      return licencePlate;
    }
  }


