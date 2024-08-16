/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.vu.question3b;

/**
 *
 * @author HP
 */
public class Question3b {

       public static void main(String[] args) {
        int totalDistance = 10000; // in km
        int speed = 250; // in km/h
        int StopDistance = 150; // in km
        int fuelingStopDistance = 200; // in km
        int stopTimeMinutes = 5; // time per stop in minutes

        int passengerStops = totalDistance / StopDistance;
        int fuelingStops = totalDistance / fuelingStopDistance;

        int totalStops = passengerStops + fuelingStops;

        double travelTime = (double) totalDistance / speed; // travel time in hours
        double stopTime = (double) totalStops * stopTimeMinutes / 60; // stop time in hours

        double totalTime = travelTime + stopTime;

        System.out.println("Total time taken to travel  is " + totalTime + " hours");
       }
}
