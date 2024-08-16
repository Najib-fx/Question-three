/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.vu.question3c;

/**
 *
 * @author HP
 */
public class Question3c {

       public static void main(String[] args) {
        int totalDistance = 10000; // in km
        int speed = 250; // in km/h
        int fuelingStopDistance = 200; // in km
        int stopTimeMinutes = 5; // time per stop in minutes
        int fuelingStops = totalDistance / fuelingStopDistance;

        double travelTimeHours = (double) totalDistance / speed; // travel time in hours
        double stopTimeHours = (double) fuelingStops * stopTimeMinutes / 60; // stop time in hours

        double totalTimeHours = travelTimeHours + stopTimeHours;

        System.out.println("Total time taken for the return journeyis " + totalTimeHours + " hours");
    }
}
