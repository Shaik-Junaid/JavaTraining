package JavaTraining.sample.arrays;

public class ArrayApplication
{
    // Create one Instance Variable with integer array values
    int[] myNumb = {77, 2,81, 2,10,89,19,62,10,91};

    public static void main(String[] args) {

        ArrayApplication aa = new ArrayApplication();

        String[] name = {"Array","SingleArray","DoubleArray","Constructor"};

        System.out.println("We have to call the array elements with index number and the index number is: " + aa.myNumb[2]);

        name[2] = "Polymorphism";

        System.out.println(aa.myNumb.length);

        System.out.println(name.length);

        System.out.println( "The String name is: " + name[2]);
    }
}
