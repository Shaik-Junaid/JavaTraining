package JavaTraining.assessment.two;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PostOfficeApplication
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        System.out.println("Welcome to PostOffice ");
        System.out.println("The Services which we provide are: \"Account opening\", \"Sending courier\", \"Sending Letters\", \"Sending Money\", \"Send Luggage\":");
        System.out.println("How can we Help you Sir/Madam? ");
        System.out.print("Which services you want from our side: ");
        int a = scanner.nextInt();
        System.out.println("You have selected " + a + " service");
        System.out.println("Thank you for selecting " + a + " service");
        System.out.println("Please fill all the requirement ");
        AccountOpening accountOpening = new AccountOpening();
        switch (a) {
            case 1:
                accountOpening.accountDetails();
                break;
            case 2:
                accountOpening.sendingLetters();
                break;
            case 3:
                accountOpening.sendingCourier();
                break;
            case 4:
                accountOpening.SendingMoney();
            case 5:
                accountOpening.SendLuggage();
                break;
            default:
                System.out.println("You haven't chose any services.");
                System.out.println("Please choose any services. ");
                break;
        }
        System.out.println("Thank You");
        System.out.println("Visit Again");
    }
}
