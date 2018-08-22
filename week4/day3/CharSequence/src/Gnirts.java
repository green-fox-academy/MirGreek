public class Gnirts implements CharSequence {
  String string;

  @Override
  public int length() {
    System.out.println(string.length());
    return string.length();
  }

  @Override
  public char charAt(int index) {
    String reverse= "";
    for (int i = string.length()-1; i>= 0 ; i--) {
      reverse += string.charAt(i);

    }
    System.out.println(reverse.charAt(index));
    return reverse.charAt(index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    String reverse= "";
    for (int i = string.length()-1; i>= 0 ; i--) {
      reverse += string.charAt(i);
    }
    System.out.println(reverse.subSequence(start,end));
    return reverse.subSequence(start,end);
  }



  public Gnirts(String string){
    this.string = string;
  }
}
