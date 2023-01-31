/*
 * Programer: Jacob Viti
 *
 * Project: Project 1
 *
 * Purpose: A game to test how good you are at math
 *
 * Date Started: 3/11/2018
 * Last Modified 3/14/2018
 *
 */
package viti;
    
import java.util.Random;
import java.util.Scanner;

public class Project1 
{

   
    public static void main(String[] args) 
    {
     
        Random rng = new Random();
        Scanner sc = new Scanner(System.in);
        boolean keepGoing = false;
        char questionType = 0;
        boolean playAgain = false;
        System.out.println("Hello There! Welcome to the Math Attack! Let's "
                + "Test You! What do you want to be tested in?");
           do
    {
        System.out.println("Please type '+' for addition questions");
        System.out.println("Please type '-' for subtraction questions");
        System.out.println("Please type '*' for multiplication questions");
        

     
        
       do
    { 
         
       String typeOfQuestions = sc.next(); 
        
        
   
        switch(typeOfQuestions)
        {
            case "+":
                System.out.println("You have picked Addition");
                questionType = 'A';
                keepGoing = true;
                break;
            case "-":
                System.out.println("You have picked Subtraction");
                questionType = 'S';
                keepGoing = true;
                break;
            case "*":
                System.out.println("You have picked Multiplication");
                questionType = 'M';
                keepGoing = true;
                break;
            default:
                System.out.println("You did not choose one of the given types"
                        + " please try again");
                keepGoing = false;
                break;
         }
    }while(keepGoing == false);

            
        
        System.out.println("How many questions do you want to try? (1-10)");
        boolean keepGoing2;
        
        double selectedAmount = 0.0;
         do
    { 
        byte numberOfQuestions = sc.nextByte();
        
        
        switch(numberOfQuestions)
        {
            case 1:
                System.out.println("Nice, We are gonna play a 1 question game");
                selectedAmount = 1.0;
                keepGoing2 = true;
                break;
            case 2:
                System.out.println("Nice, We are gonna play a 2 question game");
                selectedAmount = 2.0;
                keepGoing2 = true;
                break;
            case 3:
                System.out.println("Nice, We are gonna play a 3 question game");
                selectedAmount = 3.0;
                keepGoing2 = true;
                break;
            case 4:
                System.out.println("Nice, We are gonna play a 4 question game");
                selectedAmount = 4.0;
                keepGoing2 = true;
                break;
            case 5:
                System.out.println("Nice, We are gonna play a 5 question game");
                selectedAmount = 5.0;
                keepGoing2 = true;
                break;
            case 6:
                System.out.println("Nice, We are gonna play a 6 question game");
                selectedAmount = 6.0;
                keepGoing2 = true;
                break;
            case 7:
                System.out.println("Nice, We are gonna play a 7 question game");
                selectedAmount = 7.0;
                keepGoing2 = true;
                break;
            case 8:
                System.out.println("Nice, We are gonna play a 8 question game");
                selectedAmount = 8.0;
                keepGoing2 = true;
                break;
            case 9:
                System.out.println("Nice, We are gonna play a 9 question game");
                selectedAmount = 9.0;
                keepGoing2 = true;
                break;
            case 10:
                System.out.println("Nice We are gonna play a 10 question game");
                selectedAmount = 10.0;
                keepGoing2 = true;
                break;
            default:
                System.out.println("Please enter an amount that is 1-10");
                keepGoing2 = false;
                break;
            }     
    }while(keepGoing2 == false);
                
            int firstNumber = rng.nextInt(10) + 1;
            int secondNumber = rng.nextInt(10) + 1;
            int thirdNumber = rng.nextInt(10) + 1;
            int fourthNumber = rng.nextInt(10) + 1;
            int fifthNumber = rng.nextInt(10) + 1;
            int sixthNumber = rng.nextInt(10) + 1;
            int seventhNumber = rng.nextInt(10) + 1;
            int eigthNumber = rng.nextInt(10) + 1;
            int ninthNumber = rng.nextInt(10) + 1;
            int tenthNumber = rng.nextInt(10) + 1;
            int eleventhNumber = rng.nextInt(10) + 1;
            int twelthNumber = rng.nextInt(10) + 1;
            int thirteenNumber = rng.nextInt(10) + 1;
            int fourteenNumber = rng.nextInt(10) + 1;
            int fifteenNumber = rng.nextInt(10) + 1;
            int sixteenNumber = rng.nextInt(10) + 1;
            int seventeenNumber = rng.nextInt(10) + 1;
            int eigthteenNumber = rng.nextInt(10) + 1;
            int ninteenNumber = rng.nextInt(10) + 1;
            int twenthNumber = rng.nextInt(10) + 1;
            
            double finalGrade = 0.0;

        
        switch (questionType) {
            case 'A':
                switch ((int)selectedAmount) {
                    case 1:
                    {
                        System.out.println("Your First Question is " + firstNumber
                                + " + " + secondNumber);
                        byte firstAnwser = sc.nextByte();
                        byte correctAnwser1 = (byte) (firstNumber + secondNumber);
                        if(firstAnwser == correctAnwser1)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser1);
                        }
                        break;
                    }
                    case 2:
                    {
                        System.out.println("Your First Question is " + firstNumber
                                + " + " + secondNumber);
                        byte firstAnwser = sc.nextByte();
                        byte correctAnwser1 = (byte) (firstNumber + secondNumber);
                        if(firstAnwser == correctAnwser1)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser1);
                        }
                        System.out.println("Your Second Question is "
                                + thirdNumber + " + " + fourthNumber);
                        byte secondAnwser = sc.nextByte();
                        byte correctAnwser2 = (byte) (thirdNumber + fourthNumber);
                        if(secondAnwser == correctAnwser2)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser2);
                        }
                        break;
                    }
                    case 3:
                    {
                        System.out.println("Your First Question is " + firstNumber
                                + " + " + secondNumber);
                        byte firstAnwser = sc.nextByte();
                        byte correctAnwser1 = (byte) (firstNumber + secondNumber);
                        if(firstAnwser == correctAnwser1)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                            
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser1);
                        }
                        System.out.println("Your Second Question is "
                                + thirdNumber + " + " + fourthNumber);
                        byte secondAnwser = sc.nextByte();
                        byte correctAnwser2 = (byte) (thirdNumber + fourthNumber);
                        if(secondAnwser == correctAnwser2)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser2);
                        }
                        System.out.println("Your Third Question is "
                                + fifthNumber + " + " + sixthNumber);
                        byte thirdAnwser = sc.nextByte();
                        byte correctAnwser3 = (byte) (fifthNumber + sixthNumber);
                        if(thirdAnwser == correctAnwser3)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser3);
                        }
                        break;
                    }
                    case 4:
                    {
                        System.out.println("Your First Question is " + firstNumber
                                + " + " + secondNumber);
                        byte firstAnwser = sc.nextByte();
                        byte correctAnwser1 = (byte) (firstNumber + secondNumber);
                        if(firstAnwser == correctAnwser1)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                            
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser1);
                        }
                        System.out.println("Your Second Question is "
                                + thirdNumber + " + " + fourthNumber);
                        byte secondAnwser = sc.nextByte();
                        byte correctAnwser2 = (byte) (thirdNumber + fourthNumber);
                        if(secondAnwser == correctAnwser2)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser2);
                        }
                        System.out.println("Your Third Question is "
                                + fifthNumber + " + " + sixthNumber);
                        byte thirdAnwser = sc.nextByte();
                        byte correctAnwser3 = (byte) (fifthNumber + sixthNumber);
                        if(thirdAnwser == correctAnwser3)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser3);
                        }
                        System.out.println("Your Fourth Question is "
                                + seventhNumber + " + " + eigthNumber);
                        byte fourthAnwser = sc.nextByte();
                        byte correctAnwser4 = (byte) (seventhNumber + eigthNumber);
                        if(fourthAnwser == correctAnwser4)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser4);
                        }
                        break;
                    }
                    case 5:
                        {
                        System.out.println("Your First Question is " + firstNumber
                                + " + " + secondNumber);
                        byte firstAnwser = sc.nextByte();
                        byte correctAnwser1 = (byte) (firstNumber + secondNumber);
                        if(firstAnwser == correctAnwser1)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser1);
                        }
                        System.out.println("Your Second Question is "
                                + thirdNumber + " + " + fourthNumber);
                        byte secondAnwser = sc.nextByte();
                        byte correctAnwser2 = (byte) (thirdNumber + fourthNumber);
                        if(secondAnwser == correctAnwser2)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser2);
                        }
                        System.out.println("Your Third Question is "
                                + fifthNumber + " + " + sixthNumber);
                        byte thirdAnwser = sc.nextByte();
                        byte correctAnwser3 = (byte) (fifthNumber + sixthNumber);
                        if(thirdAnwser == correctAnwser3)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser3);
                        }
                        System.out.println("Your Fourth Question is "
                                + seventhNumber + " + " + eigthNumber);
                        byte fourthAnwser = sc.nextByte();
                        byte correctAnwser4 = (byte) (seventhNumber + eigthNumber);
                        if(fourthAnwser == correctAnwser4)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser4);
                        }
                        System.out.println("Your Fifth Question is "
                                + ninthNumber + " + " + tenthNumber);
                        byte fifthhAnwser = sc.nextByte();
                        byte correctAnwser5 = (byte) (ninthNumber + tenthNumber);
                        if(fifthhAnwser == correctAnwser5)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser5);
                        }
                    }
                        break;
                    case 6:
                        {
                        System.out.println("Your First Question is " + firstNumber
                                + " + " + secondNumber);
                        byte firstAnwser = sc.nextByte();
                        byte correctAnwser1 = (byte) (firstNumber + secondNumber);
                        if(firstAnwser == correctAnwser1)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser1);
                        }
                        System.out.println("Your Second Question is "
                                + thirdNumber + " + " + fourthNumber);
                        byte secondAnwser = sc.nextByte();
                        byte correctAnwser2 = (byte) (thirdNumber + fourthNumber);
                        if(secondAnwser == correctAnwser2)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser2);
                        }
                        System.out.println("Your Third Question is "
                                + fifthNumber + " + " + sixthNumber);
                        byte thirdAnwser = sc.nextByte();
                        byte correctAnwser3 = (byte) (fifthNumber + sixthNumber);
                        if(thirdAnwser == correctAnwser3)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser3);
                        }
                        System.out.println("Your Fourth Question is "
                                + seventhNumber + " + " + eigthNumber);
                        byte fourthAnwser = sc.nextByte();
                        byte correctAnwser4 = (byte) (seventhNumber + eigthNumber);
                        if(fourthAnwser == correctAnwser4)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser4);
                        }
                        System.out.println("Your Fifth Question is "
                                + ninthNumber + " + " + tenthNumber);
                        byte fifthhAnwser = sc.nextByte();
                        byte correctAnwser5 = (byte) (ninthNumber + tenthNumber);
                        if(fifthhAnwser == correctAnwser5)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser5);
                        }
                        System.out.println("Your Sixth Question is "
                                + eleventhNumber + " + " + twelthNumber);
                        byte sixthAnwser = sc.nextByte();
                        byte correctAnwser6 = (byte) (eleventhNumber + twelthNumber);
                        if(sixthAnwser == correctAnwser6)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser6);
                        }
                    }
                        break;
                    case 7:
                            {
                        System.out.println("Your First Question is " + firstNumber
                                + " + " + secondNumber);
                        byte firstAnwser = sc.nextByte();
                        byte correctAnwser1 = (byte) (firstNumber + secondNumber);
                        if(firstAnwser == correctAnwser1)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser1);
                        }
                        System.out.println("Your Second Question is "
                                + thirdNumber + " + " + fourthNumber);
                        byte secondAnwser = sc.nextByte();
                        byte correctAnwser2 = (byte) (thirdNumber + fourthNumber);
                        if(secondAnwser == correctAnwser2)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser2);
                        }
                        System.out.println("Your Third Question is "
                                + fifthNumber + " + " + sixthNumber);
                        byte thirdAnwser = sc.nextByte();
                        byte correctAnwser3 = (byte) (fifthNumber + sixthNumber);
                        if(thirdAnwser == correctAnwser3)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser3);
                        }
                        System.out.println("Your Fourth Question is "
                                + seventhNumber + " + " + eigthNumber);
                        byte fourthAnwser = sc.nextByte();
                        byte correctAnwser4 = (byte) (seventhNumber + eigthNumber);
                        if(fourthAnwser == correctAnwser4)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser4);
                        }
                        System.out.println("Your Fifth Question is "
                                + ninthNumber + " + " + tenthNumber);
                        byte fifthhAnwser = sc.nextByte();
                        byte correctAnwser5 = (byte) (ninthNumber + tenthNumber);
                        if(fifthhAnwser == correctAnwser5)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser5);
                        }
                        System.out.println("Your Sixth Question is "
                                + eleventhNumber + " + " + twelthNumber);
                        byte sixthAnwser = sc.nextByte();
                        byte correctAnwser6 = (byte) (eleventhNumber + twelthNumber);
                        if(sixthAnwser == correctAnwser6)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser6);
                        }
                        System.out.println("Your Seventh Question is "
                                + thirteenNumber + " + " + fourteenNumber);
                        byte seventhAnwser = sc.nextByte();
                        byte correctAnwser7 = (byte) (thirteenNumber + fourteenNumber);
                        if(seventhAnwser == correctAnwser7)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser7);
                        }
                    }
                        break;
                    case 8:
                            {
                        System.out.println("Your First Question is " + firstNumber
                                + " + " + secondNumber);
                        byte firstAnwser = sc.nextByte();
                        byte correctAnwser1 = (byte) (firstNumber + secondNumber);
                        if(firstAnwser == correctAnwser1)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser1);
                        }
                        System.out.println("Your Second Question is "
                                + thirdNumber + " + " + fourthNumber);
                        byte secondAnwser = sc.nextByte();
                        byte correctAnwser2 = (byte) (thirdNumber + fourthNumber);
                        if(secondAnwser == correctAnwser2)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser2);
                        }
                        System.out.println("Your Third Question is "
                                + fifthNumber + " + " + sixthNumber);
                        byte thirdAnwser = sc.nextByte();
                        byte correctAnwser3 = (byte) (fifthNumber + sixthNumber);
                        if(thirdAnwser == correctAnwser3)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser3);
                        }
                        System.out.println("Your Fourth Question is "
                                + seventhNumber + " + " + eigthNumber);
                        byte fourthAnwser = sc.nextByte();
                        byte correctAnwser4 = (byte) (seventhNumber + eigthNumber);
                        if(fourthAnwser == correctAnwser4)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser4);
                        }
                        System.out.println("Your Fifth Question is "
                                + ninthNumber + " + " + tenthNumber);
                        byte fifthhAnwser = sc.nextByte();
                        byte correctAnwser5 = (byte) (ninthNumber + tenthNumber);
                        if(fifthhAnwser == correctAnwser5)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser5);
                        }
                        System.out.println("Your Sixth Question is "
                                + eleventhNumber + " + " + twelthNumber);
                        byte sixthAnwser = sc.nextByte();
                        byte correctAnwser6 = (byte) (eleventhNumber + twelthNumber);
                        if(sixthAnwser == correctAnwser6)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser6);
                        }
                        System.out.println("Your Seventh Question is "
                                + thirteenNumber + " + " + fourteenNumber);
                        byte seventhAnwser = sc.nextByte();
                        byte correctAnwser7 = (byte) (thirteenNumber + fourteenNumber);
                        if(seventhAnwser == correctAnwser7)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser7);
                        }
                        System.out.println("Your Eighth Question is "
                                + fifteenNumber + " + " + sixteenNumber);
                        byte eighthAnwser = sc.nextByte();
                        byte correctAnwser8 = (byte) (fifteenNumber  + sixteenNumber);
                        if(eighthAnwser == correctAnwser8)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser8);
                        }
                    }
                        break;
                    case 9:
                            {
                        System.out.println("Your First Question is " + firstNumber
                                + " + " + secondNumber);
                        byte firstAnwser = sc.nextByte();
                        byte correctAnwser1 = (byte) (firstNumber + secondNumber);
                        if(firstAnwser == correctAnwser1)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser1);
                        }
                        System.out.println("Your Second Question is "
                                + thirdNumber + " + " + fourthNumber);
                        byte secondAnwser = sc.nextByte();
                        byte correctAnwser2 = (byte) (thirdNumber + fourthNumber);
                        if(secondAnwser == correctAnwser2)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser2);
                        }
                        System.out.println("Your Third Question is "
                                + fifthNumber + " + " + sixthNumber);
                        byte thirdAnwser = sc.nextByte();
                        byte correctAnwser3 = (byte) (fifthNumber + sixthNumber);
                        if(thirdAnwser == correctAnwser3)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser3);
                        }
                        System.out.println("Your Fourth Question is "
                                + seventhNumber + " + " + eigthNumber);
                        byte fourthAnwser = sc.nextByte();
                        byte correctAnwser4 = (byte) (seventhNumber + eigthNumber);
                        if(fourthAnwser == correctAnwser4)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser4);
                        }
                        System.out.println("Your Fifth Question is "
                                + ninthNumber + " + " + tenthNumber);
                        byte fifthhAnwser = sc.nextByte();
                        byte correctAnwser5 = (byte) (ninthNumber + tenthNumber);
                        if(fifthhAnwser == correctAnwser5)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser5);
                        }
                        System.out.println("Your Sixth Question is "
                                + eleventhNumber + " + " + twelthNumber);
                        byte sixthAnwser = sc.nextByte();
                        byte correctAnwser6 = (byte) (eleventhNumber + twelthNumber);
                        if(sixthAnwser == correctAnwser6)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser6);
                        }
                        System.out.println("Your Seventh Question is "
                                + thirteenNumber + " + " + fourteenNumber);
                        byte seventhAnwser = sc.nextByte();
                        byte correctAnwser7 = (byte) (thirteenNumber + fourteenNumber);
                        if(seventhAnwser == correctAnwser7)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser7);
                        }
                        System.out.println("Your Eighth Question is "
                                + fifteenNumber + " + " + sixteenNumber);
                        byte eighthAnwser = sc.nextByte();
                        byte correctAnwser8 = (byte) (fifteenNumber  + sixteenNumber);
                        if(eighthAnwser == correctAnwser8)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser8);
                        }
                        System.out.println("Your Ninth Question is "
                                + seventeenNumber  + " + " + eigthteenNumber );
                        byte ninthAnwser = sc.nextByte();
                        byte correctAnwser9 = (byte) (seventeenNumber + eigthteenNumber);
                        if(eighthAnwser == correctAnwser9)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser9);
                        }
                    }
                        break;
                    default:
                                {
                        System.out.println("Your First Question is " + firstNumber
                                + " + " + secondNumber);
                        byte firstAnwser = sc.nextByte();
                        byte correctAnwser1 = (byte) (firstNumber + secondNumber);
                        if(firstAnwser == correctAnwser1)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser1);
                        }
                        System.out.println("Your Second Question is "
                                + thirdNumber + " + " + fourthNumber);
                        byte secondAnwser = sc.nextByte();
                        byte correctAnwser2 = (byte) (thirdNumber + fourthNumber);
                        if(secondAnwser == correctAnwser2)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser2);
                        }
                        System.out.println("Your Third Question is "
                                + fifthNumber + " + " + sixthNumber);
                        byte thirdAnwser = sc.nextByte();
                        byte correctAnwser3 = (byte) (fifthNumber + sixthNumber);
                        if(thirdAnwser == correctAnwser3)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser3);
                        }
                        System.out.println("Your Fourth Question is "
                                + seventhNumber + " + " + eigthNumber);
                        byte fourthAnwser = sc.nextByte();
                        byte correctAnwser4 = (byte) (seventhNumber + eigthNumber);
                        if(fourthAnwser == correctAnwser4)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser4);
                        }
                        System.out.println("Your Fifth Question is "
                                + ninthNumber + " + " + tenthNumber);
                        byte fifthhAnwser = sc.nextByte();
                        byte correctAnwser5 = (byte) (ninthNumber + tenthNumber);
                        if(fifthhAnwser == correctAnwser5)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser5);
                        }
                        System.out.println("Your Sixth Question is "
                                + eleventhNumber + " + " + twelthNumber);
                        byte sixthAnwser = sc.nextByte();
                        byte correctAnwser6 = (byte) (eleventhNumber + twelthNumber);
                        if(sixthAnwser == correctAnwser6)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser6);
                        }
                        System.out.println("Your Seventh Question is "
                                + thirteenNumber + " + " + fourteenNumber);
                        byte seventhAnwser = sc.nextByte();
                        byte correctAnwser7 = (byte) (thirteenNumber + fourteenNumber);
                        if(seventhAnwser == correctAnwser7)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser7);
                        }
                        System.out.println("Your Eighth Question is "
                                + fifteenNumber + " + " + sixteenNumber);
                        byte eighthAnwser = sc.nextByte();
                        byte correctAnwser8 = (byte) (fifteenNumber  + sixteenNumber);
                        if(eighthAnwser == correctAnwser8)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser8);
                        }
                        System.out.println("Your Ninth Question is "
                                + seventeenNumber  + " + " + eigthteenNumber );
                        byte ninthAnwser = sc.nextByte();
                        byte correctAnwser9 = (byte) (seventeenNumber + eigthteenNumber);
                        if(eighthAnwser == correctAnwser9)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser9);
                        }
                        System.out.println("Your Tenth Question is "
                                + ninteenNumber + " + " + twenthNumber);
                        byte tenthAnwser = sc.nextByte();
                        byte correctAnwser10 = (byte) (ninteenNumber + twenthNumber);
                        if(eighthAnwser == correctAnwser10)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser10);
                        }
                    }
                        break;
                }   break;
            case 'M':
        switch ((int)selectedAmount) {
            case 1:
                {
                    System.out.println("Your First Question is " + firstNumber
                            + " * " + secondNumber);
                    byte firstAnwser = sc.nextByte();
                    byte correctAnwser1 = (byte) (firstNumber * secondNumber);
                    if(firstAnwser == correctAnwser1)
                    {
                        System.out.println("Correct!");
                        finalGrade++;;
                    }
                    else
                    {
                        System.out.println("Incorrect!");   
                    }
                    break;
                }
            case 2:
                {
                    System.out.println("Your First Question is " + firstNumber
                            + " * " + secondNumber);
                    byte firstAnwser = sc.nextByte();
                    byte correctAnwser1 = (byte) (firstNumber * secondNumber);
                    if(firstAnwser == correctAnwser1)
                    {
                        System.out.println("Correct!");
                        finalGrade++;
                    }
                    else
                    {
                        System.out.println("Incorrect!");
                    }
                    System.out.println("Your Second Question is "
                            + thirdNumber + " * " + fourthNumber);
                    byte secondAnwser = sc.nextByte();
                    byte correctAnwser2 = (byte) (thirdNumber * fourthNumber);
                    if(secondAnwser == correctAnwser2)
                    {
                        System.out.println("Correct!");
                        finalGrade++;
                    }
                    else
                    {
                        System.out.println("Incorrect!");
                    }                     
                    break;
                }
            case 3:
                    {
                        System.out.println("Your First Question is " + firstNumber
                                + " * " + secondNumber);
                        byte firstAnwser = sc.nextByte();
                        byte correctAnwser1 = (byte) (firstNumber * secondNumber);
                        if(firstAnwser == correctAnwser1)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                            
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser1);
                        }
                        System.out.println("Your Second Question is "
                                + thirdNumber + " * " + fourthNumber);
                        byte secondAnwser = sc.nextByte();
                        byte correctAnwser2 = (byte) (thirdNumber * fourthNumber);
                        if(secondAnwser == correctAnwser2)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser2);
                        }
                        System.out.println("Your Third Question is "
                                + fifthNumber + " * " + sixthNumber);
                        byte thirdAnwser = sc.nextByte();
                        byte correctAnwser3 = (byte) (fifthNumber * sixthNumber);
                        if(thirdAnwser == correctAnwser3)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser3);
                        }
                        break;
                    }
                    case 4:
                    {
                        System.out.println("Your First Question is " + firstNumber
                                + " * " + secondNumber);
                        byte firstAnwser = sc.nextByte();
                        byte correctAnwser1 = (byte) (firstNumber * secondNumber);
                        if(firstAnwser == correctAnwser1)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");   
                            System.out.println("It actually was " 
                                    + correctAnwser1);
                        }
                        System.out.println("Your Second Question is "
                                + thirdNumber + " * " + fourthNumber);
                        byte secondAnwser = sc.nextByte();
                        byte correctAnwser2 = (byte) (thirdNumber * fourthNumber);
                        if(secondAnwser == correctAnwser2)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser2);
                        }
                        System.out.println("Your Third Question is "
                                + fifthNumber + " * " + sixthNumber);
                        byte thirdAnwser = sc.nextByte();
                        byte correctAnwser3 = (byte) (fifthNumber * sixthNumber);
                        if(thirdAnwser == correctAnwser3)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser3);
                        }
                        System.out.println("Your Fourth Question is "
                                + seventhNumber + " * " + eigthNumber);
                        byte fourthAnwser = sc.nextByte();
                        byte correctAnwser4 = (byte) (seventhNumber * eigthNumber);
                        if(fourthAnwser == correctAnwser4)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser4);
                        }
                        break;
                    }
                    case 5:
                        {
                        System.out.println("Your First Question is " + firstNumber
                                + " * " + secondNumber);
                        byte firstAnwser = sc.nextByte();
                        byte correctAnwser1 = (byte) (firstNumber * secondNumber);
                        if(firstAnwser == correctAnwser1)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser1);
                        }
                        System.out.println("Your Second Question is "
                                + thirdNumber + " * " + fourthNumber);
                        byte secondAnwser = sc.nextByte();
                        byte correctAnwser2 = (byte) (thirdNumber * fourthNumber);
                        if(secondAnwser == correctAnwser2)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser2);
                        }
                        System.out.println("Your Third Question is "
                                + fifthNumber + " * " + sixthNumber);
                        byte thirdAnwser = sc.nextByte();
                        byte correctAnwser3 = (byte) (fifthNumber * sixthNumber);
                        if(thirdAnwser == correctAnwser3)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser3);
                        }
                        System.out.println("Your Fourth Question is "
                                + seventhNumber + " * " + eigthNumber);
                        byte fourthAnwser = sc.nextByte();
                        byte correctAnwser4 = (byte) (seventhNumber * eigthNumber);
                        if(fourthAnwser == correctAnwser4)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser4);
                        }
                        System.out.println("Your Fifth Question is "
                                + ninthNumber + " * " + tenthNumber);
                        byte fifthhAnwser = sc.nextByte();
                        byte correctAnwser5 = (byte) (ninthNumber * tenthNumber);
                        if(fifthhAnwser == correctAnwser5)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser5);
                        }
                    }
                        break;
                    case 6:
                        {
                        System.out.println("Your First Question is " + firstNumber
                                + " * " + secondNumber);
                        byte firstAnwser = sc.nextByte();
                        byte correctAnwser1 = (byte) (firstNumber * secondNumber);
                        if(firstAnwser == correctAnwser1)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser1);
                        }
                        System.out.println("Your Second Question is "
                                + thirdNumber + " * " + fourthNumber);
                        byte secondAnwser = sc.nextByte();
                        byte correctAnwser2 = (byte) (thirdNumber * fourthNumber);
                        if(secondAnwser == correctAnwser2)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser2);
                        }
                        System.out.println("Your Third Question is "
                                + fifthNumber + " * " + sixthNumber);
                        byte thirdAnwser = sc.nextByte();
                        byte correctAnwser3 = (byte) (fifthNumber * sixthNumber);
                        if(thirdAnwser == correctAnwser3)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser3);
                        }
                        System.out.println("Your Fourth Question is "
                                + seventhNumber + " * " + eigthNumber);
                        byte fourthAnwser = sc.nextByte();
                        byte correctAnwser4 = (byte) (seventhNumber * eigthNumber);
                        if(fourthAnwser == correctAnwser4)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser4);
                        }
                        System.out.println("Your Fifth Question is "
                                + ninthNumber + " * " + tenthNumber);
                        byte fifthhAnwser = sc.nextByte();
                        byte correctAnwser5 = (byte) (ninthNumber * tenthNumber);
                        if(fifthhAnwser == correctAnwser5)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser5);
                        }
                        System.out.println("Your Sixth Question is "
                                + eleventhNumber + " * " + twelthNumber);
                        byte sixthAnwser = sc.nextByte();
                        byte correctAnwser6 = (byte) (eleventhNumber * twelthNumber);
                        if(sixthAnwser == correctAnwser6)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser6);
                        }
                    }
                        break;
                    case 7:
                            {
                        System.out.println("Your First Question is " + firstNumber
                                + " * " + secondNumber);
                        byte firstAnwser = sc.nextByte();
                        byte correctAnwser1 = (byte) (firstNumber * secondNumber);
                        if(firstAnwser == correctAnwser1)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser1);
                        }
                        System.out.println("Your Second Question is "
                                + thirdNumber + " * " + fourthNumber);
                        byte secondAnwser = sc.nextByte();
                        byte correctAnwser2 = (byte) (thirdNumber * fourthNumber);
                        if(secondAnwser == correctAnwser2)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser2);
                        }
                        System.out.println("Your Third Question is "
                                + fifthNumber + " * " + sixthNumber);
                        byte thirdAnwser = sc.nextByte();
                        byte correctAnwser3 = (byte) (fifthNumber * sixthNumber);
                        if(thirdAnwser == correctAnwser3)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser3);
                        }
                        System.out.println("Your Fourth Question is "
                                + seventhNumber + " * " + eigthNumber);
                        byte fourthAnwser = sc.nextByte();
                        byte correctAnwser4 = (byte) (seventhNumber * eigthNumber);
                        if(fourthAnwser == correctAnwser4)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser4);
                        }
                        System.out.println("Your Fifth Question is "
                                + ninthNumber + " * " + tenthNumber);
                        byte fifthhAnwser = sc.nextByte();
                        byte correctAnwser5 = (byte) (ninthNumber * tenthNumber);
                        if(fifthhAnwser == correctAnwser5)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser5);
                        }
                        System.out.println("Your Sixth Question is "
                                + eleventhNumber + " * " + twelthNumber);
                        byte sixthAnwser = sc.nextByte();
                        byte correctAnwser6 = (byte) (eleventhNumber * twelthNumber);
                        if(sixthAnwser == correctAnwser6)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser6);
                        }
                        System.out.println("Your Seventh Question is "
                                + thirteenNumber + " * " + fourteenNumber);
                        byte seventhAnwser = sc.nextByte();
                        byte correctAnwser7 = (byte) (thirteenNumber * fourteenNumber);
                        if(seventhAnwser == correctAnwser7)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser7);
                        }
                    }
                        break;
                    case 8:
                            {
                        System.out.println("Your First Question is " + firstNumber
                                + " * " + secondNumber);
                        byte firstAnwser = sc.nextByte();
                        byte correctAnwser1 = (byte) (firstNumber * secondNumber);
                        if(firstAnwser == correctAnwser1)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser1);
                        }
                        System.out.println("Your Second Question is "
                                + thirdNumber + " * " + fourthNumber);
                        byte secondAnwser = sc.nextByte();
                        byte correctAnwser2 = (byte) (thirdNumber * fourthNumber);
                        if(secondAnwser == correctAnwser2)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser2);
                        }
                        System.out.println("Your Third Question is "
                                + fifthNumber + " * " + sixthNumber);
                        byte thirdAnwser = sc.nextByte();
                        byte correctAnwser3 = (byte) (fifthNumber * sixthNumber);
                        if(thirdAnwser == correctAnwser3)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser3);
                        }
                        System.out.println("Your Fourth Question is "
                                + seventhNumber + " * " + eigthNumber);
                        byte fourthAnwser = sc.nextByte();
                        byte correctAnwser4 = (byte) (seventhNumber * eigthNumber);
                        if(fourthAnwser == correctAnwser4)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser4);
                        }
                        System.out.println("Your Fifth Question is "
                                + ninthNumber + " * " + tenthNumber);
                        byte fifthhAnwser = sc.nextByte();
                        byte correctAnwser5 = (byte) (ninthNumber * tenthNumber);
                        if(fifthhAnwser == correctAnwser5)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser5);
                        }
                        System.out.println("Your Sixth Question is "
                                + eleventhNumber + " * " + twelthNumber);
                        byte sixthAnwser = sc.nextByte();
                        byte correctAnwser6 = (byte) (eleventhNumber * twelthNumber);
                        if(sixthAnwser == correctAnwser6)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser6);
                        }
                        System.out.println("Your Seventh Question is "
                                + thirteenNumber + " * " + fourteenNumber);
                        byte seventhAnwser = sc.nextByte();
                        byte correctAnwser7 = (byte) (thirteenNumber * fourteenNumber);
                        if(seventhAnwser == correctAnwser7)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser7);
                        }
                        System.out.println("Your Eighth Question is "
                                + fifteenNumber + " * " + sixteenNumber);
                        byte eighthAnwser = sc.nextByte();
                        byte correctAnwser8 = (byte) (fifteenNumber  * sixteenNumber);
                        if(eighthAnwser == correctAnwser8)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser8);
                        }
                    }
                        break;
                    case 9:
                            {
                        System.out.println("Your First Question is " + firstNumber
                                + " * " + secondNumber);
                        byte firstAnwser = sc.nextByte();
                        byte correctAnwser1 = (byte) (firstNumber * secondNumber);
                        if(firstAnwser == correctAnwser1)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser1);
                        }
                        System.out.println("Your Second Question is "
                                + thirdNumber + " * " + fourthNumber);
                        byte secondAnwser = sc.nextByte();
                        byte correctAnwser2 = (byte) (thirdNumber * fourthNumber);
                        if(secondAnwser == correctAnwser2)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser2);
                        }
                        System.out.println("Your Third Question is "
                                + fifthNumber + " * " + sixthNumber);
                        byte thirdAnwser = sc.nextByte();
                        byte correctAnwser3 = (byte) (fifthNumber * sixthNumber);
                        if(thirdAnwser == correctAnwser3)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser3);
                        }
                        System.out.println("Your Fourth Question is "
                                + seventhNumber + " * " + eigthNumber);
                        byte fourthAnwser = sc.nextByte();
                        byte correctAnwser4 = (byte) (seventhNumber * eigthNumber);
                        if(fourthAnwser == correctAnwser4)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser4);
                        }
                        System.out.println("Your Fifth Question is "
                                + ninthNumber + " * " + tenthNumber);
                        byte fifthhAnwser = sc.nextByte();
                        byte correctAnwser5 = (byte) (ninthNumber * tenthNumber);
                        if(fifthhAnwser == correctAnwser5)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser5);
                        }
                        System.out.println("Your Sixth Question is "
                                + eleventhNumber + " * " + twelthNumber);
                        byte sixthAnwser = sc.nextByte();
                        byte correctAnwser6 = (byte) (eleventhNumber * twelthNumber);
                        if(sixthAnwser == correctAnwser6)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser6);
                        }
                        System.out.println("Your Seventh Question is "
                                + thirteenNumber + " * " + fourteenNumber);
                        byte seventhAnwser = sc.nextByte();
                        byte correctAnwser7 = (byte) (thirteenNumber * fourteenNumber);
                        if(seventhAnwser == correctAnwser7)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser7);
                        }
                        System.out.println("Your Eighth Question is "
                                + fifteenNumber + " * " + sixteenNumber);
                        byte eighthAnwser = sc.nextByte();
                        byte correctAnwser8 = (byte) (fifteenNumber  * sixteenNumber);
                        if(eighthAnwser == correctAnwser8)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser8);
                        }
                        System.out.println("Your Ninth Question is "
                                + seventeenNumber  + " * " + eigthteenNumber );
                        byte ninthAnwser = sc.nextByte();
                        byte correctAnwser9 = (byte) (seventeenNumber * eigthteenNumber);
                        if(eighthAnwser == correctAnwser9)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser9);
                        }
                    }
                        break;
                    default:
                                {
                        System.out.println("Your First Question is " + firstNumber
                                + " * " + secondNumber);
                        byte firstAnwser = sc.nextByte();
                        byte correctAnwser1 = (byte) (firstNumber * secondNumber);
                        if(firstAnwser == correctAnwser1)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser1);
                        }
                        System.out.println("Your Second Question is "
                                + thirdNumber + " * " + fourthNumber);
                        byte secondAnwser = sc.nextByte();
                        byte correctAnwser2 = (byte) (thirdNumber * fourthNumber);
                        if(secondAnwser == correctAnwser2)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser2);
                        }
                        System.out.println("Your Third Question is "
                                + fifthNumber + " * " + sixthNumber);
                        byte thirdAnwser = sc.nextByte();
                        byte correctAnwser3 = (byte) (fifthNumber * sixthNumber);
                        if(thirdAnwser == correctAnwser3)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser3);
                        }
                        System.out.println("Your Fourth Question is "
                                + seventhNumber + " * " + eigthNumber);
                        byte fourthAnwser = sc.nextByte();
                        byte correctAnwser4 = (byte) (seventhNumber * eigthNumber);
                        if(fourthAnwser == correctAnwser4)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser4);
                        }
                        System.out.println("Your Fifth Question is "
                                + ninthNumber + " * " + tenthNumber);
                        byte fifthhAnwser = sc.nextByte();
                        byte correctAnwser5 = (byte) (ninthNumber * tenthNumber);
                        if(fifthhAnwser == correctAnwser5)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser5);
                        }
                        System.out.println("Your Sixth Question is "
                                + eleventhNumber + " * " + twelthNumber);
                        byte sixthAnwser = sc.nextByte();
                        byte correctAnwser6 = (byte) (eleventhNumber * twelthNumber);
                        if(sixthAnwser == correctAnwser6)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser6);
                        }
                        System.out.println("Your Seventh Question is "
                                + thirteenNumber + " * " + fourteenNumber);
                        byte seventhAnwser = sc.nextByte();
                        byte correctAnwser7 = (byte) (thirteenNumber * fourteenNumber);
                        if(seventhAnwser == correctAnwser7)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser7);
                        }
                        System.out.println("Your Eighth Question is "
                                + fifteenNumber + " * " + sixteenNumber);
                        byte eighthAnwser = sc.nextByte();
                        byte correctAnwser8 = (byte) (fifteenNumber  * sixteenNumber);
                        if(eighthAnwser == correctAnwser8)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser8);
                        }
                        System.out.println("Your Ninth Question is "
                                + seventeenNumber  + " * " + eigthteenNumber );
                        byte ninthAnwser = sc.nextByte();
                        byte correctAnwser9 = (byte) (seventeenNumber * eigthteenNumber);
                        if(eighthAnwser == correctAnwser9)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser9);
                        }
                        System.out.println("Your Tenth Question is "
                                + ninteenNumber + " * " + twenthNumber);
                        byte tenthAnwser = sc.nextByte();
                        byte correctAnwser10 = (byte) (ninteenNumber * twenthNumber);
                        if(tenthAnwser == correctAnwser10)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser10);
                        }
                    }
                        break;
        }
        break;
            case 'S':{
        switch ((int)selectedAmount) {
            case 1:
                {
                    System.out.println("Your First Question is " + firstNumber
                            + " - " + secondNumber);
                    byte firstAnwser = sc.nextByte();
                    byte correctAnwser1 = (byte) (firstNumber - secondNumber);
                    if(firstAnwser == correctAnwser1)
                    {
                        System.out.println("Correct!");
                        finalGrade++;
                    }
                    else
                    {
                        System.out.println("Incorrect!");
                    }
                    break;
                }
            case 2:
                {
                    System.out.println("Your First Question is " + firstNumber
                            + " - " + secondNumber);
                    byte firstAnwser = sc.nextByte();
                    byte correctAnwser1 = (byte) (firstNumber - secondNumber);
                    if(firstAnwser == correctAnwser1)
                    {
                        System.out.println("Correct!");
                        finalGrade++;
                    }
                    else
                    {
                        System.out.println("Incorrect!");
                    }
                    System.out.println("Your Second Question is "
                            + thirdNumber + " - " + fourthNumber);
                    byte secondAnwser = sc.nextByte();
                    byte correctAnwser2 = (byte) (thirdNumber - fourthNumber);
                    if(secondAnwser == correctAnwser2)
                    {
                        System.out.println("Correct!");
                        finalGrade++;
                    }
                    else
                    {
                        System.out.println("Incorrect!");
                    }
                    break;
                }
            case 3:
                    {
                        System.out.println("Your First Question is " + firstNumber
                                + " - " + secondNumber);
                        byte firstAnwser = sc.nextByte();
                        byte correctAnwser1 = (byte) (firstNumber - secondNumber);
                        if(firstAnwser == correctAnwser1)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                            
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser1);
                        }
                        System.out.println("Your Second Question is "
                                + thirdNumber + " - " + fourthNumber);
                        byte secondAnwser = sc.nextByte();
                        byte correctAnwser2 = (byte) (thirdNumber - fourthNumber);
                        if(secondAnwser == correctAnwser2)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser2);
                        }
                        System.out.println("Your Third Question is "
                                + fifthNumber + " - " + sixthNumber);
                        byte thirdAnwser = sc.nextByte();
                        byte correctAnwser3 = (byte) (fifthNumber - sixthNumber);
                        if(thirdAnwser == correctAnwser3)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser3);
                        }
                        break;
                    }
                    case 4:
                    {
                        System.out.println("Your First Question is " + firstNumber
                                + " - " + secondNumber);
                        byte firstAnwser = sc.nextByte();
                        byte correctAnwser1 = (byte) (firstNumber - secondNumber);
                        if(firstAnwser == correctAnwser1)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                            
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser1);
                        }
                        System.out.println("Your Second Question is "
                                + thirdNumber + " - " + fourthNumber);
                        byte secondAnwser = sc.nextByte();
                        byte correctAnwser2 = (byte) (thirdNumber - fourthNumber);
                        if(secondAnwser == correctAnwser2)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser2);
                        }
                        System.out.println("Your Third Question is "
                                + fifthNumber + "-" + sixthNumber);
                        byte thirdAnwser = sc.nextByte();
                        byte correctAnwser3 = (byte) (fifthNumber - sixthNumber);
                        if(thirdAnwser == correctAnwser3)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser3);
                        }
                        System.out.println("Your Fourth Question is "
                                + seventhNumber + " - " + eigthNumber);
                        byte fourthAnwser = sc.nextByte();
                        byte correctAnwser4 = (byte) (seventhNumber - eigthNumber);
                        if(fourthAnwser == correctAnwser4)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser4);
                        }
                        break;
                    }
                    case 5:
                        {
                        System.out.println("Your First Question is " + firstNumber
                                + " - " + secondNumber);
                        byte firstAnwser = sc.nextByte();
                        byte correctAnwser1 = (byte) (firstNumber - secondNumber);
                        if(firstAnwser == correctAnwser1)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser1);
                        }
                        System.out.println("Your Second Question is "
                                + thirdNumber + " - " + fourthNumber);
                        byte secondAnwser = sc.nextByte();
                        byte correctAnwser2 = (byte) (thirdNumber - fourthNumber);
                        if(secondAnwser == correctAnwser2)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser2);
                        }
                        System.out.println("Your Third Question is "
                                + fifthNumber + " - " + sixthNumber);
                        byte thirdAnwser = sc.nextByte();
                        byte correctAnwser3 = (byte) (fifthNumber - sixthNumber);
                        if(thirdAnwser == correctAnwser3)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser3);
                        }
                        System.out.println("Your Fourth Question is "
                                + seventhNumber + " - " + eigthNumber);
                        byte fourthAnwser = sc.nextByte();
                        byte correctAnwser4 = (byte) (seventhNumber - eigthNumber);
                        if(fourthAnwser == correctAnwser4)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser4);
                        }
                        System.out.println("Your Fifth Question is "
                                + ninthNumber + " - " + tenthNumber);
                        byte fifthhAnwser = sc.nextByte();
                        byte correctAnwser5 = (byte) (ninthNumber - tenthNumber);
                        if(fifthhAnwser == correctAnwser5)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser5);
                        }
                    }
                        break;
                    case 6:
                        {
                        System.out.println("Your First Question is " + firstNumber
                                + " - " + secondNumber);
                        byte firstAnwser = sc.nextByte();
                        byte correctAnwser1 = (byte) (firstNumber - secondNumber);
                        if(firstAnwser == correctAnwser1)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser1);
                        }
                        System.out.println("Your Second Question is "
                                + thirdNumber + " - " + fourthNumber);
                        byte secondAnwser = sc.nextByte();
                        byte correctAnwser2 = (byte) (thirdNumber - fourthNumber);
                        if(secondAnwser == correctAnwser2)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser2);
                        }
                        System.out.println("Your Third Question is "
                                + fifthNumber + " - " + sixthNumber);
                        byte thirdAnwser = sc.nextByte();
                        byte correctAnwser3 = (byte) (fifthNumber - sixthNumber);
                        if(thirdAnwser == correctAnwser3)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser3);
                        }
                        System.out.println("Your Fourth Question is "
                                + seventhNumber + " - " + eigthNumber);
                        byte fourthAnwser = sc.nextByte();
                        byte correctAnwser4 = (byte) (seventhNumber - eigthNumber);
                        if(fourthAnwser == correctAnwser4)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser4);
                        }
                        System.out.println("Your Fifth Question is "
                                + ninthNumber + " - " + tenthNumber);
                        byte fifthhAnwser = sc.nextByte();
                        byte correctAnwser5 = (byte) (ninthNumber - tenthNumber);
                        if(fifthhAnwser == correctAnwser5)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser5);
                        }
                        System.out.println("Your Sixth Question is "
                                + eleventhNumber + " - " + twelthNumber);
                        byte sixthAnwser = sc.nextByte();
                        byte correctAnwser6 = (byte) (eleventhNumber - twelthNumber);
                        if(sixthAnwser == correctAnwser6)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser6);
                        }
                    }
                        break;
                    case 7:
                            {
                        System.out.println("Your First Question is " + firstNumber
                                + " - " + secondNumber);
                        byte firstAnwser = sc.nextByte();
                        byte correctAnwser1 = (byte) (firstNumber - secondNumber);
                        if(firstAnwser == correctAnwser1)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser1);
                        }
                        System.out.println("Your Second Question is "
                                + thirdNumber + " - " + fourthNumber);
                        byte secondAnwser = sc.nextByte();
                        byte correctAnwser2 = (byte) (thirdNumber - fourthNumber);
                        if(secondAnwser == correctAnwser2)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser2);
                        }
                        System.out.println("Your Third Question is "
                                + fifthNumber + " - " + sixthNumber);
                        byte thirdAnwser = sc.nextByte();
                        byte correctAnwser3 = (byte) (fifthNumber - sixthNumber);
                        if(thirdAnwser == correctAnwser3)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser3);
                        }
                        System.out.println("Your Fourth Question is "
                                + seventhNumber + " - " + eigthNumber);
                        byte fourthAnwser = sc.nextByte();
                        byte correctAnwser4 = (byte) (seventhNumber - eigthNumber);
                        if(fourthAnwser == correctAnwser4)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser4);
                        }
                        System.out.println("Your Fifth Question is "
                                + ninthNumber + " - " + tenthNumber);
                        byte fifthhAnwser = sc.nextByte();
                        byte correctAnwser5 = (byte) (ninthNumber - tenthNumber);
                        if(fifthhAnwser == correctAnwser5)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser5);
                        }
                        System.out.println("Your Sixth Question is "
                                + eleventhNumber + " - " + twelthNumber);
                        byte sixthAnwser = sc.nextByte();
                        byte correctAnwser6 = (byte) (eleventhNumber - twelthNumber);
                        if(sixthAnwser == correctAnwser6)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser6);
                        }
                        System.out.println("Your Seventh Question is "
                                + thirteenNumber + " - " + fourteenNumber);
                        byte seventhAnwser = sc.nextByte();
                        byte correctAnwser7 = (byte) (thirteenNumber - fourteenNumber);
                        if(seventhAnwser == correctAnwser7)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser7);
                        }
                    }
                        break;
                    case 8:
                            {
                        System.out.println("Your First Question is " + firstNumber
                                + " - " + secondNumber);
                        byte firstAnwser = sc.nextByte();
                        byte correctAnwser1 = (byte) (firstNumber - secondNumber);
                        if(firstAnwser == correctAnwser1)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser1);
                        }
                        System.out.println("Your Second Question is "
                                + thirdNumber + " - " + fourthNumber);
                        byte secondAnwser = sc.nextByte();
                        byte correctAnwser2 = (byte) (thirdNumber - fourthNumber);
                        if(secondAnwser == correctAnwser2)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser2);
                        }
                        System.out.println("Your Third Question is "
                                + fifthNumber + " - " + sixthNumber);
                        byte thirdAnwser = sc.nextByte();
                        byte correctAnwser3 = (byte) (fifthNumber - sixthNumber);
                        if(thirdAnwser == correctAnwser3)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser3);
                        }
                        System.out.println("Your Fourth Question is "
                                + seventhNumber + " - " + eigthNumber);
                        byte fourthAnwser = sc.nextByte();
                        byte correctAnwser4 = (byte) (seventhNumber - eigthNumber);
                        if(fourthAnwser == correctAnwser4)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser4);
                        }
                        System.out.println("Your Fifth Question is "
                                + ninthNumber + " - " + tenthNumber);
                        byte fifthhAnwser = sc.nextByte();
                        byte correctAnwser5 = (byte) (ninthNumber - tenthNumber);
                        if(fifthhAnwser == correctAnwser5)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser5);
                        }
                        System.out.println("Your Sixth Question is "
                                + eleventhNumber + " - " + twelthNumber);
                        byte sixthAnwser = sc.nextByte();
                        byte correctAnwser6 = (byte) (eleventhNumber - twelthNumber);
                        if(sixthAnwser == correctAnwser6)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser6);
                        }
                        System.out.println("Your Seventh Question is "
                                + thirteenNumber + " - " + fourteenNumber);
                        byte seventhAnwser = sc.nextByte();
                        byte correctAnwser7 = (byte) (thirteenNumber - fourteenNumber);
                        if(seventhAnwser == correctAnwser7)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser7);
                        }
                        System.out.println("Your Eighth Question is "
                                + fifteenNumber + " - " + sixteenNumber);
                        byte eighthAnwser = sc.nextByte();
                        byte correctAnwser8 = (byte) (fifteenNumber - sixteenNumber);
                        if(eighthAnwser == correctAnwser8)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser8);
                        }
                    }
                        break;
                    case 9:
                            {
                        System.out.println("Your First Question is " + firstNumber
                                + " - " + secondNumber);
                        byte firstAnwser = sc.nextByte();
                        byte correctAnwser1 = (byte) (firstNumber - secondNumber);
                        if(firstAnwser == correctAnwser1)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser1);
                        }
                        System.out.println("Your Second Question is "
                                + thirdNumber + " - " + fourthNumber);
                        byte secondAnwser = sc.nextByte();
                        byte correctAnwser2 = (byte) (thirdNumber - fourthNumber);
                        if(secondAnwser == correctAnwser2)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser2);
                        }
                        System.out.println("Your Third Question is "
                                + fifthNumber + " - " + sixthNumber);
                        byte thirdAnwser = sc.nextByte();
                        byte correctAnwser3 = (byte) (fifthNumber - sixthNumber);
                        if(thirdAnwser == correctAnwser3)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser3);
                        }
                        System.out.println("Your Fourth Question is "
                                + seventhNumber + " - " + eigthNumber);
                        byte fourthAnwser = sc.nextByte();
                        byte correctAnwser4 = (byte) (seventhNumber - eigthNumber);
                        if(fourthAnwser == correctAnwser4)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser4);
                        }
                        System.out.println("Your Fifth Question is "
                                + ninthNumber + " - " + tenthNumber);
                        byte fifthhAnwser = sc.nextByte();
                        byte correctAnwser5 = (byte) (ninthNumber - tenthNumber);
                        if(fifthhAnwser == correctAnwser5)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser5);
                        }
                        System.out.println("Your Sixth Question is "
                                + eleventhNumber + " - " + twelthNumber);
                        byte sixthAnwser = sc.nextByte();
                        byte correctAnwser6 = (byte) (eleventhNumber - twelthNumber);
                        if(sixthAnwser == correctAnwser6)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser6);
                        }
                        System.out.println("Your Seventh Question is "
                                + thirteenNumber + " - " + fourteenNumber);
                        byte seventhAnwser = sc.nextByte();
                        byte correctAnwser7 = (byte) (thirteenNumber - fourteenNumber);
                        if(seventhAnwser == correctAnwser7)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser7);
                        }
                        System.out.println("Your Eighth Question is "
                                + fifteenNumber + " - " + sixteenNumber);
                        byte eighthAnwser = sc.nextByte();
                        byte correctAnwser8 = (byte) (fifteenNumber  - sixteenNumber);
                        if(eighthAnwser == correctAnwser8)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser8);
                        }
                        System.out.println("Your Ninth Question is "
                                + seventeenNumber  + " - " + eigthteenNumber );
                        byte ninthAnwser = sc.nextByte();
                        byte correctAnwser9 = (byte) (seventeenNumber - eigthteenNumber);
                        if(eighthAnwser == correctAnwser9)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser9);
                        }
                    }
                        break;
                    default:
                                {
                        System.out.println("Your First Question is " + firstNumber
                                + " - " + secondNumber);
                        byte firstAnwser = sc.nextByte();
                        byte correctAnwser1 = (byte) (firstNumber - secondNumber);
                        if(firstAnwser == correctAnwser1)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser1);
                        }
                        System.out.println("Your Second Question is "
                                + thirdNumber + " - " + fourthNumber);
                        byte secondAnwser = sc.nextByte();
                        byte correctAnwser2 = (byte) (thirdNumber - fourthNumber);
                        if(secondAnwser == correctAnwser2)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser2);
                        }
                        System.out.println("Your Third Question is "
                                + fifthNumber + " - " + sixthNumber);
                        byte thirdAnwser = sc.nextByte();
                        byte correctAnwser3 = (byte) (fifthNumber - sixthNumber);
                        if(thirdAnwser == correctAnwser3)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser3);
                        }
                        System.out.println("Your Fourth Question is "
                                + seventhNumber + " - " + eigthNumber);
                        byte fourthAnwser = sc.nextByte();
                        byte correctAnwser4 = (byte) (seventhNumber - eigthNumber);
                        if(fourthAnwser == correctAnwser4)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser4);
                        }
                        System.out.println("Your Fifth Question is "
                                + ninthNumber + " - " + tenthNumber);
                        byte fifthhAnwser = sc.nextByte();
                        byte correctAnwser5 = (byte) (ninthNumber - tenthNumber);
                        if(fifthhAnwser == correctAnwser5)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser5);
                        }
                        System.out.println("Your Sixth Question is "
                                + eleventhNumber + " - " + twelthNumber);
                        byte sixthAnwser = sc.nextByte();
                        byte correctAnwser6 = (byte) (eleventhNumber - twelthNumber);
                        if(sixthAnwser == correctAnwser6)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser6);
                        }
                        System.out.println("Your Seventh Question is "
                                + thirteenNumber + " - " + fourteenNumber);
                        byte seventhAnwser = sc.nextByte();
                        byte correctAnwser7 = (byte) (thirteenNumber - fourteenNumber);
                        if(seventhAnwser == correctAnwser7)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser7);
                        }
                        System.out.println("Your Eighth Question is "
                                + fifteenNumber + " - " + sixteenNumber);
                        byte eighthAnwser = sc.nextByte();
                        byte correctAnwser8 = (byte) (fifteenNumber  - sixteenNumber);
                        if(eighthAnwser == correctAnwser8)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser8);
                        }
                        System.out.println("Your Ninth Question is "
                                + seventeenNumber  + " - " + eigthteenNumber );
                        byte ninthAnwser = sc.nextByte();
                        byte correctAnwser9 = (byte) (seventeenNumber - eigthteenNumber);
                        if(eighthAnwser == correctAnwser9)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser9);
                        }
                        System.out.println("Your Tenth Question is "
                                + ninteenNumber + " - " + twenthNumber);
                        byte tenthAnwser = sc.nextByte();
                        byte correctAnwser10 = (byte) (ninteenNumber - twenthNumber);
                        if(eighthAnwser == correctAnwser10)
                        {
                            System.out.println("Correct!");
                            finalGrade++;
                        }
                        else
                        {
                            System.out.println("Incorrect!");
                            System.out.println("It actually was " 
                                    + correctAnwser10);
                        }
                    }
                        break;  
                    }       
                       
                       
                }
            }
            System.out.println("Here is your final score");
                                            
            double letterGrade;
            letterGrade = finalGrade/selectedAmount;
            
            letterGrade = letterGrade * 100;

            switch((int)letterGrade) 
            {
                case 100:
                case 99:
                case 98:
                case 97:
                case 96:
                case 95:
                case 94:
                case 93:
                case 92:
                case 91:
                    System.out.println("A");
                    System.out.println(letterGrade + "%");
                    break;
                case 90:
                case 89:
                case 88:
                case 87:
                case 86:
                case 85:
                case 84:
                case 83:
                case 82:
                case 81:
                    System.out.println("B");
                    System.out.println(letterGrade + "%");
                    break;
                case 80:
                case 79:
                case 78:
                case 77:
                case 76:
                case 75:
                case 74:
                case 73:
                case 72:
                case 71:
                    System.out.println("C");
                    System.out.println(letterGrade + "%");
                    break;
                case 70:
                case 69:
                case 68:
                case 67:
                case 66:
                case 65:
                case 64:
                case 63:
                case 62:
                case 61:
                    System.out.println("D");
                    System.out.println(letterGrade + "%");
                    break;
                case 60:
                case 59:
                case 58:
                case 57:
                case 56:
                case 55:
                case 54:
                case 53:
                case 52:
                case 51:
                case 50:
                case 49:
                case 48:
                case 47:
                case 46:
                case 45:
                case 44:
                case 43:
                case 42:
                case 41:
                case 40:
                case 39:
                case 38:
                case 37:
                case 36:
                case 35:
                case 34:
                case 33:
                case 32:
                case 31:
                case 30:
                case 29:
                case 28:
                case 27:
                case 26:
                case 25:
                case 24:
                case 23:
                case 22:
                case 21:
                case 20:
                case 19:
                case 18:
                case 17:
                case 16:
                case 15:
                case 14:
                case 13:
                case 12:
                case 11:
                case 10:
                case 9:
                case 8:
                case 7:
                case 6:
                case 5:
                case 4:
                case 3:
                case 2:
                case 1:
                    System.out.println("F");
                    System.out.println(letterGrade + "%");
                    break;
                case 0:
                    System.out.println("Wow, all of them? Great Job!");
                    break;
   
            }           
                    System.out.println("Wanna Play Again?"
                            + " Yes for Yes, No for No");
                   
            String wannaPlayAgain = sc.next();
           
            switch(wannaPlayAgain)
        {
            case "Yes":
                System.out.println("Woo! We are playing again!");
                playAgain = true;
                break;
            default:
                System.out.println("Goodbye!");
                playAgain = false;
                break;
        }
            
           
             
        } while(playAgain == true);                    
                   
    }

                
}
    

