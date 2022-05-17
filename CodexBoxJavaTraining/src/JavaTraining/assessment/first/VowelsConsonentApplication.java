package JavaTraining.assessment.first;

import java.util.Scanner;

public class VowelsConsonentApplication
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter any Character: ");

        String str = obj.next();

        switch (str)
        {
            case "a":
                System.out.println("Here \"a\" is a Vowel");
                break;
            case "e":
                System.out.println("Here \"e\" is a Vowel");
                break;
            case "i":
                System.out.println("Here \"i\" is a Vowel");
                break;
            case "o":
                System.out.println("Here \"o\" is a Vowel");
                break;
                case "u":
            System.out.println("Here \"u\" is a Vowel");
            break;
            default:
                System.out.println("It is not a Vowel....It is a Consonant");
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");


        }
        if ((str.equalsIgnoreCase("a")) || (str.equals("e")) || (str.equals("o")) || (str.equals("i")) || (str.equals("u")) )
        {
            System.out.println("It is a Vowel....");
        }
        else
        {
            System.out.println("It is not a Vowel....It is a Consonent");
        }
    }
}
