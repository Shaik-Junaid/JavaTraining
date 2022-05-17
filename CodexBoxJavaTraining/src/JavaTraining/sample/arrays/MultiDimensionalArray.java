package JavaTraining.sample.arrays;

//MultiDimensional Array in Java

public class MultiDimensionalArray
{
    public static void main(String[] args)
    {
        // Create a String Array

        String[][] arr = new String[5][5];

        arr[0][0] = "Codexbox";

        arr[0][1] = "MultiDimensional";

        arr[0][2] = "SinleDimensional";

        arr[0][3] = "Arrays";

        arr[0][4] = "Java";

        arr[0][5] = "";

        arr[0][6] = "";

        arr[6][0] = "Datatype";

        System.out.println("arr[0][1] " + arr[0][0]);

        System.out.println("arr[0][2] " + arr[6][0]);
    }
}
