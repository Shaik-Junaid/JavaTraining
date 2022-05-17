package JavaTraining.sample.loops;

// Java Program to illustrate for_each loop

public class For_EachLoopApplications
{
    public static void main(String[] args)
    {
        String[] cars = {"BMW","VOLVO","BENZ","AUDI"};

        // print the above car names by using for_each loop
        for (String i : cars)
        {
            System.out.println(i);
        }
    }

}
