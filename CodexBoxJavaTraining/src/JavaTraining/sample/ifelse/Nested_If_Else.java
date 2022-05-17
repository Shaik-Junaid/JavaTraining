package JavaTraining.sample.ifelse;

public class Nested_If_Else
{
    // Create one Character
    int num = 25;
    public static void main(String[] args)
    {
        // Create object for the above Class

        Nested_If_Else nif = new Nested_If_Else();

        // First IF Statement
        if (nif.num == 25)
        {
            if (nif.num <= 30)
            {
                System.out.println("Print this Number: " + nif.num);
            }
            // Nested - if statement
            if (nif.num >= 20)
            {
                System.out.println("This Number is not Greater than 25" );
            }
            else
            {
                System.out.println("If the Condition is false then print this line");
            }

        }
    }
}
