package JavaTraining.sample.oops;

public class Duke extends Pulsur
{
   private   int seat;
   private String engName;

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getEngName() {
        return engName;
    }

    public void setEngName(String engName) {
        this.engName = engName;
    }

    @Override
    public void seat() {
        System.out.println("It has only One Seat");
    }

    @Override
   public void bikeEngine() {
        System.out.println("It has Big Engine");
    }
}
