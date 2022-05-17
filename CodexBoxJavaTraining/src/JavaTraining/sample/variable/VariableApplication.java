package JavaTraining.sample.variable;

public class VariableApplication
{
    // Instance variable
    // My Phone Number
   long PhoneNo = 7702810210l;


     //  Static variable
    // My EmpId
    static long EmpId = 202256;

    static  String name = "L Mohammed Junaid";

    // Main Method
    public static void main(String args[])
    {
        // Local Variable
        int age = 23;

        System.out.println("My Name is : " + name);

        System.out.println(" My Age is : " + age);

        // create Object for Non-Static variable

        VariableApplication va = new VariableApplication();

        System.out.println(" My Phone Number is : " + va.PhoneNo);

        System.out.println(" My EmpId is : " + EmpId);

    }
}