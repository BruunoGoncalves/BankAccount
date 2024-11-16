package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int numberAccount = sc.nextInt();
        System.out.print("Enter account holder: ");
        String accountHolder = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)?: ");
        String decision = sc.nextLine();

        if (decision.equals("y")) {
            System.out.print("Enter initial deposit value: ");
            double depositAmount = sc.nextDouble();
        }
        


        sc.close();
    }
}
