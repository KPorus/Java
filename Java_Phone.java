import java.util.Scanner;

interface Contact_Numbers {
    void Dial_number();

    void Save_number(int number);
}

interface Messages {
    boolean Send_Message(int message_length);

    void Receive_Message();
}

interface Weather {
    void set_locationName(String l_name);

    String get_locationName();

    void set_temparature(double type_temparature);

    double get_Temparature();

    void PrintWeatherInfo();
}

class WeatherInfo implements Weather {
    private String locationName;
    private double temperature;

    @Override
    public void set_locationName(String l_name) {
        this.locationName = l_name;
    }

    @Override
    public String get_locationName() {
        return this.locationName;
    }

    @Override
    public void set_temparature(double type_temparature) {
        this.temperature = type_temparature;
    }

    @Override
    public double get_Temparature() {
        return this.temperature;
    }

    @Override
    public void PrintWeatherInfo() {
        System.out.println("Location: " + locationName);
        System.out.println("Temperature: " + temperature + "°C");
    }
}

public class Java_Phone implements Contact_Numbers, Messages {
    String number;
    String customerName;
    String message;
    int input;
    Scanner scanner = new Scanner(System.in);

    public void Dial_number() {
        try {
            System.out.println("Dial a number: ");
            input = scanner.nextInt();
            scanner.nextLine();
            if (isFirstTwoDigits01(input) && String.valueOf(input).length() == 10) {
                Save_number(input);
            } else {
                System.out.println("First two digits are not '01'");
                System.out.println("Please type again.");
                Dial_number();
            }
        } catch (Exception e) {
            System.out.println(e + ":" + " Please provide valid input.");
        }
    }

    public void Save_number(int input) {
        number = String.format("%011d", input);
        System.out.println("Provide customer name:");
        customerName = scanner.nextLine();
    }

    public void print() {
        System.out.println("Customer name: " + customerName + "\nCustomer number: " + number);
    }

    public boolean isFirstTwoDigits01(int input) {
        int firstTwoDigits = input / 1000000000; // For a 10-digit number
        return firstTwoDigits == 1;
    }

    public boolean Send_Message(int msg_len) {
        if (msg_len > 200) {
            System.out.println("Message length exceeded the limit (200)");
            return false; // Message not sent
        } else {
            System.out.println("Message sent: " + message);
            return true; // Message sent successfully
        }
    }

    public void Receive_Message() {
        System.out.println("Message received: " + message);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Java_Phone user = new Java_Phone();
        user.Dial_number();
        user.print();

        System.out.println("Enter a message: ");
        String message = scanner.nextLine();
        int msg_len = message.length();

        user.message = message;
        boolean messageSent = user.Send_Message(msg_len);

        if (!messageSent) {
            System.out.println("Message was not sent due to exceeding the length limit.");
        }

        // Weather functionality
        WeatherInfo weatherInfo = new WeatherInfo();
        System.out.println("Enter location name:");
        String locationName = scanner.nextLine();
        weatherInfo.set_locationName(locationName);

        System.out.println("Enter temperature:");
        double temperature = scanner.nextDouble();
        weatherInfo.set_temparature(temperature);

        weatherInfo.PrintWeatherInfo();
        scanner.close();
    }
}
