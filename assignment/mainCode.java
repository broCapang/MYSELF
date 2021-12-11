package assignment;


import java.util.Scanner;

public class mainCode {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // VARIABLES
        String[] userEmail = new String[20];
        int[] userPass = new int[20];
        String[] adminEmail = new String[20];
        int[] adminPass = new int[20];

        // TEST EMAIL AND PASS
        userEmail[0] = "irfan";
        userPass[0] = 000000;
        adminEmail[0] = "shazwy";
        adminPass[0] = 111111;

        while (true){
            // GET INPUT FROM USER
            System.out.println("USER 1");
            System.out.println("ADMIN 2");
            System.out.print("Enter the code : ");
            int code = input.nextInt();

            System.out.print("Email: ");
            String emailInput = input.next();
            System.out.print("Password: ");
            int passInput = input.nextInt();

            // VERIFYING PHASE

            switch (code){
                case 1:
                    //USER
                    for (int i=0;i<20;i++){     //VERIFYING PHASE
                        if (userEmail[0].equals(emailInput)){
                            if (userPass[0]==passInput){
                                // ENTER MOVIE PAGE
                                System.out.println("WE IN MOVIE PAGE");
                                break;
                            }
                        }
                    }
                    break;
                case 2:
                    // ADMIN
                    for (int i=0;i<20;i++){     //VERIFYING PHASE
                        if (adminEmail[i].equals(emailInput)){
                            if (adminPass[i]==passInput){
                                // ENTER ADMIN PAGE
                                System.out.println("WE IN ADMIN PAGE");
                                break;
                            }
                        }
                    }
                    break;
                default:
                    // USER ENTER WRONG CODE
                    System.out.print("Invalid code");
                    break;
            }

            // ASK USER IF THEY STILL WANT TO USE THIS PROGRAM
            System.out.print("CONTINUE? (Y/N) : ");
            char lastQ = input.next().charAt(0);
            if (lastQ == 'N'){
                break;
            }
        }
    }
}
