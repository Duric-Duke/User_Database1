import java.util.Scanner;

public class MenuPrinter{
    static Scanner prompter = new Scanner(System.in);
	public static void menu(){
        System.out.println("_____Menu_____\nPick an Option:\n 1. Add user: \n 2. Update user: \n 3. Delete user: \n 4. List \n 5. Exit");
        String inp = prompter.next();
        switch (inp) {
            case "1":
                Prompter.create();
                break;
            case "2":
                // update();
                break;
            case "3":
                // delete();
                break;
            case "4":
                Prompter.getUserBE();
                break;
            case "5":
                System.exit(0);
            default:
                menu();
        }
        menu();
    }
}