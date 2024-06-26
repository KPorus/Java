import java.util.Random;
import java.util.Scanner;

interface Java_Account {
    void getAccount_name();

    void setAccount_name(String name);
}

interface Java_Password {
    void get_password();

    void set_password(String password);
}

interface Java_Verify_me {
    void get_number();

    void send_otp(int number);

    void verify_otp();
}

class CreateAccount implements Java_Account, Java_Password, Java_Verify_me {
    Scanner scanner = new Scanner(System.in);
    String firstName, lastName, passwordInput, password;
    String name;
    String otp;
    int phoneNumber;

    public void getAccount_name() {
        System.out.println("Enter first name:");
        String firstNameInput = scanner.nextLine();
        System.out.println("Enter last name:");
        String lastNameInput = scanner.nextLine();
        name = firstNameInput + " " + lastNameInput;
    };

    static boolean isUpper(String firstNameInput, String lastNameInput) {
        return (Character.isUpperCase(firstNameInput.codePointAt(0)) && Character
                .isUpperCase(lastNameInput.codePointAt(0)));
    }

    public void setAccount_name(String name) {
        String firstNameInput = name.split(" ")[0];
        String lastNameInput = name.split(" ")[1];
        if (isUpper(firstNameInput, lastNameInput)) {
            firstName = firstNameInput;
            lastName = lastNameInput;
            System.out.println(firstName + " " + lastName);
        } else {
            System.out.println("The first letter of both firstname and lastname must be in uppercase.");
            getAccount_name();
        }
    };

    public void get_password() {
        System.out.println("Enter password:");
        passwordInput = scanner.nextLine();
    }

    public static boolean isValid(String password) {
        if (password.length() >= 8) {
            boolean hasUpperCase = false;
            boolean hasLowerCase = false;
            boolean hasDigit = false;

            for (int p = 0; p < password.length(); p++) {
                if (Character.isUpperCase(password.charAt(p))) {
                    hasUpperCase = true;
                } else if (Character.isLowerCase(password.charAt(p))) {
                    hasLowerCase = true;
                } else if (Character.isDigit(password.charAt(p))) {
                    hasDigit = true;
                }
            }

            return hasUpperCase && hasLowerCase && hasDigit;
        }
        return false;
    }

    public void set_password(String password) {
        if (isValid(password)) {
            this.password = password;
        } else {
            System.out.println("Please follow the proper format for password.");
            get_password(); // Re-prompt for password
            set_password(passwordInput); // Validate again
        }
    }
 
    public void get_number() {
        System.out.println("Enter a phone number: ");
        phoneNumber = scanner.nextInt();
    };

    public void send_otp(int number) {
        Random rand = new Random();
        otp = String.format("%04d", rand.nextInt(10000));
        System.out.println("OTP sent to the provided number.");
    };

    public void verify_otp() {
        System.out.println("Enter OTP received:");
        String userOtp = scanner.next();
        if (otp.equals(userOtp)) {
            System.out.println("User verified successfully");
        } else {
            System.out.println("OTP is wrong, try again");
        }
    };
}

public class SignUp {
    public static void main(String[] args) {
        CreateAccount a = new CreateAccount();
        a.getAccount_name();
        String name = a.name;
        a.setAccount_name(name);
        a.get_password();
        String password = a.passwordInput;
        a.set_password(password);
        a.get_number();
        int phone = a.phoneNumber;
        a.send_otp(phone);
        a.verify_otp();
    }
}