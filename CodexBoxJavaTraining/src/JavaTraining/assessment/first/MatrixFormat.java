package JavaTraining.assessment.first;

//Take two-dimensional integer array and two values to it
// and print them in matrix format(size m*n)

public class MatrixFormat
{
    public static void main(String[] args)
    {
      short[][] arrMatrix =new short[4][4];

      short num1 = 54;

      for (int i = 0; i < arrMatrix.length; i++)
      {
          for (int j = 0; j < arrMatrix.length; j++)
          {
              System.out.print(" " + num1++);
          }
          System.out.println();
      }
    }
}
