import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");



        String[] arItems = scanner.nextLine().split(" ");
        char[] chars = arItems[0].toCharArray();
        int[] arr = new int[input];
        for (int i = 0; i < input; i++) {
            arr[i] = Character.digit(chars[i], input);

            gradingStudents(arr);
        }


    }

    static int[] gradingStudents(int[] grades) {
        for (int i = 0; i <grades.length ; i++) {
            if (grades[i]> 38 && grades[i]/5 ==1) {

            }
        }


        return grades;

    }
}
/*
If the difference between the grade  and the next multiple of  is less than , round  up to the next multiple of .
If the value of  is less than , no rounding occurs as the result will still be a failing grade.
 */