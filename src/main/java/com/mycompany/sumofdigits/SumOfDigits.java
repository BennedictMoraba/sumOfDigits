package com.mycompany.sumofdigits;

import java.util.Scanner;

public class SumOfDigits 
{

    public static void main(String[] args) 
    {
        //Instatiate Scanner to support with user input
        Scanner sc = new Scanner(System.in);
        
        int streamOfDigits;
        int sumOfDigits = 0;
        
        System.out.print("Input a stream of numbers: ");
        streamOfDigits = sc.nextInt();
        
        while(streamOfDigits != 0)
        {
            sumOfDigits = sumOfDigits + streamOfDigits % 10;
            streamOfDigits  = streamOfDigits /10;
        }
        
        System.out.println("The sum is: " + sumOfDigits);
    }
}

