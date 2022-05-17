package JavaTraining.sample.overloadingandoverriding;

public class Overriding extends OverLoading
{

    @Override
    public void multiplication(int num1, int num2) {
        super.multiplication(num1, num2);
    }

    @Override
    public void multiplication(int num1, int num2, float num3) {
        super.multiplication(num1, num2, num3);
    }

    @Override
    public void multiplication(float num1, float num2, double num3) {
        super.multiplication(num1, num2, num3);
    }
}
