package JavaTraining.sample.scanner;

import java.util.Scanner;

public class ScannerClassExamples
{
    public void getMethod()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Employee details of Codex box Organisation");

        System.out.print("Enter your Company Name: ");

        String companyName = scanner.nextLine();

        System.out.print("Enter your full name: ");

        String personName = scanner.nextLine();

        System.out.print("Enter your Joining Date: ");

        String joinDate = scanner.nextLine();

        System.out.print("Enter your Salary: ");

        double salary = scanner.nextDouble();

        System.out.print("Enter your Training Period: ");

        String trainingPeriod = scanner.nextLine();

        System.out.print("Enter your Bond Period: ");

        String bondPeriod = scanner.nextLine();

        System.out.println("============================================");

        System.out.print("My Company name is: " + companyName);

        System.out.print("My full name is: " + personName);

        System.out.print("My Joining date is: " + joinDate);

        System.out.print("My Salary is: " + salary);

        System.out.print("My Training Period is: " + trainingPeriod);

        System.out.print("My Bond Period is: " + bondPeriod);


    }
}
