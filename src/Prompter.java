import java.util.Scanner;

public class Prompter{
    static Scanner prompt = new Scanner(System.in);
    static int id = 0;

	public static String prompt(String prompt){
		Scanner in = new Scanner(System.in);
		System.out.print(prompt);
        return in.nextLine();
	}
    public static void create(){
        String name = prompt("What is your name?: ");
        String surname = prompt("What is your surname?: ");
        String email = prompt("Enter your email address: ");
        String dob = prompt("Enter your Date_of_birth (DD/MM/YYYY): ");
        if(DateValidator.isValid(dob)){
            String uid = name.substring(0, 3) + id++;
            UserDao.createUser(name, surname, email, dob, uid);
        } else {
            System.out.println("Invalid Date of Birth! ☹️\n Please input your Date of Birth (DD/MM/YYYY): ");
            create();
        } 
    } // end of Method create....
    public static void getUserBE(){
        System.out.println("Comfirm your email: ");
        String email = prompt.nextLine();
        for(String [] user: UserDao.database ){
            if(user[2] != null && email.equals(user[2])){
                UserDao.getUserByEmail(email);
            }
        }
    }
    public static void update(){
        String name = prompt("What is your name?: ");
        String surname = prompt("What is your surname?: ");
        String dob = prompt("Enter your Date_of_birth (DD/MM/YYYY): ");
        if(DateValidator.isValid(dob)){
            String uid = name.substring(0, 3) + id++;
            UserDao.updateUser(name, surname, surname, dob, uid);
        } else {
            System.out.println("Invalid Date of Birth! ☹️\n Please input your Date of Birth (DD/MM/YYYY): ");
            update();
        } 
    } // end of update method.


}