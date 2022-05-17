package JavaTraining.sample.stringbuilder;

public class StringBuilderApplication
{
    public static void main(String[] args)
    {
       StringBuilder sbl = new StringBuilder();

       sbl.append("The StringBuilder in Java represents a mutable sequence of characters. ");

        System.out.println("String1 = " + sbl);

        StringBuilder sbl1 = new StringBuilder(10);

        System.out.println("String2 capacity = " + sbl1.capacity());

        StringBuilder sbl2 = new StringBuilder(sbl);

        System.out.println("String3 = " + sbl2);

        sbl.appendCodePoint(44);

        System.out.println(sbl);

        sbl.reverse();

        System.out.println(sbl);

        sbl.appendCodePoint(789);

        System.out.println(sbl);

        int ca = sbl.capacity();

        System.out.println(ca);
    }
}
