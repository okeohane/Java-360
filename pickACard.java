/*
Program simulates picking a card from a deck of 52 cards. 
Displays the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the card. 
*/

package javaapplication3;
import java.util.Scanner;
public class JavaApplication3 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        boolean another = true;
        
        while(another)
        {
            int suit = (int)(Math.random() * 4);    //picks # [0,4)
            int number = (int)(Math.random() * 13); //picks # [0,13)
            
            System.out.print("The card you picked is ");
            switch(number)  //start by saying the number
            {
                case 0: System.out.print("Ace of "); break;
                case 1: System.out.print("2 of "); break;
                case 2: System.out.print("3 of "); break;
                case 3: System.out.print("4 of "); break;
                case 4: System.out.print("5 of "); break;
                case 5: System.out.print("6 of "); break;
                case 6: System.out.print("7 of "); break;
                case 7: System.out.print("8 of "); break;
                case 8: System.out.print("9 of "); break;
                case 9: System.out.print("10 of "); break;
                case 10: System.out.print("Jack of "); break;
                case 11: System.out.print("Queen of "); break;
                case 12: System.out.print("King of "); break;
            }

            switch(suit)	//display suit
            {
                case 0: System.out.println("Hearts"); break;
                case 1: System.out.println("Diamonds"); break;
                case 2: System.out.println("Clubs"); break;
                case 3: System.out.println("Spades"); break;
            }

            //prompts for another entry
            System.out.print("Pick another card? (1 for yes; 0 for no): ");
            int answer = input.nextInt();
            
            if(answer == 1)
                another = true;
            else
                another = false;
            
            System.out.println();
        }
    }
}
