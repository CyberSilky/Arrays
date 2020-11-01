package com.company;

import java.util.Arrays;

public class Main {

    public static boolean isItemInArray(String item, String[] items) {
        for (String i : items) {
            if (i.toLowerCase().equals(item)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Declare an Array
        int[] nums;

        //Declare and allocate an Array
        double[] otherNums = new double[5];

        //Declaring, allocating, and initializing an array
        String[] availablePets = {"cat", "dog", "fish",};
        String[] unavailablePets = {"bird", "rabbit", "hamster", "gerbil"};

        System.out.println(Arrays.toString(availablePets));
        System.out.println(Arrays.toString(unavailablePets));

        int indexOfAvailablePet = 2; //the index of fish (swapping fish for bird)
        int indexOfUnavailablePet = 0; //the index of bird (swapping bird for fish)

        String availablePet = availablePets[indexOfAvailablePet]; //Fish
        String unavailablePet = unavailablePets[indexOfUnavailablePet]; //Bird

        availablePets[indexOfAvailablePet] = unavailablePet;
        unavailablePets[indexOfUnavailablePet] = availablePet;

        System.out.println();
        System.out.println(Arrays.toString(availablePets));
        System.out.println(Arrays.toString(unavailablePets));
    }

}
