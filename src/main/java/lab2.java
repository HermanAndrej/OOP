import java.util.Scanner;
import java.util.Random;
public class lab2 {
    public static void main(String args[]){
       /* Used for task 6 only
        Scanner read = new Scanner(System.in);
        System.out.println("How many times do you want text to be printed? ");
        int timesCount = read.nextInt();
        for(int i = 0; i < timesCount; i++){
            printText();
        } */
        Random rand = new Random();
        Scanner read = new Scanner(System.in);
        int num = rand.nextInt(101);
        System.out.println("Guess a number! ");
        int guess = 102;
        int guessCount = 0;
        while(guess != num){
            guessCount += 1;
            guess = read.nextInt();
            if(guess > num){
                System.out.println("Try a lower number, number of guesses is " + guessCount);
            }else if(guess < num){
                System.out.println("Try a higher number, number of guesses is " + guessCount);
            }else{
                System.out.println("Good job!");
            }
        }
    }

    static void task1(){
        Scanner read = new Scanner(System.in);
        while(true){
            System.out.println("Enter a password: ");
            String guess = read.nextLine();
            if(guess.equals("abba")){
                System.out.println("The secret is: Birds don't exist!");
                break;
            }
        }
    }

    static void task2(){
        int sum = 0;
        for(int i = 1; i<4; i++){
            System.out.println("Enter the " + i + ". number: ");
            Scanner read = new Scanner(System.in);
            int userInput = Integer.parseInt(read.nextLine());
            sum += userInput;
        }
        System.out.println("The sum of that 3 numbers is: " + sum);
    }

    static void task3(){
        int sum = 0;
        int userInput = 1;
        while(userInput != 0){
            System.out.println("Enter a number: ");
            Scanner read = new Scanner(System.in);
            userInput = Integer.parseInt(read.nextLine());
            sum += userInput;
            System.out.println("The current sum is: " + sum);
        }
        System.out.println("The sum of numbers you entered is: " + sum);
    }

    static void task4(){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNum = read.nextInt();
        System.out.println("Enter the last number: ");
        int lastNum = read.nextInt();
        if(firstNum >= lastNum){
            return;
        }
        while(firstNum != lastNum+1){
            System.out.println(firstNum);
            firstNum++;
        }
    }

    static void task5(){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = read.nextInt();
        int sum = 0;
        for(int i = 0; i <= num; i++){
            sum += (int) Math.pow(2, i);
        }
        System.out.println("The sum is: " + sum);
    }

    // task 6
    public static void printText(){
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }

    public static void printStars(int numOfStars){
        for(int i = 0; i < numOfStars; i++){
            System.out.print('*');
        }
    }

    public static void drawStarsPiramid(int numOfRows){
        for(int i = 0; i<numOfRows+1; i++){
            for(int j = 0; j<i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void drawStarsPiramidInverted(int numOfRows){
        for(int i = numOfRows; i>0; i--){
            for(int j = 0; j<i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void drawNumbersPiramid(int numOfRows){
        for(int i = 0; i<numOfRows+1; i++){
            for(int j = 1; j<i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void drawNumbersPiramidB(int numOfRows){
        for(int i = 0; i<numOfRows+1; i++){
            for(int j = 1; j<i+1; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

}