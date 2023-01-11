package MyProjects;

import java.util.Scanner;

public class NokiaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Nokia nokia3310 = new Nokia();
        System.out.print(nokia3310.displayMenu());
        nokia3310.optionMenu();

        System.out.println("Do you wish to continue? Enter yes/no");

        String userChoice;
        do {
            userChoice= scanner.next();
            if (userChoice.equalsIgnoreCase("yes")) {
                System.out.print(nokia3310.displayMenu());
                nokia3310.optionMenu();
                System.out.print("Do you wish to continue? Enter yes/no");
            }else{
                System.out.println("Thank you for using Nokia 3310 ");
            }
        } while (userChoice.equalsIgnoreCase("yes"));

    }
}
