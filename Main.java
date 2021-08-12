package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Strathmore Univerity admission process, kindly follow the steps that follow ");

        System.out.println("Enter KCSE examination points");
        int kcsepoints = input.nextInt();
        System.out.println("Enter Interview questions score");
        int interviewscore = input.nextInt();
        System.out.println("Enter Confidence level score");
        int confidencescore = input.nextInt();

        if ((kcsepoints >= 65 )  && (interviewscore >=6 ) ||  ( confidencescore >=5 ))
            System.out.println("Congratulations! You are eligible for admission ");
        else
            System.out.println("Sorry! You are not eligible for admission");
    }
}
