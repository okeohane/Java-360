/*
Prompts the user to enter their phone number in the format DDD-DDD-DDDD, where D is a digit.
*/

package javaapplication4;
import java.util.Scanner;
public class JavaApplication4 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a phone number: ");
        String number = input.nextLine();

        if (validPhone(number))
            System.out.println(number + " is a valid phone number");
        else
            System.out.println(number + " is NOT a valid phone number");
        
        //needs to have 10 numbers and 2 '-' (12 characters total)
        //0-2 needs to be an int
        //3th character needs to be a '-'
        //4-6 needs to be an int
        //7 needs to be a '-'
        //8-11 needs to be an int 
    }
    
    public static boolean validPhone(String number)
    {
        //if any of the requirements of a valid phone number is false, return false
        
        //checks if the phone number has a length of 12 (10 digits, 2 characters)
        if(number.length() != 12)
            return false;
        //checks if hyphens are in the correct two positions
        if(number.charAt(3) != '-' || number.charAt(7) != '-')
            return false;
        //checks if characters 0-2 are digits
        for(int i = 0; i <= 2; i++)
        {
            if(!Character.isDigit(number.charAt(i)))
                return false;
        }
        //checks if characters 4-6 are digits
        for(int i = 4; i <= 6; i++)
        {
            if(!Character.isDigit(number.charAt(i)))
                return false;
        }
        //checks if characters 8-11 are digits
        for(int i = 8; i <= 11; i++)
        {
            if(!Character.isDigit(number.charAt(i)))
                return false;
        }
        //if all statements above don't return false, it is a valid number
        return true;
    }
}
