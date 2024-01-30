class Time {
    private int hours;
    private int minutes;
    private int seconds;

    Time() {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }
    Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    Time addTime(Time t1, Time t2) {
        Time result = new Time();

        result.seconds = t1.seconds + t2.seconds;
        result.minutes = t1.minutes + t2.minutes + result.seconds / 60;
        result.seconds %= 60;

        result.hours = t1.hours + t2.hours + result.minutes / 60;
        result.minutes %= 60;

        return result;
    }
    public void display() {
        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
    }
}

public class Main {
    public static void main(String[] args) {
        // Input: 2 55 40, 5 20 30
        Time time1 = new Time(2, 55, 40);
        Time time2 = new Time(5, 20, 30);

        // Create a third object to store the result
        Time result = new Time();

        result = result.addTime(time1, time2);

        // Display the result
        System.out.print("Output: ");
        result.display();
    }
}