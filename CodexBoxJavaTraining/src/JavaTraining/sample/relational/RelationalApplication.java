package JavaTraining.sample.relational;

/* Write the Integer value and Compare these
values with the help of Relational Operator */

public class RelationalApplication {

    public static void main(String[] args) {

        int num1 = 30,num2 = 40,num3 = 30;

        // Print all the three Numbers

        System.out.println("All the Number before comparing with Relational Operator");

        System.out.println("The First number is: " + num1);
        System.out.println("The Second number is: " + num2);
        System.out.println("The Third number is: " + num3);

        System.out.println("All the Number After comparing with Relational Operator");

        // Check whether the num1 & num2 are True or False

        System.out.println("Is num1 & num2 are True or False? " + (num1 == num2));

        // Check whether the num2 & num3 are True or False

        System.out.println("Is num2 & num3 are True or False? " + (num2 == num3));

        // Check whether the num1 & num3 are True or False

        System.out.println("Is num1 & num3 are True or False? " + (num1 == num3));

        // Check whether the num1 & num3 are True or False

        System.out.println("Is num1 & num3 are True or False? " + (num1 != num3));

        // Check whether the num1 & num3 are True or False

        System.out.println("Is num1 & num3 are True or False? " + (num1 <= num3));

        // Check whether the num1 & num3 are True or False

        System.out.println("Is num1 & num3 are True or False? " + (num1 >= num3));

        // Check whether the num1 & num3 are True or False

        System.out.println("Is num1 & num3 are True or False? " + (num1 > num3));

        // Check whether the num1 & num3 are True or False

        System.out.println("Is num1 & num3 are True or False? " + (num1 < num3));

    }
}
