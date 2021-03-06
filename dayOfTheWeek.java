/*
Uses Zeller’s congruence algorithm developed by Christian Zeller to calculate the day of the week.
*/

package javaapplication2;
import java.util.Scanner;
public class JavaApplication2 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        boolean another = true;
        
        while(another)
        {
            System.out.print("Enter year (e.g., 2008): ");
            int year = input.nextInt();
            System.out.print("Enter month (1-12): ");
            int month = input.nextInt();
            System.out.print("Enter the day of the month (1-31): ");
            int day = input.nextInt();
        
            if(validDate(month, day))   //if values entered are logical, proceed with formula
            {
                if(month == 1)  //January is represented as 13 in the previous year
                {
                    month = 13;
                    year--;
                }
                else if(month == 2) //February is represented as 14 in the previous year
                {
                    month = 14;
                    year--;
                }

                //declare variables in formula
                int h;  //solving for day of the week
                int q = day;    //day of the month
                int m = month;  //month
                int j = year/100;   //year/100
                int k = year % 100;   //year of the century

                //breakdown of Zeller's equation
                int part1 = q;
                int part2 = (26 * (m+1)) / 10;
                int part3 = k;
                int part4 = k/4;
                int part5 = j/4;
                int part6 = 5*j;

                h = (part1 + part2 + part3 + part4 + part5 + part6) % 7;

                switch(h)
                {
                    case 0: System.out.println("Day of the week is Saturday"); break;
                    case 1: System.out.println("Day of the week is Sunday"); break;
                    case 2: System.out.println("Day of the week is Monday"); break;
                    case 3: System.out.println("Day of the week is Tuesday"); break;
                    case 4: System.out.println("Day of the week is Wednesday"); break;
                    case 5: System.out.println("Day of the week is Thursday"); break;
                    case 6: System.out.println("Day of the week is Friday"); break;
                }
            }
            else
                System.out.println("Date entered is not valid");
            
            //prompts for another entry
            System.out.print("Enter another date? (1 for yes; 0 for no): ");
            int answer = input.nextInt();
            
            if(answer == 1)
                another = true;
            else
                another = false;
            
            System.out.println();
        }
    }
    
    public static boolean validMonth(int month)
    {
        //checks if month entered is valid
        if(month >= 1 && month <= 12)
            return true;
        else
            return false;
    }
    
    public static boolean validDate(int month, int day)
    {
        if(validMonth(month))
        {
            //31 days - January, March, May, July, August, October, December
            if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            {
                if(day >= 1 && day <= 31)
                    return true;
                else
                    return false;
            }
            //30 days - April, June, September, November
            else if(month == 4 || month == 6 || month == 9 || month == 11)
            {
                if(day >= 1 && day <= 30)
                    return true;
                else
                    return false;
            }
            else if(month == 2)
            {
                if(day >= 1 && day <= 29)
                    return true;
                else
                    return false;
            }
        }
        return false;
    }
}
