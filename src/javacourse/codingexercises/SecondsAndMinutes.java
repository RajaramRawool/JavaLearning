package javacourse.codingexercises;

public class SecondsAndMinutes {
    public static void getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0 || seconds > 59)) {
            System.out.println("invalid input");
        }else {
            int hour = minutes / 60 ;
            int remainingMinutes =  minutes % 60 ;
            System.out.println( hour + "h " + remainingMinutes + "m " + seconds + "s " );
        }
    }
    public static void getDurationString(int seconds) {
        if (seconds < 0) {
            System.out.println("invalid input");
        }else {
            int minutes = seconds / 60 ;
            int remainingSeconds = seconds % 60 ;
            getDurationString(minutes,remainingSeconds);
        }
    }
}
