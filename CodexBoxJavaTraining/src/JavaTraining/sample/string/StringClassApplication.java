package JavaTraining.sample.string;

// Java code to illustrate String

public class StringClassApplication
{
    public static void main(String[] args)
    {
        // Declare String without using new operator

        String str = "\"My name is L Mohammed Junaid.\" and ";

        System.out.println("String str = " + str);

        // Declare String using new operator

        String str1 = ("\"I am Working in Codex box Organisation.\" ");

        System.out.println("String str1 = " + str1);

       /*byte[] b_arr = {2,3,0,8,6};

        String s_byte = new String(b_arr);

        System.out.println(b_arr);*/

        //Find the Length by using the Length() method

        int length = str1.length();

        System.out.println("The Length of \"str1\" is: " + length );

        // Join the Above two String with the help of Concat() method

        String joinedString = str.concat(str1);

        System.out.println("We are Joining the above two String: " + joinedString);

        //we can make comparisons between two strings using the equals() method

        boolean result = str.equals(str1);

        System.out.println("String str and str1 comparing with equals() methods: " + result);
    }
}
