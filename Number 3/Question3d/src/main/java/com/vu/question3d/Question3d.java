/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.vu.question3d;

/**
 *
 * @author HP
 */
public class Question3d {

        public static void main(String[] args) {
        int totalDistanceKm = 10000; // in km
        double speedMetersPerSecond = 225.5; // in m/s

        // Convert distance to meters and speed to km/h
        double totalDistanceMeters = totalDistanceKm * 1000; // in meters
        double speedKmPerHour = speedMetersPerSecond * 3.6; // convert m/s to km/h

        double travelTimeHours = totalDistanceMeters / (speedKmPerHour * 1000); // total time in hours

        int startTimeHour = 9; // starting at 09:00 hrs

        double arrivalTime = startTimeHour + travelTimeHours;

        System.out.println("The second coach will arrive at approximately " + arrivalTime + " hours.");

        }}
