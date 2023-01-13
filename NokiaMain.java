package MyProjects;

public class NokiaMain {
    public static void main(String[] args) {
        Nokia nokia3310 = new Nokia();
        System.out.print(nokia3310.displayMenu());
        nokia3310.optionMenu();
        nokia3310.checkingConditions();
    }
}
