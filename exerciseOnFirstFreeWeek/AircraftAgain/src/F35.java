public class F35 extends Aircraft {

    public F35(int maxAmmo, int baseDamage) {
        super(12, 50, 0,"F35",0);

    }
    public F35(){
        super("F35");
        this.maxAmmo=12;
        this.baseDamage=50;
        this.ammo = 0;
        this.damage=0;
    }
}
