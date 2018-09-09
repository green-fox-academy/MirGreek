public class Main {
    public static void main(String[] args) {

        F16 gepF16 = new F16();

        F35 gepF35 = new F35();


        F16 repcsiF16 = new F16();

        F35 repcsiF35 = new F35();


        repcsiF16.refill(2);
        repcsiF35.refill(300);

        System.out.println(repcsiF16.getStatus());
        System.out.println(repcsiF35.getStatus());

        repcsiF16.fight();
        repcsiF35.fight();
        System.out.println(repcsiF16.getStatus());
        System.out.println(repcsiF35.getStatus());


        Carrier carrier = new Carrier(500,100);
        carrier.add(repcsiF16);
        carrier.add(repcsiF16);
        carrier.add(gepF16);
        carrier.add(gepF16);

        carrier.fill();

        Carrier otherCarrier = new Carrier(600,100);
        otherCarrier.add(new F16());
        otherCarrier.add(new F35());
        otherCarrier.add(new F16());
        otherCarrier.add(new F35());

        otherCarrier.fill();

        carrier.fight(otherCarrier);

        carrier.getStatus();
        otherCarrier.getStatus();

    }
}
