package MyProjects;

import java.util.Scanner;

public class Nokia {
    private int userInput;
    Scanner scanner = new Scanner(System.in);

    public String displayMenu(){
        return """
                Welcome!!!
                Enter :
                1  -> for phonebook
                2  -> for Messages
                3  -> for Chat
                4  -> for Call register
                5  -> for Tones
                6  -> for Settings
                7  -> for Call divert
                8  -> for Games
                9  -> for Calculator
                10 -> for Reminders
                11 -> for Clock
                12 -> for Profiles
                13 -> SIM service
                """;
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
                Chats();
            case 4:
                callRegMenu();
                break;
            case 5:
                tonesMenu();
                break;
            case 6:
                settingMenu();
                break;
            case 7:
                callDivertMenu();
                break;
            case 8:
                gameMenu();
                break;
            case 9:
                calculatorMenu();
                break;
            case 10:
                Reminder();
                break;
            case 11:
                clockMenu();
                break;
            case 12:
                Profile();
                break;
            case 13:
                simServices();
                break;
            default:
                System.out.println("Invalid input!!!");
        }
    }

    public void phoneBookMenu(){
        System.out.print("""
                Enter :
                1  -> Search
                2  -> Service Nos.
                3  -> Add name
                4  -> Erase
                5  -> Edit
                6  -> Assign tone
                7  -> Send b'card
                8  -> Options
                9  -> Speed dials
                10 -> Voice tags
                """);

        userInput = scanner.nextInt();
        switch (userInput){
            case 1 :
                System.out.println("Enter details");
                System.out.println("Enter 0 to go back to phone menu or 12 for main menu");
               userInput = scanner.nextInt();
               if (userInput == 0) {
                   phoneBookMenu();
               } else if (userInput == 12) {
                   System.out.println(displayMenu());
                   optionMenu();

               }else {
                       System.out.println("Invalid input");
               }
                break;
            case 2:
                System.out.println("Enter service number");
                System.out.println("Enter 0 to go back to phone menu or 12 for main menu");
                userInput = scanner.nextInt();
                if (userInput == 0) {
                    phoneBookMenu();
                } else if (userInput == 12) {
                    System.out.println(displayMenu());
                    optionMenu();

                }else {
                    System.out.println("Invalid input");
                }
                break;
            case 3:
                System.out.println("Add contact details");
                System.out.println("Enter 0 to go back to phone menu or 12 for main menu");
                userInput = scanner.nextInt();
                if (userInput == 0) {
                    phoneBookMenu();
                } else if (userInput == 12) {
                    System.out.println(displayMenu());
                    optionMenu();

                }else {
                    System.out.println("Invalid input");
                }
                break;
            case 4:
                System.out.println("Delete contact details");
                System.out.println("Enter 0 to go back to phone menu or 12 for main menu");
                userInput = scanner.nextInt();
                if (userInput == 0) {
                    phoneBookMenu();
                } else if (userInput == 12) {
                    System.out.println(displayMenu());
                    optionMenu();

                }else {
                    System.out.println("Invalid input");
                }
            case 5:
                System.out.println("Edit contact details");
                System.out.println("Enter 0 to go back to phone menu or 12 for main menu");
                userInput = scanner.nextInt();
                if (userInput == 0) {
                    phoneBookMenu();
                } else if (userInput == 12) {
                    System.out.println(displayMenu());
                    optionMenu();

                }else {
                    System.out.println("Invalid input");
                }
                break;
            case 6:
                System.out.println("Assign tone");
                System.out.println("Enter 0 to go back to phone menu or 12 for main menu");
                userInput = scanner.nextInt();
                if (userInput == 0) {
                    phoneBookMenu();
                } else if (userInput == 12) {
                    System.out.println(displayMenu());
                    optionMenu();

                }else {
                    System.out.println("Invalid input");
                }
                break;
            case 7:
                System.out.println("Send business card");
                System.out.println("Enter 0 to go back to phone menu or 12 for main menu");
                userInput = scanner.nextInt();
                if (userInput == 0) {
                    phoneBookMenu();
                } else if (userInput == 12) {
                    System.out.println(displayMenu());
                    optionMenu();

                }else {
                    System.out.println("Invalid input");
                }
                break;
            case 8:
                System.out.print("""
                        Enter:
                        1 -> Type of view
                        2 -> Memory status
                        """);
                System.out.println("Enter 0 to go back to phone menu or 12 for main menu");
                userInput = scanner.nextInt();
                if (userInput == 0) {
                    phoneBookMenu();
                } else if (userInput == 12) {
                    System.out.println(displayMenu());
                    optionMenu();

                }else {
                    System.out.println("Invalid input");
                }
                break;
            case 9 :
                System.out.println("Speed dials");
                System.out.println("Enter 0 to go back to phone menu or 12 for main menu");
                userInput = scanner.nextInt();
                if (userInput == 0) {
                    phoneBookMenu();
                } else if (userInput == 12) {
                    System.out.println(displayMenu());
                    optionMenu();

                }else {
                    System.out.println("Invalid input");
                }
                break;
            case 10:
                System.out.println("Voice tags");
                System.out.println("Enter 0 to go back to phone menu or 12 for main menu");
                userInput = scanner.nextInt();
                if (userInput == 0) {
                    phoneBookMenu();
                } else if (userInput == 12) {
                    System.out.println(displayMenu());
                    optionMenu();

                }else {
                    System.out.println("Invalid input");
                }
                break;
            default:
                System.out.println("An invalid number has been inputted");
        }
    }
    public void messageMenu(){
        System.out.print("""
                Enter :
                1 -> Write messages
                2 -> Inbox
                3 -> Outbox
                4 -> Draft
                5 -> Picture messages
                6 -> Template
                7 -> Message settings
                
                """);
        userInput = scanner.nextInt();
        switch (userInput){
            case 1:
                System.out.println("Write new messages");
                System.out.println("Enter 0 to go back to message menu or 12 for main menu");
                userInput = scanner.nextInt();
                if (userInput == 0) {
                    messageMenu();
                } else if (userInput == 12) {
                    System.out.println(displayMenu());
                    optionMenu();

                }else {
                    System.out.println("Invalid input");
                }
                break;
            case 2:
                System.out.println("You have 10 new messages");
                System.out.println("Enter 0 to go back to message menu or 12 for main menu");
                userInput = scanner.nextInt();
                if (userInput == 0) {
                    messageMenu();
                } else if (userInput == 12) {
                    System.out.println(displayMenu());
                    optionMenu();

                }else {
                    System.out.println("Invalid input");
                }
                break;
            case 3:
                System.out.println("3 messages sent successfully");
                System.out.println("Enter 0 to go back to message menu or 12 for main menu");
                userInput = scanner.nextInt();
                if (userInput == 0) {
                    messageMenu();
                } else if (userInput == 12) {
                    System.out.println(displayMenu());
                    optionMenu();

                }else {
                    System.out.println("Invalid input");
                }
                break;
            case 4:
                System.out.println("Message has been stored in draft");
                System.out.println("Enter 0 to go back to message menu or 12 for main menu");
                userInput = scanner.nextInt();
                if (userInput == 0) {
                    messageMenu();
                } else if (userInput == 12) {
                    System.out.println(displayMenu());
                    optionMenu();

                }else {
                    System.out.println("Invalid input");
                }
                break;
            case 5:
                System.out.println("Send picture messages");
                System.out.println("Enter 0 to go back to message menu or 12 for main menu");
                userInput = scanner.nextInt();
                if (userInput == 0) {
                    messageMenu();
                } else if (userInput == 12) {
                    System.out.println(displayMenu());
                    optionMenu();

                }else {
                    System.out.println("Invalid input");
                }
                break;
            case 6:
                System.out.println("Choose smileys");
                System.out.println("Enter 0 to go back to message menu or 12 for main menu");
                userInput = scanner.nextInt();
                if (userInput == 0) {
                    messageMenu();
                } else if (userInput == 12) {
                    System.out.println(displayMenu());
                    optionMenu();

                }else {
                    System.out.println("Invalid input");
                }
                break;
            case 7:
                System.out.println("""
                        Enter :
                        1 -> Set 1
                        2 -> Common
                        """);
                int userChoice = scanner.nextInt();
                switch (userChoice){
                    case 1:
                        System.out.print("""
                                Enter :
                                1 -> Message center number
                                2 -> Messages sent as
                                3 -> Message validity
                                """);
                        userInput = scanner.nextInt();
                        switch (userInput){

                            case 1:
                                System.out.println("Message center number is 0000001234");
                                System.out.println("Enter 0 to go back to message menu or 12 for main menu");
                                userInput = scanner.nextInt();
                                if (userInput == 0) {
                                    messageMenu();
                                } else if (userInput == 12) {
                                    System.out.println(displayMenu());
                                    optionMenu();

                                }else {
                                    System.out.println("Invalid input");
                                }
                                break;
                            case 2:
                                System.out.println("Message sent as MMS or SMS");
                                System.out.println("Enter 0 to go back to message menu or 12 for main menu");
                                userInput = scanner.nextInt();
                                if (userInput == 0) {
                                    messageMenu();
                                } else if (userInput == 12) {
                                    System.out.println(displayMenu());
                                    optionMenu();

                                }else {
                                    System.out.println("Invalid input");
                                }
                                break;
                            case 3:
                                System.out.println("Message validity number is set");
                                System.out.println("Enter 0 to go back to message menu or 12 for main menu");
                                userInput = scanner.nextInt();
                                userInput = scanner.nextInt();
                                if (userInput == 0) {
                                    messageMenu();
                                } else if (userInput == 12) {
                                    System.out.println(displayMenu());
                                    optionMenu();

                                }else {
                                    System.out.println("Invalid input");
                                }
                            break;
                            default:
                                System.out.println("Invalid entry");
                        }
                        break;
                    case 2:
                        System.out.println("""
                                Enter :
                                1 -> Delivery report
                                2 -> Reply via same centre
                                3 -> Character support
                                """);
                        int userInput1 = scanner.nextInt();
                        switch (userInput1){
                            case 0:
                                messageMenu();
                            case 1:
                                System.out.println("Delivery report : Delivered/Not Delivered");
                                System.out.println("Enter 0 to go back to message menu or 12 for main menu");
                                userInput = scanner.nextInt();
                                if (userInput == 0) {
                                    messageMenu();
                                } else if (userInput == 12) {
                                    System.out.println(displayMenu());
                                    optionMenu();

                                }else {
                                    System.out.println("Invalid input");
                                }
                                break;
                            case 2:
                                System.out.println("Reply messages via same message center number");
                                System.out.println("Enter 0 to go back to message menu or 12 for main menu");
                                userInput = scanner.nextInt();
                                if (userInput == 0) {
                                    messageMenu();
                                } else if (userInput == 12) {
                                    System.out.println(displayMenu());
                                    optionMenu();

                                }else {
                                    System.out.println("Invalid input");
                                }
                                break;
                            case 3:
                                System.out.println("Character support: Nokia");
                                System.out.println("Enter 0 to go back to message menu or 12 for main menu");
                                userInput = scanner.nextInt();
                                if (userInput == 0) {
                                    messageMenu();
                                } else if (userInput == 12) {
                                    System.out.println(displayMenu());
                                    optionMenu();

                                }else {
                                    System.out.println("Invalid input");
                                }
                                break;
                            default:
                                System.out.println("Invalid input");
                        }
                }
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
                6 -> Show call costs
                7 -> Show call settings
                8 -> Prepaid credit
                0 -> 0 to come back to message menu
                """);
            userInput = scanner.nextInt();
            switch (userInput){
                case 1:
                    System.out.println("Missed calls : 50");
                    System.out.println("Enter 0 to go back to call reg menu or 12 for main menu");
                    userInput = scanner.nextInt();
                    if (userInput == 0) {
                        callRegMenu();
                    } else if (userInput == 12) {
                        System.out.println(displayMenu());
                        optionMenu();

                    }else {
                        System.out.println("Invalid input");
                    }
                    break;
                case 2:
                    System.out.println("Received calls : 6");
                    System.out.println("Enter 0 to go back to call reg menu or 12 for main menu");
                    userInput = scanner.nextInt();
                    if (userInput == 0) {
                        callRegMenu();
                    } else if (userInput == 12) {
                        System.out.println(displayMenu());
                        optionMenu();

                    }else {
                        System.out.println("Invalid input");
                    }
                    break;
                case 3:
                    System.out.println("Received calls : 40");
                    System.out.println("Enter 0 to go back to call reg menu or 12 for main menu");
                    userInput = scanner.nextInt();
                    if (userInput == 0) {
                        callRegMenu();
                    } else if (userInput == 12) {
                        System.out.println(displayMenu());
                        optionMenu();

                    }else {
                        System.out.println("Invalid input");
                    }
                    break;
                case 4:
                    System.out.println("Delete Message");
                    System.out.println("Enter 0 to go back to call reg menu or 12 for main menu");
                    userInput = scanner.nextInt();
                    if (userInput == 0) {
                        callRegMenu();
                    } else if (userInput == 12) {
                        System.out.println(displayMenu());
                        optionMenu();

                    }else {
                        System.out.println("Invalid input");
                    }
                    break;
                case 5:
                    System.out.println("""
                            Enter:
                            1 -> Last call duration
                            2 -> All calls' duration
                            3 -> Received calls' duration
                            4 -> Dialled calls' duration
                            5 -> Clear timers
                            """);
                    userInput = scanner.nextInt();
                    switch (userInput){
                            case 1:
                            System.out.println("Calculating last call duration");
                            System.out.println("Enter 0 to go back to call reg menu or 12 for main menu");
                            userInput = scanner.nextInt();
                            if (userInput == 0) {
                                callRegMenu();
                            } else if (userInput == 12) {
                                System.out.println(displayMenu());
                                optionMenu();

                            }else {
                                System.out.println("Invalid input");
                            }
                            break;
                        case 2:
                            System.out.println("Calculating all call duration");
                            System.out.println("Enter 0 to go back to call reg menu or 12 for main menu");
                            userInput = scanner.nextInt();
                            if (userInput == 0) {
                                callRegMenu();
                            } else if (userInput == 12) {
                                System.out.println(displayMenu());
                                optionMenu();

                            }else {
                                System.out.println("Invalid input");
                            }
                            break;
                        case 3:
                        System.out.println("Calculating received call duration");
                            System.out.println("Enter 0 to go back to call reg menu or 12 for main menu");
                            userInput = scanner.nextInt();
                            if (userInput == 0) {
                                callRegMenu();
                            } else if (userInput == 12) {
                                System.out.println(displayMenu());
                                optionMenu();

                            }else {
                                System.out.println("Invalid input");
                            }
                        break;
                        case 4:
                            System.out.println("Calculating dialled call duration");
                            System.out.println("Enter 0 to go back to call reg menu or 12 for main menu");
                            userInput = scanner.nextInt();
                            if (userInput == 0) {
                                callRegMenu();
                            } else if (userInput == 12) {
                                System.out.println(displayMenu());
                                optionMenu();

                            }else {
                                System.out.println("Invalid input");
                            }
                            break;
                        case 5:
                            System.out.println("Clearing calls' timer");
                            System.out.println("Enter 0 to go back to call reg menu or 12 for main menu");
                            userInput = scanner.nextInt();
                            if (userInput == 0) {
                                callRegMenu();
                            } else if (userInput == 12) {
                                System.out.println(displayMenu());
                                optionMenu();

                            }else {
                                System.out.println("Invalid input");
                            }

                        default:
                            System.out.println("Invalid input");
                    }
                    break;


                case 6:
                    System.out.print("""
                            Enter :
                            1 -> Last call
                            2 -> All calls' cost
                            3 -> Clear counter
                            """);
                    userInput = scanner.nextInt();
                    switch (userInput){
                        case 1:
                            System.out.println("List of last call");
                            System.out.println("Enter 0 to go back to call reg menu or 12 for main menu");
                            userInput = scanner.nextInt();
                            if (userInput == 0) {
                                callRegMenu();
                            } else if (userInput == 12) {
                                System.out.println(displayMenu());
                                optionMenu();

                            }else {
                                System.out.println("Invalid input");
                            }
                            break;
                        case 2:
                            System.out.println("All calls' cost");
                            System.out.println("Enter 0 to go back to call reg menu or 12 for main menu");
                            userInput = scanner.nextInt();
                            if (userInput == 0) {
                                callRegMenu();
                            } else if (userInput == 12) {
                                System.out.println(displayMenu());
                                optionMenu();

                            }else {
                                System.out.println("Invalid input");
                            }
                            break;
                        case 3:
                            System.out.println("Clearing counter");
                            System.out.println("Enter 0 to go back to call reg menu or 12 for main menu");
                            userInput = scanner.nextInt();
                            if (userInput == 0) {
                                callRegMenu();
                            } else if (userInput == 12) {
                                System.out.println(displayMenu());
                                optionMenu();

                            }else {
                                System.out.println("Invalid input");
                            }
                            break;
                        default:
                            System.out.println("An invalid number has been inputted");
                    }
                    break;
                case 7:
                    System.out.print("""
                            Enter :
                            1 -> Call cost limit
                            2 -> Show costs in
                            """);
                    System.out.println("Enter 0 to go back to call reg menu or 12 for main menu");
                    userInput = scanner.nextInt();
                    if (userInput == 0) {
                        callRegMenu();
                    } else if (userInput == 12) {
                        System.out.println(displayMenu());
                        optionMenu();

                    }else {
                        System.out.println("Invalid input");
                    }
                    break;
                case 8:
                    System.out.println("Prepaid credit");
                    System.out.println("Enter 0 to go back to call reg menu or 12 for main menu");
                    userInput = scanner.nextInt();
                    if (userInput == 0) {
                        callRegMenu();
                    } else if (userInput == 12) {
                        System.out.println(displayMenu());
                        optionMenu();

                    }else {
                        System.out.println("Invalid input");
                    }
                    break;
                default:
                    System.out.println("An invalid number has been inputted");
            }
    }

    public void tonesMenu(){
        System.out.print("""
                        Enter :
                        1 -> Ringing tone
                        2 -> Ringing volume
                        3 -> Incoming call alert
                        4 -> Message alert tone
                        5 -> Keypad tones
                        6 -> Warning and game tones
                        """);
        userInput = scanner.nextInt();
        switch (userInput){
            case 1:
                System.out.print("""
                        Enter :
                        1 -> Nokia tone
                        2 -> No limit
                        3 -> Noisey one
                        4 -> Orion
                        5 -> Paradise Island
                        6 -> Nassau
                        7 -> Pegasus
                        8 - Perseus
                        """);
                System.out.println("Enter 0 to go back to tone menu or 12 for main menu");
                userInput = scanner.nextInt();
                if (userInput == 0) {
                    tonesMenu();
                } else if (userInput == 12) {
                    System.out.println(displayMenu());
                    optionMenu();

                }else {
                    System.out.println("Invalid input");
                }
                break;
            case 2:
                System.out.println("Increase or Decrease volume");
                System.out.println("Enter 0 to go back to tone menu or 12 for main menu");
                userInput = scanner.nextInt();
                if (userInput == 0) {
                    tonesMenu();
                } else if (userInput == 12) {
                    System.out.println(displayMenu());
                    optionMenu();

                }else {
                    System.out.println("Invalid input");
                }
                break;
            case 3:
                System.out.print("""
                        Enter :
                        1 -> Silent
                        2 -> Ringing
                        3 -> Vibrating
                        """);
                userInput = scanner.nextInt();
                switch (userInput){
                    case 1:
                        System.out.println("Your phone has been placed on silence");
                        System.out.println("Enter 0 to go back to tone menu or 12 for main menu");
                        userInput = scanner.nextInt();
                        if (userInput == 0) {
                            tonesMenu();
                        } else if (userInput == 12) {
                            System.out.println(displayMenu());
                            optionMenu();

                        }else {
                            System.out.println("Invalid input");
                        }
                        break;
                    case 2:
                        System.out.println("Ring tone is ...");
                        System.out.println("Enter 0 to go back to tone menu or 12 for main menu");
                        userInput = scanner.nextInt();
                        if (userInput == 0) {
                            tonesMenu();
                        } else if (userInput == 12) {
                            System.out.println(displayMenu());
                            optionMenu();

                        }else {
                            System.out.println("Invalid input");
                        }
                        break;
                    case 3:
                        System.out.println("Your phone has been placed on vibration");
                        System.out.println("Enter 0 to go back to tone menu or 12 for main menu");
                        userInput = scanner.nextInt();
                        if (userInput == 0) {
                            tonesMenu();
                        } else if (userInput == 12) {
                            System.out.println(displayMenu());
                            optionMenu();

                        }else {
                            System.out.println("Invalid input");
                        }
                        break;
                    default:
                        System.out.println("Invalid input");
                }
                break;
            case 4:
                System.out.print("""
                        Enter :
                        1 -> Nokia tone
                        2 -> No limit
                        3 -> Noisey one
                        4 -> Orion
                        5 -> Paradise Island
                        6 -> Nassau
                        7 -> Pegasus
                        8 -> Perseus
                        9 -> silent
                        """);
                System.out.println("Enter 0 to go back to tone menu or 12 for main menu");
                userInput = scanner.nextInt();
                if (userInput == 0) {
                    tonesMenu();
                } else if (userInput == 12) {
                    System.out.println(displayMenu());
                    optionMenu();

                }else {
                    System.out.println("Invalid input");
                }
                break;
            case 5:
                System.out.print("""
                        Enter :
                        1 -> Nokia tone
                        2 -> No limit
                        3 -> Noisey one
                        4 -> Orion
                        5 -> Paradise Island
                        6 -> Nassau
                        7 -> Pegasus
                        8 -> Perseus
                        9 -> Vibrating
                        """);
                System.out.println("Enter 0 to go back to tone menu or 12 for main menu");
                userInput = scanner.nextInt();
                if (userInput == 0) {
                    tonesMenu();
                } else if (userInput == 12) {
                    System.out.println(displayMenu());
                    optionMenu();

                }else {
                    System.out.println("Invalid input");
                }
                break;
            case 6:
                System.out.print("""
                        Enter :
                        1 -> Nokia tone
                        2 -> No limit
                        3 -> Noisey one
                        4 -> Orion
                        5 -> Paradise Island
                        6 -> Nassau
                        7 -> Pegasus
                        8 - Perseus
                        9 -> Vibration
                        10 -> Silent
                        """);
                System.out.println("Enter 0 to go back to tone menu or 12 for main menu");
                userInput = scanner.nextInt();
                if (userInput == 0) {
                    tonesMenu();
                } else if (userInput == 12) {
                    System.out.println(displayMenu());
                    optionMenu();

                }else {
                    System.out.println("Invalid input");
                }
                break;
            case 12:
                displayMenu();
                break;
            default:
                System.out.print("An invalid number has been inputted");
        }
    }

    public void settingMenu(){
        System.out.print("""
                Enter :
                1 -> Call setting
                2 -> Phone setting
                3 -> Security settings
                4 -> Restore factory settings
                """);
        userInput = scanner.nextInt();
        switch (userInput){
                case 1:
                System.out.print("""
                        Enter :
                        1 -> Automatic redial
                        2 -> Speed redial
                        3 -> Call waiting option
                        4 -> Own number sending
                        5 -> Automatic answer
                        """);
                System.out.println("Enter 0 to go back to settings menu or 12 for main menu");
                userInput = scanner.nextInt();
                if (userInput == 0) {
                    settingMenu();
                } else if (userInput == 12) {
                    System.out.println(displayMenu());
                    optionMenu();

                }else {
                    System.out.println("Invalid input");
                }
                break;
            case 2:
                System.out.print("""
                        Enter :
                        1 -> Language
                        2 -> Cell info display
                        3 -> Welcome note
                        4 -> Network selection
                        5 -> Lights
                        6 -> Confirm  SIM service actions
                        """);
                System.out.println("Enter 0 to go back to setting menu or 12 for main menu");
                userInput = scanner.nextInt();
                if (userInput == 0) {
                    settingMenu();
                } else if (userInput == 12) {
                    System.out.println(displayMenu());
                    optionMenu();

                }else {
                    System.out.println("Invalid input");
                }
                break;
            case 3:
                System.out.print("""
                        Enter :
                        1 -> PIN code request
                        2 -> Call barring service
                        3 -> Fixed dialling
                        4 -> Closed user group
                        5 -> Phone security
                        6 -> Change access codes
                        """);
                System.out.println("Enter 0 to go back to settings menu or 12 for main menu");
                userInput = scanner.nextInt();
                if (userInput == 0) {
                    settingMenu();
                } else if (userInput == 12) {
                    System.out.println(displayMenu());
                    optionMenu();

                }else {
                    System.out.println("Invalid input");
                }
                break;
            case 4:
                System.out.print("""
                        Enter :
                        1 -> for factory reset
                        """);
                System.out.println("Enter 0 to go back to settings menu or 12 for main menu");
                userInput = scanner.nextInt();
                if (userInput == 0) {
                    settingMenu();
                } else if (userInput == 12) {
                    System.out.println(displayMenu());
                    optionMenu();

                }else {
                    System.out.println("Invalid input");
                }
                break;

            default:
                System.out.print("An invalid number has been inputted");
        }

    }

    public void callDivertMenu(){
        System.out.print("Call diverting ");
        System.out.println("Enter 0 to go back to call divert menu or 12 for main menu");
        userInput = scanner.nextInt();
        if (userInput == 0) {
            callDivertMenu();
        } else if (userInput == 12) {
            System.out.println(displayMenu());
            optionMenu();

        }else {
            System.out.println("Invalid input");
        }
    }

    public void Profile(){
        System.out.println("Enter profile details");
        System.out.println("Enter 0 to go back to profile menu or 12 for main menu");
        userInput = scanner.nextInt();
        if (userInput == 0) {
            Profile();
        } else if (userInput == 12) {
            System.out.println(displayMenu());
            optionMenu();

        }else {
            System.out.println("Invalid input");
        }
    }

    public void calculatorMenu(){
        int sum1 = scanner.nextInt();
        int sum2 = scanner.nextInt();
        int total = sum1 + sum2;
        System.out.println("You can only add two numbers. enter num" + total);
        System.out.println("Enter 0 to go back to calculator menu or 12 for main menu");
        userInput = scanner.nextInt();
        if (userInput == 0) {
            calculatorMenu();
        } else if (userInput == 12) {
            System.out.println(displayMenu());
            optionMenu();

        }else {
            System.out.println("Invalid input");
        }
    }
    public void Chats(){
        System.out.print("""
                Enter :
                1 -> Search
                2 -> weChat
             
                """);
        System.out.println("Enter 0 to go back to chat menu or 12 for main menu");
        userInput = scanner.nextInt();
        if (userInput == 0) {
            Chats();
        } else if (userInput == 12) {
            System.out.println(displayMenu());
            optionMenu();

        }else {
            System.out.println("Invalid input");
        }
    }

    public void clockMenu(){
        System.out.print("""
                Enter :
                1 -> Alarm clock
                2 -> Clock settings
                3 -> Date setting
                4 -> Stopwatch
                5 -> Countdown timer
                6 -> Auto update of date and time
                """);
        userInput = scanner.nextInt();
        switch (userInput){
                case 1:
                System.out.println("Set alarm");
                System.out.println("Enter 0 to go back to clock menu or 12 for main menu");
                userInput = scanner.nextInt();
                if (userInput == 0) {
                    clockMenu();
                } else if (userInput == 12) {
                    System.out.println(displayMenu());
                    optionMenu();

                }else {
                    System.out.println("Invalid input");
                    System.out.println("Enter 0 to go back to clock menu or 12 for main menu");
                    userInput = scanner.nextInt();
                    if (userInput == 0) {
                        clockMenu();
                    } else if (userInput == 12) {
                        System.out.println(displayMenu());
                        optionMenu();

                    }else {
                        System.out.println("Invalid input");
                    }
                }
                break;
            case 2:
                System.out.println("Set clock");
                System.out.println("Enter 0 to go back to clock menu or 12 for main menu");
                userInput = scanner.nextInt();
                if (userInput == 0) {
                    clockMenu();
                } else if (userInput == 12) {
                    System.out.println(displayMenu());
                    optionMenu();

                }else {
                    System.out.println("Invalid input");
                }
                break;
            case 3:
                System.out.println("Set date");
                System.out.println("Enter 0 to go back to clock menu or 12 for main menu");
                userInput = scanner.nextInt();
                if (userInput == 0) {
                    clockMenu();
                } else if (userInput == 12) {
                    System.out.println(displayMenu());
                    optionMenu();

                }else {
                    System.out.println("Invalid input");
                }
                break;
            case 4:
                System.out.println("Stop watch");
                System.out.println("Enter 0 to go back to clock menu or 12 for main menu");
                userInput = scanner.nextInt();
                if (userInput == 0) {
                    clockMenu();
                } else if (userInput == 12) {
                    System.out.println(displayMenu());
                    optionMenu();

                }else {
                    System.out.println("Invalid input");
                }
                break;
            case 5:
                System.out.println("Set countdown timer");
                System.out.println("Enter 0 to go back to clock menu or 12 for main menu");
                userInput = scanner.nextInt();
                if (userInput == 0) {
                    clockMenu();
                } else if (userInput == 12) {
                    System.out.println(displayMenu());
                    optionMenu();

                }else {
                    System.out.println("Invalid input");
                }
                break;
            case 6:
                System.out.println("Auto update of date and timer");
                System.out.println("Enter 0 to go back to clock menu or 12 for main menu");
                userInput = scanner.nextInt();
                if (userInput == 0) {
                    clockMenu();
                } else if (userInput == 12) {
                    System.out.println(displayMenu());
                    optionMenu();

                }else {
                    System.out.println("Invalid input");
                }
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
                System.out.println("Enter 0 to go back to game menu or 12 for main menu");
                userInput = scanner.nextInt();
                if (userInput == 0) {
                    gameMenu();
                } else if (userInput == 12) {
                    System.out.println(displayMenu());
                    optionMenu();

                }else {
                    System.out.println("Invalid input");
                }
                break;
            case 2:
                System.out.println("Sudoku game ready to play");
                System.out.println("Enter 0 to go back to game menu or 12 for main menu");
                userInput = scanner.nextInt();
                if (userInput == 0) {
                    gameMenu();
                } else if (userInput == 12) {
                    System.out.println(displayMenu());
                    optionMenu();

                }else {
                    System.out.println("Invalid input");
                }
                break;
                default:
                System.out.print("An invalid number has been inputted");
        }
    }
    public void simServices(){
        System.out.println("Your are connected to MTN ");
        System.out.println("Enter 0 to go back to game menu or 12 for main menu");
        userInput = scanner.nextInt();
        if (userInput == 0) {
            simServices();
        } else if (userInput == 12) {
            System.out.println(displayMenu());
            optionMenu();

        }else {
            System.out.println("Invalid input");
        }
    }

    public void Reminder(){
        System.out.println("Set activity");
        System.out.println("Enter 0 to go back to game menu or 12 for main menu");
        userInput = scanner.nextInt();
        if (userInput == 0) {
            Reminder();
        } else if (userInput == 12) {
            System.out.println(displayMenu());
            optionMenu();

        }else {
            System.out.println("Invalid input");
        }
    }

    public void checkingConditions(){
        System.out.println("Do you wish to continue? Enter yes/no");
        String userChoice;
            userChoice= scanner.next();
            if (userChoice.equalsIgnoreCase("yes")) {
                System.out.print(displayMenu());
                optionMenu();
                System.out.print("Do you wish to continue? Enter yes/no");
            } else if (userChoice.equalsIgnoreCase("no")){
                System.out.println("Thank you for using Nokia 3310 ");
                }
            else {
                System.out.println("Invalid. Type 'yes' or 'no'");
                checkingConditions();
            }

    }

}
