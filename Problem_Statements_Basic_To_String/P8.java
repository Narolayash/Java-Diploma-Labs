package Problem_Statements_Basic_To_String;

// WAP to calculate an angle between hour and minute hand. (Hours and minutes should be taken from user)
public class P8 {
    private static double findAngleBetweenHourAndMinute(int hours, int minutes) {
        hours = hours % 12;
        double angleOfMinutes = 6 * minutes;
        double angleOfHoures = (30 * hours) + (0.5 * minutes);

        double angle = Math.abs(angleOfHoures - angleOfMinutes);

        if (angle > 180) angle = 360 - angle;

        return angle;
    }

    public static void main(String[] args) {
        System.out.println(findAngleBetweenHourAndMinute(3, 30));
    }
}
