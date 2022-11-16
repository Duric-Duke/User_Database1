import java.util.Scanner;

public class UserDao {
    static Scanner prompter = new Scanner(System.in);
    public static String[][] database = new String[100][5];
    public static int position = 0;

	public static void createUser(String name,
									String surname,
									String email,
									String dob,
									String id){

        database[position] = new String[]{name,surname,email,dob,id};
        position++;
	}

	public static String[] getUserByEmail(String email){
        // String [] user = new String[5];
        for(String [] row : database){//Iterate through the rows
        	if(null != row[2] && email.equals(row[2])){//Iterate through the columns
                for(String col: row){
                    System.out.println(col);
                }
                // return row;
        	}
        }

        return null;
	}

	public static String[][] findAll(){
		return database;
	}

	public static void updateUser(
		String name,
		String surname,
		String email,
		String dob,
		String id){
        System.out.println("Comfirm your email address before update: ");
        String email2 = prompter.nextLine();
        for(String [] row : database){
            if(null != row[2] && email2.equals(row[2])){
                row[0] = name;
                row[1] = surname;
                System.out.println("Do you want to update email too? Y/N: ");
                String inp = prompter.nextLine();
                if(inp.equals("Y")){
                    System.out.println("Enter your email.");
                    String email3 = prompter.nextLine();
                    row[2] = email3;
                }
                else{
                    row[2] = email;
                }
            }
        }
	}

	public static void deleteUser(String email){
     //PLEASE CODE ME   
	}



}