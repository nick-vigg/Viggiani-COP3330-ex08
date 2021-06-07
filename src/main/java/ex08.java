/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Viggiani
 */
import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many people?");
        int people = input.nextInt();
        System.out.println("How many pizzas do you have?");
        int pizzas = input.nextInt();
        System.out.println("How many slices per pizza?");
        int slices = input.nextInt();
        int totalSlices = slices*pizzas;
        int perSlices = totalSlices / people;
        int leftover = totalSlices % people;
        String output = String.format("""
                                        %d people with %d pizzas (%d slices)
                                        Each person gets %d pieces of pizza
                                        There are %d leftover pieces.""",
                                        people, pizzas, totalSlices, perSlices, leftover);
        System.out.println(output);
    }
}
