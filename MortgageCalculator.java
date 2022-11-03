package D_1_a_BeginnerOfJava;

import java.text.NumberFormat;
import java.util.Scanner;

public class CWM_14_P_2_MortgageCalculator {
    public static void main(String[] args) {
        final byte MonthsInYears = 12;
        final byte Percent = 100;

        int principal = 0;
        float monthlyInterestRate = 0;
        int numberOfPayments = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Principal: ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Enter value between 1000 and 1,000,000");
        }

        while (true) {
            System.out.println("Annual Interest Rate: ");
            float annualInterest = scanner.nextFloat();
            if (annualInterest >= 1 && annualInterest <= 30) {
                 monthlyInterestRate = annualInterest / Percent / MonthsInYears;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        while (true) {
            System.out.println("Period (Years): ");
            byte years = scanner.nextByte();
            if (years >= 1 && years <= 30) {
                numberOfPayments = years * MonthsInYears;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        double mortgage = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))/(Math.pow(1+monthlyInterestRate,numberOfPayments)-1);
        System.out.println("Mortgage: $"+ mortgage);

    }
}
