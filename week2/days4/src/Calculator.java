import java.util.Scanner;

import java.util.ArrayList;

public class Calculator {
  public static void main(String... args) {
    ArrayList<Object> operations = new ArrayList<>();

    System.out.println("Say the operation, then the numbers to the calculator!");

    Scanner input = new Scanner(System.in);
    String op = input.next();
    double number1 = input.nextDouble();
    double number2 = input.nextDouble();
    int output = 0;
    operations.add(op);
    operations.add(number1);
    operations.add(number2);
    operations.add("+");
    operations.add("-");
    operations.add("*");
    operations.add("/");


    System.out.println( "Ezeket adtad meg: " + op + " és " + operations.get(1) + " és " + operations.get(2));

    calculate(operations,op,number1,number2,output);

    //System.out.println(output);
  }
  static void calculate(Object operations, String op, double number1, double number2, double output){

      if (op.equalsIgnoreCase("+")){
          output = number1 + number2;
      } else if (op.equalsIgnoreCase("-")) {
        output = number1 - number2;
      } else if (op.equalsIgnoreCase("*")) {
        output = number1 * number2;
      } else if (op.equalsIgnoreCase("/")) {
        output = number1 / number2;
    }
    System.out.println(output);
  }
  }

  // Create a simple calculator application which reads the parameters from the prompt
  // and prints the result to the prompt.
  // It should support the following operations,
  // create a method named "calculate()":
  // +, -, *, /, % and it should support two operands.
  // The format of the expressions must be: {operation} {operand} {operand}.
  // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

  // You can use the Scanner class
  // It should work like this:

  // Start the program
  // It prints: "Please type in the expression:"
  // Waits for the user input
  // Print the result to the prompt
  // Exit
