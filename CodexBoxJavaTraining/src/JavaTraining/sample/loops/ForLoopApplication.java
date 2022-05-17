package JavaTraining.sample.loops;

// Java program to illustrate for loop.

public class ForLoopApplication
{
    public static void main(String[] args)
    {
        // write for loop by using character

        /* for(char ch = 'A'; ch <= 'J'; ch++)
        {
            System.out.println("Value of ch: " + ch);
        }*/

        // Enhanced For Loop
        char ch[] = {'A','B','C','D','E','F','G'};
        for(char x:ch)
        {
            System.out.println(x);
        }
    }
}
