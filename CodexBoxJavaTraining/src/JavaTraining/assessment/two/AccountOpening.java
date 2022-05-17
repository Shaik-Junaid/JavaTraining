package JavaTraining.assessment.two;

import java.util.Scanner;

public class AccountOpening
{
    Scanner scanner = new Scanner(System.in);
    public  void accountDetails()
    {

        System.out.print("Enter your Full name: ");
        String accountHolderName = scanner.nextLine();
        System.out.print("Enter your Phone Number: ");
        long phoneNumber = scanner.nextLong();
        System.out.print("Enter your address: ");
        String address = scanner.next();
        System.out.print("Enter your Mail-Id: ");
        String mailId = scanner.next();

        System.out.println("Your full name is: " + accountHolderName);
        System.out.println("Your Mobile Number is: " + phoneNumber);
        System.out.println("Your address is: " + address);
        System.out.println("Your Mail_ID is: " + mailId);
        System.out.println("Congratulation your account has Created");
    }

    public  void sendingCourier()
    {
        System.out.print("Enter from address: ");
        String fromAddress = scanner.nextLine();
        System.out.print("Enter To address: ");
        String toAddress = scanner.nextLine();
        System.out.println("Your From Address: " + fromAddress);
        System.out.println("Your To Address: " + toAddress);
        System.out.print("Enter your distance: ");
        short distance = scanner.nextShort();
        if (distance >= 0 && distance <= 50) {
            System.out.println("The amount is 250 Rupees.");
        }
            if (distance > 51 && distance < 100)
            {
                System.out.println("The amount is 500 Rupees.");
            }
            else
            {
                System.out.println("The Amount is 1000 Rupees.");
            }
        System.out.println("If you are satisfied with our process enter \"Okay\" ");
            String confirmationMessage = scanner.next();
            if (confirmationMessage.equalsIgnoreCase("Okay"))
            {
                System.out.println("Your Courier is placed to your destination very soon...");
            }
            else {
                System.out.println("Your Process is cancel");
            }
        }
    public void sendingLetters()
    {
        System.out.print("Enter from address: ");
        String fromAddress1 = scanner.nextLine();
        System.out.print("Enter To address: ");
        String toAddress2 = scanner.nextLine();
        System.out.println("Your From Address: " + fromAddress1);
        System.out.println("Your To Address: " + toAddress2);
        System.out.print("Enter your distance: ");
        short distance1 = scanner.nextShort();
        if (distance1 >= 0 && distance1 <= 100) {
            System.out.println("The amount is 150 Rupees.");
        }
            if (distance1 >= 101 && distance1 <= 200)
            {
                System.out.println("The amount is 250 Rupees.");
            }
            else
            {
                System.out.println("The Amount is 500 Rupees.");
            }
        System.out.println("If you are satisfied with our process enter \"Okay\" ");
        String confirmationMessage = scanner.next();
        if (confirmationMessage.equalsIgnoreCase("Okay"))
        {
            System.out.println("Your Letters are placed to your destination very soon...");
        }
        else {
            System.out.println("Your Process is cancel");
        }
    }
    public void SendingMoney()
    {
        System.out.print("Enter from address: ");
        String fromAddress1 = scanner.nextLine();
        System.out.print("Enter To address: ");
        String toAddress2 = scanner.nextLine();
        System.out.println("Your From Address: " + fromAddress1);
        System.out.println("Your To Address: " + toAddress2);
        System.out.print("Enter your distance: ");
        int distance = scanner.nextInt();
        System.out.println(distance);
        System.out.println("How much money you want to send: ");
        int money = scanner.nextInt();
        System.out.println("Your money is: " + money);
        if ( money >= 0 && money <= 100000) {
            System.out.println("The tax is 1000 Rupees.");
        }

        if (money >= 100001 && money <= 200000)
        {
            System.out.println("The amount is 1900 Rupees.");
        }
        else if (money >= 200001 && money <= 500000)
        {
            System.out.println("The Amount is 5000 Rupees.");
        }
        System.out.println("If you are satisfied with our process enter \"Okay\" ");
        String confirmationMessage = scanner.next();
        if (confirmationMessage.equalsIgnoreCase("Okay"))
        {
            System.out.println("Your Amount is placed to your destination very soon...");
        }
        else {
            System.out.println("Your Process is cancel");
        }
    }
    public  void SendLuggage()
    {
        System.out.print("Enter from address: ");
        String fromAddress1 = scanner.nextLine();
        System.out.print("Enter To address: ");
        String toAddress2 = scanner.nextLine();
        System.out.println("Your From Address: " + fromAddress1);
        System.out.println("Your To Address: " + toAddress2);
        System.out.print("Enter your distance: ");
        int distance = scanner.nextInt();
        System.out.println("Your distance is: " + distance + " kms");
        System.out.println("How many kgs of luggage you want to send: ");
        float luggage = scanner.nextFloat();
        System.out.println("Your Luggage is: " + luggage + " kgs");
        if ( luggage >= 0 && luggage <= 50) {
            System.out.println("The tax is 500 Rupees.");
        }

        if (luggage >= 51 && luggage <= 100)
        {
            System.out.println("The tax is 900 Rupees.");
        }
        else if (luggage >= 101 && luggage <= 200)
        {
            System.out.println("The tax is 1400 Rupees.");
        }
        System.out.println("If you are satisfied with our process enter \"Okay\" ");
        String confirmationMessage = scanner.next();
        if (confirmationMessage.equalsIgnoreCase("Okay"))
        {
            System.out.println("Your Luggage is placed to your destination very soon...");
        }
        else {
            System.out.println("Your Process is cancel");
        }
    }
}
