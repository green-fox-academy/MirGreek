import com.sun.org.apache.xpath.internal.operations.Number;

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
        int toReturn = 0;
        int temp = 0;
        HashMap<Integer,String> dictionary = numberDictionary();
        String remainders = remainderCounter(roman);
        for (Entry<Integer, String> r: dictionary.entrySet()) {
            if (dictionary.containsValue(roman)) {
                if (r.getValue().equals(roman)) {
                    temp = r.getKey();
                }
            } else if (dictionary.containsValue(remainders)) {
                if (r.getValue().equals(remainders)) {
                    temp = r.getKey();
                }
            }
        }
        if (roman.contains("XX")) {
            int teens = teenCounter(roman);
            if (temp == 0) {
                toReturn = teens;
            } else {
                toReturn = teens + temp;
            }
        }
        System.out.println(toReturn);
    }
    public static int teenCounter(String roman){
        char[] teens = roman.toCharArray();
        int count = 0;
        StringBuilder remainder = new StringBuilder();
        for (int i = 0; i < teens.length; i++) {
            if (teens[i]=='X') {
                count++;
            } else {
                remainder.append(teens[i]);
            }
        }

        return count*10;
    }

    public static String remainderCounter(String roman){

        char[] teens = roman.toCharArray();
        int count = 0;
        StringBuilder remainder = new StringBuilder();
        for (int i = 0; i < teens.length; i++) {
            if (teens[i]=='X') {
                count++;
            } else {
                remainder.append(teens[i]);
            }
        }

        return  remainder.toString();
    }
}
