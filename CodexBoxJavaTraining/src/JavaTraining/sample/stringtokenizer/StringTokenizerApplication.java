package JavaTraining.sample.stringtokenizer;

// Java Program to Illustrate StringTokenizer Class

// Importing required classes

import java.util.StringTokenizer;

public class StringTokenizerApplication
{
    public static void main(String[] args)
    {
        System.out.println("Please Wish to Divya");

        System.out.println("=======================================");

        StringTokenizer st1 = new StringTokenizer("HAPPY BIRTHDAY DIVYA", " ");

        System.out.println("=======================================");

        while (st1.hasMoreTokens())

            System.out.println(st1.nextToken());

        System.out.println("=======================================");

        System.out.println("Make this day special for Divya");

        System.out.println("=======================================");

        StringTokenizer st2 = new StringTokenizer("MAY:ALMIGHTY:BLESS:YOU:A:GOOD:LIFE:AND:ACCEPTS:ALL:YOUR:WISHES", " :");

//        System.out.println("=======================================");

        while (st2.hasMoreElements())

        System.out.println(st2.nextToken());

    }
}
