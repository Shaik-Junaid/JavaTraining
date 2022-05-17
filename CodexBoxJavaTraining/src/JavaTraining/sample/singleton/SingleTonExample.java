package JavaTraining.sample.singleton;

public class SingleTonExample
{
    private static SingleTonExample single_instance = null;

private SingleTonExample()
{
    System.out.println("Inside the SingleTonExamples ");
}
    public static  SingleTonExample getInstance()
    {
        if (single_instance == null)
            single_instance = new SingleTonExample();
        return  single_instance;
    }
}

