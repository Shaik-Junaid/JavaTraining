package JavaTraining.sample.arrays;

public class JaggedArrayApplication
{
    public static void main(String[] args)
    {
        // Declaring 2-D array with 2 rows
        int[][] arr = new int[2][];

        // Making the above the Array as Jagged

        // First row has 6 columns
        arr[0] = new int[3];

        // Second row has 4 columns
        arr[1] = new int[4];

        // Initializing array
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
          for (int j = 0; j < arr[i].length; j++)
          {
              arr[i][j] = count++;
          }
        }
        System.out.println("Contents of 2D Jagged Array");
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
