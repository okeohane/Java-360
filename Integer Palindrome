/*
Prompts the user to enter a five-digit integer and determines whether it is a palindrome integer. 
An integer is palindrome if it reads the same from right to left and from left to right. 
A negative integer is treated the same as a positive integer. String class is not used.
*/

package javaapplication1;
import java.util.Scanner;
public class JavaApplication1 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a five-digit integer: ");
        
        int number = input.nextInt();
        int originalNum = number;
        
        int front = 0;
        int back = 0;
        int numCompared = 5; //total number of digits left to be compared
       
        //once the numbers left to be compared is 1,
            //no more comparisons need to be made
        while(front == back && numCompared > 1)
        {
            //singles out first number to get it by itself
            front = number / ((int)Math.pow(10, numCompared - 1));
            back = number % 10; //retrieves last digit
        
            //subtracts front number from the whole number
            number -= (front * ((int)Math.pow(10, numCompared - 1)));
            number /= 10;
            
            numCompared -=2 ;   //two less numbers need to be compared
        }
        
        //if while loop ended because all comparisons were made
        if(numCompared == 1)
            System.out.println(originalNum + " is a palindrome");
        //if while loop ended because front != back
        else
            System.out.println(originalNum + " is NOT a palindrome");
    }
