package JavaTraining.assessment.first;

// Write a program to find Maximum number of an Array

public class MaximumArrayApplication
{
    public static void main(String[] args)
    {
        int[] arr = {304, 983, 6237, 958, 4506, 876};
        int arr1 = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
           if (arr[i] > arr1)
           {
               arr1 = arr[i];
           }
        }
        System.out.println("My maximum array element is: " + arr1);
    }
}
