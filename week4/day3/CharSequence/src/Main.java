public class Main {
  public static void main(String[] args) {

    Gnirts g = new Gnirts("example");
    g.length();
    g.charAt(1);
    g.subSequence(1, 4);

    Shifter s = new Shifter("example", 2);
    s.length();
    s.charAt(0);
    System.out.println(s.charAt(0));
    System.out.println(s.subSequence(1, 3));
  }
}
