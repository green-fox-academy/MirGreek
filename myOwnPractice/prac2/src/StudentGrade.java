import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) throws IOException {

        //getFiveMultiplicators();

        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine().trim());

        int[] grades = new int[input];

        for (int gradesItr = 0; gradesItr < input; gradesItr++) {
            int gradesItem = Integer.parseInt(scanner.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }

        int[] result = gradingStudents(grades);

        gradingStudents(result);

    }

    static int[] gradingStudents(int[] grades) {
        int[] listToReturn = new int[grades.length];
        List<Integer> fiveMultiplicators = getFiveMultiplicators();

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > 38 || grades[i] % 5 == 0 || grades[i] % 5 >= 2) {
                listToReturn[i] = grades[i];
                System.out.println(listToReturn[i]);
            } else if (grades[i] % 5 > 3) {
                int newGrade = Math.round((grades[i] + 5));
                listToReturn[i]=newGrade;
                System.out.println(listToReturn[i]);
            }

        }
            return listToReturn;

        }
        public static List<Integer> getFiveMultiplicators () {
            List<Integer> multiplicators = new ArrayList<>();

            for (int i = 1; i <= 20; i++) {
                multiplicators.add(i * 5);
            }
            return multiplicators;
        }
    }
/*
If the difference between the grade  and the next multiple of  is less than , round  up to the next multiple of .
If the value of  is less than , no rounding occurs as the result will still be a failing grade.
 */