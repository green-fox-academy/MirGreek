import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class RomaiSzamKonvertalo {
    public static void main(String[] args) {
        System.out.print("Kérek egy római számot");
        Scanner scanner = new Scanner(System.in);
         String romanNumber = scanner.next();

        convert(romanNumber);
    }
    public static HashMap numberDictionary() {
        HashMap<Integer,String> dictionary = new HashMap<>();
        dictionary.put(1,"I");
        dictionary.put(2,"II");
        dictionary.put(3,"III");
        dictionary.put(4,"IV");
        dictionary.put(5,"V");
        dictionary.put(6,"VI");
        dictionary.put(7,"VII");
        dictionary.put(8,"VIII");
        dictionary.put(9,"IX");
        dictionary.put(10,"X");
        dictionary.put(50,"L");
        dictionary.put(500,"D");
        dictionary.put(1000,"M");
        return dictionary;
    }

    public static void convert(String roman) {
        int temp = 0;
        HashMap<Integer,String> dictionary = numberDictionary();
        for (Entry<Integer, String> r: dictionary.entrySet()) {
            if (dictionary.containsValue(roman)) {
                if(r.getValue().equals(roman)) {
                    temp = r.getKey();
                }

            } else if (roman.contains("XX")) {
                char[] teens = roman.toCharArray();
                teenCounter(teens);
            }
        }
        System.out.println(temp);
    }
    public static void teenCounter(char[] teens){
        int count = 0;
        for (int i = 0; i < teens.length; i++) {
            
        }
    }
}
