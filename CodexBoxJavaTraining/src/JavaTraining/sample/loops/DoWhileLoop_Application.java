package JavaTraining.sample.loops;

// Java Program to illustrate DoWhileLoop

public class DoWhileLoop_Application
{
    // Created a static variable
    static  int num2 = 1999;

    public static void main(String[] args)
    {
        // Using do_while Loop
        do
        {
            System.out.println("Value of num2: " + num2);
            num2++;
        }
        while(num2 != 2022);
    }
}
