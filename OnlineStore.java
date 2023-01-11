package MyProjects;

import java.util.Scanner;

public class OnlineStore {
    Scanner scanner = new Scanner(System.in);
    private final int Books = 400;
    private final int Bags = 500;
    private final int Shoes = 200;

    private int userInputs;

    public OnlineStore() {

    }

    public String displayMenu() {
        return """
                Press 1 for Books
                Press 2 for Bags
                Press 3 for Shoes
                """;
    }

    public void setBooks() {
        System.out.println("How many Quantity do you want");
        int userInput = scanner.nextInt();
        int totalPrice = userInput * Books;
        System.out.println("Price per book is 400 \nTotal Books cost :" + totalPrice);
    }

    public void setBags() {
        System.out.println("How many Quantity do you want");
        int userInput = scanner.nextInt();
        int totalPrice = userInput * Bags;
        System.out.println("Price per bag is 500 \nTotal Bags cost :" + totalPrice);

    }

    public void setShoes() {
        System.out.println("How many Quantity do you want");
        int userInput = scanner.nextInt();
        int totalPrice = userInput * Shoes;
        System.out.print("Price per shoe is 400 \nTotal Shoes cost : " + totalPrice + "\n");

    }

    public void userChoice() {
        userInputs = scanner.nextInt();
        switch (userInputs) {
            case 1:
                setBooks();
                break;
            case 2:
                setBags();
                break;
            case 3:
                setShoes();
                break;
            default:
                System.out.println("Invalid number");
        }
    }

    public void checkCondition() {
        System.out.println("Do you wish to continue? enter yes or no");
        String userInput = "";
        do {
            userInput = scanner.next();
            if (userInput.equalsIgnoreCase("yes")) {
                System.out.print(displayMenu());
                userChoice();
                System.out.println("Do you wish to continue? enter yes or no");
            }else {
                System.out.println("Thanks for shopping with us!!!");
            }
        } while (userInput.equalsIgnoreCase("yes"));


    }
}
