package JavaTraining.sample.ifelse;

public class SwitchApplication {
    static int date = 3;
    public static void main(String[] args) {
        switch (date)
        {
            case 1:
                System.out.println("Its not my BD");
                break;
            case 2:
                System.out.println("This also not my BD");
                break;
            case 3:
                System.out.println("This is suhail BD");
                 break;
            case 4:
                System.out.println("This is Rehana BD ");
                break;
            case 5:
                System.out.println("This is Junaid BD");
                break;
            default:
                System.out.println("Looking forward to the next BD");
        }
    }
}
