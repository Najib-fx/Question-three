/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.vu.question3a;

/**
 *
 * @author HP
 */
public class Question3a {
    public static void main(String[] args) {
       
        int totalDistance = 10000; // in km
        int StopDistance = 150; // in km
        int refuelStopDistance = 200; // in km

        int passengerStops = totalDistance / StopDistance;
        int fuelingStops = totalDistance / refuelStopDistance;

        int allStops = passengerStops + fuelingStops;

        System.out.println("The train should stop " + allStops + " times from Kampala to Jinja.");


    }}
