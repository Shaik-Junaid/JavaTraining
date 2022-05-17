package JavaTraining.sample.sourcevariable;

public class SourceVariablesApplication
{

    public static void main(String[] args)
    {
       // Create a Boolean data Type
        boolean b = true;

        if (b == true)
        {
            System.out.println(" Hii Junaid ");
        }
      //  Create a char data Type
        char ch = 'J';

        System.out.println("My Name Starting letter start is : " + ch);

        // Create a Byte Data type
        // Byte datatype can store only in between -128 to 127 values
        byte j = 56;

        System.out.println("This number is between the Byte range of -128 to 127: " + j);

        // Create Short dat type
        // short range is -32768 to 32767 and its size is only 2 byte
        short sh = 12;

        System.out.println("The Short value is: " + sh);

        // Create int datatype
        //int range is -2,147,483,648 to 2,147,483,684

        int RollNo = 56;

        System.out.println("My RollNo is: " + RollNo);

        // Create Long Data Type
        // Long Size is 64-bits
        
        long PhoneNo = 8919621091l;

        System.out.println("My Phone Number is: " + PhoneNo);
        
        // create Float Data Type
        //Float Size is 32-bits
        
        float gdpa = 7.5f;
        
        System.out.println("My GDPA is: " + gdpa);
        
        // Create Double Data Type
        // Double Size is 64b-its

        double salary = 125000.9089;

        System.out.println("My Salary is: " + salary);


    }

}
