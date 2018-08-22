public class Shifter implements CharSequence {
  String string;
  int number;
  @Override
  public int length() {
    System.out.println(string.length()+ number);
    return string.length();
  }

  @Override
  public char charAt(int index) {
    return string.charAt(index+number);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return string.subSequence(start+number,end+number);
  }
  public Shifter(String string, int number){
    this.string = string;
    this.number =number;
  }
}
