# Java-HW-1
Four questions, 25 points each

1. (Palindrome integer) Write a program that prompts the user to enter a five-digit integer and determines whether it is a palindrome integer. An integer is palindrome if it reads the same from right to left and from left to right. A negative integer is treated the same as a positive integer. Do not use the string class to solve this problem (0 points if you do so).

Here are sample runs of this program:

Enter a five-digit integer: 12321 
12321 is a palindrome

Enter a five-digit integer: 12341 
12341 is not a palindrome


2. (Science: day of the week) Zeller’s congruence is an algorithm developed by Christian Zeller to calculate the day of the week. The formula is 
h = [q + ( (26 * (m+1)) / 10 ) + k + (k/4) + (j/4) + 5j ] % 7
 
where 
h is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4: Wednesday, 5: Thursday, and 6: Friday). 
q is the day of the month. 
m is the month (3: March, 4: April, ..., 12: December). January and February are counted as months 13 and 14 of the previous year. 
j is year/100. 
k is the year of the century (i.e., year % 100). 

Note all divisions in this exercise perform an integer division. 

(Hint: January and February are counted as 13 and 14 in the formula, so you need to convert the user input 1 to 13 and 2 to 14 for the month and change the year to the previous year. For example, if the user enters 1 for m and 2015 for year, m will be 13 and year will be 2014 used in the formula.)

Write a program that prompts the user to enter a year, month, and day of the month, and displays the name of the day of the week. 

Here is a sample run:

Enter year: (e.g., 2008): 2019
Enter month: 1-12: 1
Enter the day of the month: 1-31: 22
Day of the week is Tuesday


3. (Game: pick a card) Write a program that simulates picking a card from a deck of 52 cards. Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the card. 
Here is a sample run of the program:

The card you picked is Jack of Hearts


4. (Check Phone Number) Write a program that prompts the user to enter their phone number in the format DDD-DDD-DDDD, where D is a digit. Your program should check whether the input is valid. 

Here are two sample runs:

Enter a phone number: 232−213−5435 
232−213−5435 is a valid phone number

Enter a phone number: 23−213−5435 
23−213−5435 is an invalid phone number
