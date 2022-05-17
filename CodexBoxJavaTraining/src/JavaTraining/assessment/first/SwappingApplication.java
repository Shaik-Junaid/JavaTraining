package JavaTraining.assessment.first;
/*Write a program and use all data types and assign some default values
* and print before change and after change.
*/
public class SwappingApplication
{
    public static void main(String[] args)
    {

        // Take any two integer numbers and swap them

        int firstNum = 499, secondNum = 576, temp;

        // Print the above two numbers before swapping

        System.out.println("My First int value is: " + firstNum);
        System.out.println("My Second int value is: " + secondNum);

        System.out.println("Before Swapping the Two Integer Numbers");


        // Print the First Number

        System.out.println("First Number is: " + firstNum);

        // Print the Second Number

        System.out.println("Second Number is: " + secondNum);

        // Logic to swap the two numbers using assignment operator

        temp = secondNum;

        secondNum = firstNum;

        firstNum = temp;


        // Print the above two numbers after swapping

        System.out.println("After Swapping the Two Integer Numbers");

        System.out.println("First Number is: " + firstNum);

        System.out.println("Second Number is: " + secondNum);

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        //Using char Data type to swap to character

        char ch1 = 'M', ch2 = 'J', temp1;

        System.out.println("My first char value is: " + ch1);
        System.out.println("My Second char value is: " + ch2);

        System.out.println("Before Swapping the Two Characters");

        // Print the First Character

        System.out.println("First Character is: " + ch1);

        // Print the Second Character

        System.out.println("First Character is: " + ch2);

        // Logic to swap the two characters

        temp1 = ch2;

        ch2 = ch1;

        ch1 = temp1;

        System.out.println("After Swapping the Two Characters");

        System.out.println("First Character is: " + ch1);

        System.out.println("Second Character is: " + ch2);

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        //Using short Data type to swap two numbers

        short sht1 = 32, sht2 = 78, temp3;

        System.out.println("My First short value is:" + sht1);

        System.out.println("My Second short value is:" + sht2);

        // Print the above two numbers before swapping

        System.out.println("Before Swapping the Two Short Numbers");


        // Print the First short

        System.out.println("First Number is: " + sht1);

        // Print the second short
        System.out.println("Second Number is: " + sht2);

        temp3 = sht2;

        sht2 = sht1;

        sht1 = temp3;

        System.out.println("After Swapping the Two Short Numbers");

        System.out.println("First Number is: " + sht1);

        System.out.println("Second Number is: " + sht2);

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        //Using long Data type to swap two numbers

        long num1 = 7702810210l, num2 = 8919621091l, temp4;

        System.out.println("My first long value is: " + num1);

        System.out.println("My second long value is: " +num2);

        System.out.println("Before Swapping the Two Long Numbers");

        // Print the First-Long Num

        System.out.println("First Number is: " + num1);

        // Print the Second-Long Num

        System.out.println("Second Number is: " + num2);

        temp4 = num2;

        num2 = num1;

        num1 = temp4;

        System.out.println("After Swapping the Two Long Numbers");

        System.out.println("First Number is: " + num1);

        System.out.println("Second Number is: " + num2);

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        //Using Float Data type to swap two numbers

        float f1 = 2.8f, f2 = 8.2f, temp5;

        System.out.println("My first float value is: " + f1);

        System.out.println("My second float value is: " + f2);

        System.out.println("Before Swapping the Two Float Numbers");

        // Print the First Num

        System.out.println("First Number is: " + f1);

        // Print the Second Num

        System.out.println("Second Number is: " + f2);

        temp5 = f2;

        f2 = f1;

        f1 = temp5;

        System.out.println("After Swapping the Two Float Numbers");

        System.out.println("First Number is: " + f1);

        System.out.println("Second Number is: " + f2);

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        //Using Boolean Data type to swap two numbers

        boolean bl1 = true, bl2 = false, temp6;

        System.out.println("My first Boolean value is: " + bl1);

        System.out.println("My second Boolean value is: " + bl2);

        System.out.println("Before Swapping the Two Boolean Values");

        // Print the First Num

        System.out.println("First value is: " + bl1);

        // Print the Second Num

        System.out.println("Second Value is: " + bl2);

        temp6 = bl2;

        bl2 = bl1;

        bl1 = temp6;

        System.out.println("After Swapping the Two Boolean Values");

        System.out.println("First Value is: " + bl1);

        System.out.println("Second Value is: " + bl2);

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        //Using Byte Data type to swap two numbers

        byte by1 = 2, by2 = 89, temp7;

        System.out.println("My first Byte value is: " + by1);

        System.out.println("My second Byte value is: " + by1);

        System.out.println("Before Swapping the Two byte Numbers");


        // Print the First Byte

        System.out.println("First Number is: " + by1);

        // Print the second Byte
        System.out.println("Second Number is: " + by2);

        temp7 = by2;

        by2 = by1;

        by1 = temp7;

        System.out.println("After Swapping the Two Byte Numbers");

        System.out.println("First Number is: " + by1);

        System.out.println("Second Number is: " + by2);

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        //Using Double Data type to swap two numbers

        double db1 = 6285.98, db2 = 9876.90, temp8;

        System.out.println("My first Double value is: " + db1);

        System.out.println("My second Double is: " + db2);

        System.out.println("Before Swapping the Two Double Numbers");


        // Print the First Byte

        System.out.println("First Number is: " + db1);

        // Print the second Byte
        System.out.println("Second Number is: " + db2);

        temp8 = db2;

        db2 = db1;

        db1 = temp8;

        System.out.println("After Swapping the Two Double Numbers");

        System.out.println("First Number is: " + db1);

        System.out.println("Second Number is: " + db2);

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }
    }
