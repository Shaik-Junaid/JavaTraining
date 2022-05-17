package JavaTraining.sample.loops;

// Java program to illustrate while loop

public class WhileLoopApplication
{
    // Create one Instance variables which is returning some values
    static  int myMethod(int j)
    {
        return 10 + j;
    }
    public static void main(String[] args)
    {
        // Pass the values of x below
        System.out.println(myMethod(76));

        float num1 = 2.5f;

        //Exit when the num1 becomes greater than 8.5...,

        while (num1 <= 8.5)
        {
            if (num1 == 4.5 || num1 == 6.5)
            {
                num1++;
                // Here the num1 value (6.5) will skip and continue the remaining iterations
                continue;
            }
            System.out.println("Value of num1= " + num1);

            // Increment the value of num1 for next Iteration
            num1++;
        }
    }
}
