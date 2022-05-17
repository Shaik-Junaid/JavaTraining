package JavaTraining.main;

import JavaTraining.sample.oops.Duke;
import JavaTraining.sample.oops.Honda;

public class MainBikes
{
    public static void main(String[] args)
    {
        Honda hn = new Honda(90000,2015);
        hn.bikeEngine();
        hn.seat();

        Duke dk = new Duke();
        dk.setEngName("Mahindra");
        dk.setSeat(2);
        System.out.println("The Engine of Duke is: " + (dk.getEngName()));
        System.out.println("The Seat Capacity is: " + (dk.getSeat()));

        dk.bikeEngine();
        dk.seat();
    }
}
