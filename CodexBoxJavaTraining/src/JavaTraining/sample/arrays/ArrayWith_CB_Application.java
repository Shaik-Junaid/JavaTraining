package JavaTraining.sample.arrays;

public class ArrayWith_CB_Application
{
    public static void main(String[] args)
    {
        // Initialize the Array Elements
        int[] arr = {290,35,654,789,235,345,235,980,234};

        for (int i = 0; i < arr.length; i++)
        {
           if (arr[i] == 35)
            {
                continue;
            }
            if (arr[i] == 345)
            {
                break;
            }
            System.out.println("Element at index " + i + " : " + arr[i]);
        }
    }

}
