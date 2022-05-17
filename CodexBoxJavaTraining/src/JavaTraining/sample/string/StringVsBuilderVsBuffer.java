package JavaTraining.sample.string;

// Java program to demonstrate difference between
// String, StringBuilder and StringBuffer

public class StringVsBuilderVsBuffer
{
    public static void concat1(String s1)
    {
       // s1 = s1 + "Builder & Buffer";

     //   System.out.println(s1);
    }
    public  static void concat2(StringBuilder s2)
    {
        s2.append("StringTokenizer ");
    }
    public static void concat3(StringBuffer s3)
    {
        s3.append("Builder Vs Buffer ");
    }

    public static void main(String[] args)
    {
        String s1 = "String ";
        concat1(s1);
        System.out.println("My First String is: " + s1);

        StringBuilder s2 = new StringBuilder("JAVA ");

        concat2(s2);

        System.out.println("My StringBuilder is: " + s2);

        StringBuffer s3 = new StringBuffer("java string ");

        concat3(s3);

        System.out.println("My StringBuffer is: " + s3);

    }
}

