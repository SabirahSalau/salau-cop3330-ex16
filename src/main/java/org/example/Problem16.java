/*
 *  UCF COP3330 Summer 2021 Assignment 16 Solution
 *  Copyright 2021 Sabirah Salau
 */



package org.example;

import java.util.Scanner;

public class Problem16
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your age?");
        int age = input.nextInt();

        if (age >= 16)
        {
            System.out.println("You are old enough to legally drive.");
        }
        else
        {
            System.out.println("You are not old enough to legally drive.");
        }

    }
}
