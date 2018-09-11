public class Aircraft {
    int maxAmmo;
    int baseDamage;
    int ammo;
    String type;
    int damage;



    public int fight() {
        damage = ammo * baseDamage;
        setAmmoToZero();
        return damage;

    }

    public int getCurrentDamage() {
        return this.damage;
    }


    public void setAmmoToZero() {
        ammo = 0;
    }

    public int refill(int number) {
        int remain = 0;
        if (number < maxAmmo) {
            ammo = number;
            remain = 0;
        } else {
            remain = number - maxAmmo;
            ammo = maxAmmo;
        }
        System.out.println("Ammo has been filled with " + ammo + " ammo, and the remain is: " + remain);
        return ammo;
    }

    public int getCurrentAmmo() {
        return ammo;
    }

    public String getType() {
        return type;
    }

    public String getStatus() {
        return "Type " + getType() + ", Ammo: " + getCurrentAmmo() + ", Base damage: " + baseDamage + ", All damage:" + getCurrentDamage();
    }
    public Aircraft(int maxAmmo, int baseDamage, int ammo, String type,int damage){
            this.baseDamage = baseDamage;
            this.maxAmmo = maxAmmo;
            this.ammo = ammo;
            this.type = type;
            this.damage=damage;
        }
    public Aircraft(String type) {
            this.type = type;
        }

        public boolean isPriority(){
            if(type.equals("F35")){
                return true;
            } else return false;
        }
    }

