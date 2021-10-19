package javacourse;

import javacourse.codingexercises.AreaCalculator;
import javacourse.codingexercises.MethodOverloadingExercise;
import javacourse.codingexercises.PlayingCat;
import javacourse.codingexercises.SecondsAndMinutes;

public class Main {
    public static void main(String[] args) {
//        SpeedConverter.toMilesPerHour(10.25);
//        SpeedConverter.printConversion(10.25);
//        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
//        System.out.println(LeapYear.isLeapYear(1700) );
//        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.176,3.175));
        System.out.println(MethodOverloadingExercise.calcFeetAndInchesToCentimeters(12));
        SecondsAndMinutes.getDurationString(600);
        AreaCalculator.area(5);
        System.out.println(PlayingCat.isCatPlaying(true,40));


    }
}
