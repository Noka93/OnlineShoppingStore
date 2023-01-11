package MyProjects;

import java.util.Scanner;

public class Nokia {
    private int userInput;
    Scanner scanner = new Scanner(System.in);

    public String displayMenu(){
        return """
                Welcome!!!
                Enter: 
                1 -> for phonebook
                2 -> for Messages
                3 -> for Call register
                4 -> for Settings
                5 -> for Games
                6 -> for Extras
                """;
    }

    public void phoneBookMenu(){
        System.out.print("""
                Enter :
                1 -> Search
                2 -> Add name
                3 -> Erase
                4 -> Edit
                5 -> Service Nos.
                """);
        userInput = scanner.nextInt();
        switch (userInput){
            case 1 :
                System.out.println("Enter details");
                break;
            case 2:
                System.out.println("Add contact details");
                break;
            case 3:
                System.out.println("Delete contact details");
                break;
            case 4:
                System.out.println("Edit contact details");
                break;
            case 5:
                System.out.println("Enter service number");
            default:
                System.out.println("An invalid number has been inputted");
        }
    }
    public void messageMenu(){
        System.out.print("""
                Enter :
                1 -> Create Message
                2 -> Inbox
                3 -> Outbox
                4 -> Draft
                """);
        userInput = scanner.nextInt();
        switch (userInput){
            case 1:
                System.out.println("Type new messages");
                break;
            case 2:
                System.out.println("You have 10 new messages");
                break;
            case 3:
                System.out.println("3 messages sent successfully");
                break;
            case 4:
                System.out.println("Message has been stored in draft");
                break;
            default:
                System.out.println("An invalid number has been inputted");
        }

    }
    public void callRegMenu(){
        System.out.print("""
                Enter :
                1 -> Missed calls
                2 -> Received calls
                3 -> Dialled calls
                4 -> Erase recent call list
                5 -> Show call duration
                """);
            userInput = scanner.nextInt();
            switch (userInput){
                case 1:
                    System.out.println("Missed calls : 50");
                    break;
                case 2:
                    System.out.println("Received calls : 6");
                    break;
                case 3:
                    System.out.println("Received calls : 40");
                    break;
                default:
                    System.out.println("An invalid number has been inputted");
            }
    }

    public void settingsMenu(){
        System.out.print("""
                Enter :
                1 -> Tone setting
                2 -> Call setting
                3 -> Phone setting
                4 -> Security settings
                5 -> Restore factory settings
                """);
        userInput = scanner.nextInt();
        switch (userInput){
            case 1:
                System.out.print("""
                        Enter :
                        1 -> Ringing tone
                        2 -> Ringing volume
                        3 -> Incoming call alert
                        4 -> Message alert tone 
                        5 -> Keypad tones
                        6 -> Warning and game tones                      
                        """);
                break;
            case 2:
                System.out.print("""
                        Enter :
                        1 -> Automatic redial 
                        2 -> Speed redial 
                        3 -> Call waiting option 
                        4 -> Own number sending 
                        5 -> Automatic answer 
                        """);
                break;
            case 3:
                System.out.print("""
                        Enter :
                        1 -> Language 
                        2 -> Cell info display
                        3 -> Welcome note 
                        4 -> Network selection
                        5 -> Lights 
                        6 -> Confirm  SIM service actions
                        """);
                break;
            case 4:
                System.out.print("""
                        Enter :
                        1 -> PIN code request 
                        2 -> Call barring service
                        3 -> Fixed dialling
                        4 -> Closed user group
                        5 -> Phone security 
                        6 -> Change access codes 
                        """);
                break;
            case 5:
                System.out.print("""
                        Enter :
                        1 -> for factory reset
                        """);
                break;
            default:
                System.out.print("An invalid number has been inputted");
        }

    }

    public void gameMenu(){
        System.out.print("""
                Enter :
                1 -> Snake
                2 -> Sudoku
                """);
        userInput = scanner.nextInt();
        switch (userInput){
            case 1:
                System.out.println("Snake games ready to play");
                break;
            case 2:
                System.out.println("Sudoku game ready to play");
                break;
            default:
                System.out.print("An invalid number has been inputted");
        }
    }
    public void extraMenu(){
        System.out.print("""
                Enter :
                1 -> Calculator
                2 -> Torchlight
                3 -> Calender
                4 -> Others
                """);
        userInput = scanner.nextInt();
        switch (userInput){
            case 1:
                System.out.println("Calculator");
                break;
            case 2:
                System.out.println("Torchlight");
                break;
            case 3:
                System.out.println("Calender");
                break;
            case 4:
                System.out.println("Others");
        }
    }

    public void optionMenu(){
        int userInput = scanner.nextInt();
        switch (userInput){
            case 1:
                phoneBookMenu();
                break;
            case 2:
                messageMenu();
                break;
            case 3:
                callRegMenu();
                break;
            case 4:
                settingsMenu();
                break;
            case 5:
                gameMenu();
                break;
            case 6:
                extraMenu();
                break;
            default:
                System.out.println("Invalid input!!!");
        }
    }
}
