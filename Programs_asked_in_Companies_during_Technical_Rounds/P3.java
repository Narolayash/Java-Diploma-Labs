package Programs_asked_in_Companies_during_Technical_Rounds;

// 3 Time Problem
// Create a Time class to represent time in hours, minutes, and seconds.
// • Initialize Hr : Min : Sec using a constructor.
// • Create an AddSeconds(seconds) method to add the given seconds to the initialized time.
// • Create a SubtractSeconds(seconds) method to subtract the given seconds from the initial time.
// • Ensure proper time adjustment (60 seconds = 1 minute, 60 minutes = 1 hour).
// • Print the time in Hr:Min:Sec format.
//
// Input:
// Initial Time = 02 : 30 : 45
// Add Seconds = 50
// Subtract Seconds = 30
// Output:
// Time after adding seconds = 02 : 31 : 35
// Time after subtracting seconds = 02 : 31 : 05
//
// Input:
// Initial Time = 01 : 15 : 20
// Add Seconds = 100
// Subtract Seconds = 40
// Output:
// Time after adding seconds = 01 : 17 : 00
// Time after subtracting seconds = 01 : 16 : 20

class Time {
    public int hours;
    public int minutes;
    public int seconds;

    public Time(int hours, int minutes, int seconds) {
        if ((hours < 0 || hours >= 24) || (minutes < 0 || minutes >= 60) || (seconds < 0 || seconds >= 60)) {
            throw new IllegalArgumentException("Invalid Time");
        }
        else {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
        }
    }

    public void addSeconds(int seconds) {
//        this.seconds += seconds;
//
//        this.minutes += this.seconds / 60;
//        this.seconds %= 60;
//        this.hours += this.minutes / 60;
//        this.minutes %= 60;
//        this.hours %= 24;

        int totalSeconds = this.hours * 3600 + this.minutes * 60 + this.seconds;

        totalSeconds = (totalSeconds + seconds) % 86400;

        this.hours = totalSeconds / 3600;
        this.minutes = (totalSeconds % 3600) / 60;
        this.seconds = totalSeconds % 60;
    }

    public void subtractSeconds(int seconds) {
        int totalSeconds = this.hours * 3600 + this.minutes * 60 + this.seconds;

        totalSeconds = Math.floorMod(totalSeconds - seconds, 86400);

        this.hours = totalSeconds / 3600;
        this.minutes = (totalSeconds % 3600) / 60;
        this.seconds = totalSeconds % 60;
    }

    public void printTime() {
        System.out.println(hours + " : " + minutes + " : " + seconds);
    }
}

public class P3 {
    public static void main(String[] args) {
        Time t1 = new Time(10, 51, 5);
        t1.printTime();
        t1.addSeconds(5000);
        t1.printTime();
        t1.subtractSeconds(5000);
        t1.printTime();
    }
}
