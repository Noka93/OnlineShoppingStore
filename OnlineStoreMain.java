package MyProjects;


import MyProjects.OnlineStore;

public class OnlineStoreMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Remy Online Stores");
        OnlineStore onlineStore = new OnlineStore();
        System.out.print(onlineStore.displayMenu());
        onlineStore.userChoice();
        onlineStore.checkCondition();
    }
        }


