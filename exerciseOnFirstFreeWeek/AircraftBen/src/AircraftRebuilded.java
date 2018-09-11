public class AircraftRebuilded {
  int maxAmmo;
  int baseDamage;
  int ammoStore;
  private String type;

  public AircraftRebuilded(int maxAmmo, int baseDamage, String type) {
    this.maxAmmo = maxAmmo;
    this.baseDamage = baseDamage;
    this.ammoStore = 0;
    this.type = type;
  }

  public int fight() {
    int damage = baseDamage * ammoStore;
    ammoStore = 0;
    return damage;
  }

  public int getAllDamage() {                             // This method needed for - It should give back a string about it's and all of its aircrafts status like:
    int damage = baseDamage * ammoStore;                  //a string about it's and all of its aircrafts status like: - to check the total damage
    return damage;
  }

  public int refill(int numberOfAmmo) {
    if (numberOfAmmo > maxAmmo - ammoStore) {
      int lackOfAmmo = maxAmmo - ammoStore;
      ammoStore = maxAmmo;
      return numberOfAmmo - lackOfAmmo;
    } else {
      ammoStore += numberOfAmmo;
      return 0;
    }

  }

  public String getType() {
    return type;
  }

  public String getStatus() {
    return ("Type " + type + ", Ammo: " + ammoStore + ", Base Damage: " + baseDamage + ", All Damage: " + ammoStore * baseDamage);
  }

  public boolean isPriority() {
    return (getType() == "F35");
  }
}

