package JavaTraining.sample.logical;

// Assign the Integer Number and apply logical Operator

public class LogicalApplication
{

    public static void main(String[] args)
    {


        // Declare Variables and assign the values to the variables

        int num1 = 45, num2 = 67, num3 = 45;

        // Print the Values before applying Logical Operator

        System.out.println("NumberOne is: " + num1);

        System.out.println("NumberTwo is: " + num2);

        System.out.println("NumberThree is: " + num3);

        //using logical AND to verify two constraints

        if ((num1 == num3) && (num2 < num3))
        {
            int result = num1 + num2 + num3;
            System.out.println("The Addition of three numbers are: " + result);
        }
        else
        {
            System.out.println("Condition is not Matched");
        }


    }


}
