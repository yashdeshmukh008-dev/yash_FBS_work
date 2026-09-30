import java.util.Scanner;


class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
        super(message);
    }
}


class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}


class Login {

    private String username = "admin";
    private String password = "12345";

    public void validateUsername(String enteredUsername)
            throws InvalidUsernameException {

        if (!username.equals(enteredUsername)) {
            throw new InvalidUsernameException(
                    "Invalid username."
            );
        }
    }

    public void validatePassword(String enteredPassword)
            throws InvalidPasswordException {

        if (!password.equals(enteredPassword)) {
            throw new InvalidPasswordException(
                    "Invalid password."
            );
        }
    }
}


public class LoginDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Login login = new Login();

        // Username validation
        System.out.print("Enter username: ");
        String enteredUsername = sc.nextLine();

        try {

            login.validateUsername(enteredUsername);

        } catch (InvalidUsernameException e) {

            System.out.println(
                    "Error: " + e.getMessage()
            );

            System.out.println("Program terminated.");

            sc.close();
            return;
        }


        // Password validation
        int attempts = 3;

        while (attempts > 0) {

            System.out.print("Enter password: ");
            String enteredPassword = sc.nextLine();

            try {

                login.validatePassword(enteredPassword);

                System.out.println("Login Successful!");

                sc.close();
                return;

            } catch (InvalidPasswordException e) {

                attempts--;

                System.out.println(
                        "Error: " + e.getMessage()
                );

                if (attempts > 0) {
                    System.out.println(
                            "Remaining attempts: " + attempts
                    );
                }
            }
        }

        System.out.println("Account Locked!");

        sc.close();
    }
}
