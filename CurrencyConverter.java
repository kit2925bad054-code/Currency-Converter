import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double usd = 86.0;
        double eur = 101.0;
        double gbp = 117.0;

        System.out.println("Currency Converter");
        System.out.println("1. INR to USD");
        System.out.println("2. INR to EUR");
        System.out.println("3. INR to GBP");

        System.out.print("Choose Option: ");
        int choice = sc.nextInt();

        System.out.print("Enter Amount in INR: ");
        double inr = sc.nextDouble();

        double result = 0;

        switch (choice) {

            case 1:
                result = inr / usd;
                System.out.printf("USD = %.2f", result);
                break;

            case 2:
                result = inr / eur;
                System.out.printf("EUR = %.2f", result);
                break;

            case 3:
                result = inr / gbp;
                System.out.printf("GBP = %.2f", result);
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}