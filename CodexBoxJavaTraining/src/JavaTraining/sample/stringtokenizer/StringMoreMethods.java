package JavaTraining.sample.stringtokenizer;

// Java Program to Illustrate Methods of StringTokenizer class
// Via hasMoreToken(), nextToken() and countTokens()

import java.util.StringTokenizer;

public class StringMoreMethods
{
    public static void main(String[] args)
    {
        String mydelim = " : ";
        String mystr = "JAVA : String : Tokenizer : Code : Remaining : Methods ";

        StringTokenizer str = new StringTokenizer(mystr,mydelim);

       int count = str.countTokens();

        System.out.println("Number of Tokens : " + count + "\n");

        for (int i = 0; i < count; i++)
        {
            System.out.println("Tokens at [" + i + "] : " + str.nextToken());
        }
        while (str.hasMoreTokens())
        {
            System.out.println(str.nextToken());
        }
    }
}
