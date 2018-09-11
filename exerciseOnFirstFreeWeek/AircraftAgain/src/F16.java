public class F16 extends Aircraft {


    public F16(int maxAmmo, int baseDamage) {
        super(8, 30, 0,"F16",0);


    }
    public F16(){
        super("F16");
        this.maxAmmo=8;
        this.baseDamage=30;
        this.ammo = 0;
        this.damage=0;
    }
}
