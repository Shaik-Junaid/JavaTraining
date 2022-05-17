package JavaTraining.sample.overloadingandoverriding;

public class OverLoading
{
   public  void multiplication(int num1, int num2)
   {
       System.out.println("Multiplication of two integer number is: " + ( num1 * num2));

   }

   public  void multiplication(int num1, int num2, float num3)
   {
       System.out.println("Multiplication of two integer and one float  numbers are: " + (num1 * num2 * num3) );
   }

  public  void multiplication(float num1,float num2,double num3)
   {
       System.out.println("Multiplication of three float numbers are: " + (num1 * num2 * num3) );
   }
}
