package com.tryingthisout;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        System.out.println(EvenOrOdd.evenOrOdd(sc.nextInt()));
        
        sc.close();
    }
}
