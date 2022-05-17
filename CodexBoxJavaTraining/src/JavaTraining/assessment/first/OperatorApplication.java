package JavaTraining.assessment.first;

//Calculate Simple Java Statement using Arithmetic Operator

import java.util.Scanner;

public class OperatorApplication
{
    public static void main(String[] args)
    {
       /* int num1 = 67, num2 = 73,num3;

       int  result1 =  num1 + num2;

        int result2  = num2 - num1;

        int result3 = num1 * num2;

        int result4 = num1 / num2;

        System.out.println("Addition of two Number is; " + result1);

        System.out.println("=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-");

        System.out.println("Subtraction of two Number is; " + result2);

        System.out.println("=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-");

        System.out.println("Multiplication of two Number is; " + result3);

        System.out.println("=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-");

        System.out.println("Division of two Number is; " + result4);*/

        Scanner obj = new Scanner(System.in);

        String operator;

        int num1,num2;

        System.out.print("Enter the any Operator in between these operators... + , - , * , /: ");

        operator = obj.nextLine();

        System.out.println("My Operator is: " + operator);

        System.out.println("Enter First Number: ");

        num1 = obj.nextInt();

        System.out.println("Enter Second Number: ");

        num2 = obj.nextInt();

        switch (operator)
        {
            case "+":
              int result = num1 + num2 ;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case "_":
                int result1 = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result1);
                break;
            case "*":
                int result3 = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result3);
                break;
            case "/":
                int result4 = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result4);
                break;
            default:
                System.out.println("Please Enter any Operator");

        }
    }
}
