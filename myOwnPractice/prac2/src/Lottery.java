import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Lottery {
    public static void main(String[] args) {
        System.out.println(getMostCommonNumber());
    }
    public static List<String> getMostCommonNumber() {
        Path lotteryNumbers = Paths.get("Lottery.csv");
        List<String> lines = new ArrayList<>();
        try {
             lines = Files.readAllLines(lotteryNumbers);
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String> splitted = new ArrayList<>();

        for (int i = 0; i <lines.size() ; i++) {
            for (int j = 11; j <16 ; j++) {
                splitted.add(Arrays.asList(lines.get(i).split(";")).get(j));
            }
        }

        HashMap<String,Integer> numberMap = new HashMap<>();
        for (int i = 0; i <splitted.size() ; i++) {
            if (!numberMap.containsKey(splitted.get(i))) {
                numberMap.put(splitted.get(i),1);
            } else numberMap.put(splitted.get(i),numberMap.get(splitted.get(i))+1);
        }

        List<Integer> numberDB = new ArrayList<>(numberMap.values());
        List<String> maxFive = new ArrayList<>();
        Collections.sort(numberDB);
        List<Integer> theFiveBiggest = new ArrayList<>();

        for (int i = numberDB.size()-5; i <numberDB.size() ; i++) {
            theFiveBiggest.add(numberDB.get(i));
        }


        for (Map.Entry<String, Integer> db : numberMap.entrySet()) {
            for (Integer biggest: theFiveBiggest) {
                if (db.getValue() == biggest) {
                    maxFive.add(db.getKey());
                }
            }
        }

        return maxFive;
    }
}
