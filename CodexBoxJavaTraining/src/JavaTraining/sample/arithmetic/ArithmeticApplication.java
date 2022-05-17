package JavaTraining.sample.arithmetic;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;

public class ArithmeticApplication {
    // Arithmetic Operators

     int FirstNum = 3, SecondNum = 6, ThirdNum = 9, FourthNum = 7;

    // Add the above three numbers

     int result1 = FirstNum + SecondNum + ThirdNum + FourthNum;

     int result2 = FirstNum - SecondNum - ThirdNum - FourthNum;

     int result3 = FirstNum * SecondNum * ThirdNum * FourthNum;

    int result4 = FirstNum % SecondNum % ThirdNum % FourthNum;

    int result5 = FirstNum - SecondNum + ThirdNum * FirstNum % FirstNum;

    public static void main(String[] args) {

        ArithmeticApplication aa = new ArithmeticApplication();

        // Print the Addition result of the four numbers

        System.out.println("Addition of four Numbers is: " + aa.result1);

        // Print the subtraction result of the four numbers

        System.out.println("Subtraction of four Numbers is: " + aa.result2);

        // Print the Multiplication result of the four numbers

        System.out.println("Multiplication of four Numbers is: " + aa.result3);

        // Print the Modulus result of the four numbers

        System.out.println("Modulus of four Numbers is: " + aa.result4);

        // Print the result of all the Arithmetic Operators

        System.out.println("Arithmetic Operators of all is: " + aa.result5);
    }
}
