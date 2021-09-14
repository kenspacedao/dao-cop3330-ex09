package base;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 9 Solution
 *  Copyright 2021 Kenny Dao
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.print("WHat is the length of the ceiling? ");
        Scanner len = new Scanner(System.in);
        double length = len.nextDouble();

        System.out.print("What is the width of the ceiling? ");
        Scanner wid = new Scanner(System.in);
        double width = wid.nextDouble();

        double paint_gallon = 350;
        double total = length * width;
        int gallon = (int)Math.ceil(total / paint_gallon);
        System.out.println("You will need to purchase " + gallon + " of paint to cover " + total + " square feet.");
    }
}