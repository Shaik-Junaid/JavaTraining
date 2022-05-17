package JavaTraining.sample.oops;

public class Honda extends Pulsur
{
   private int price;
   private int model;

   public Honda(int price,int model)
   {
       System.out.println("The Honda Shine Bike Price is: " + price);
       System.out.println("The Model of Honda Shine Bike is: " + model);
   }
    @Override
    public void seat() {
        System.out.println("Two Seater bike");
    }

    @Override
    public void bikeEngine() {
        System.out.println("It has a power full Engine");
    }
}
