/*
Name: Amarren Hopkins
Date: 4/2/26
Assingment SDC230 Pa Calculations & Unique Numbers
this class will take 10 user inputs and store them in an array to display
the number of values entered, the sum of the numbers entered
the average of the numbers entered and unique numbers following that previous formula */
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Amarren Hopkins - Week 3 PA Calculation & Unique Numbers");
        System.out.println();
        //array creation and what not
        Scanner input = new Scanner(System.in);
        int [] numbers = new int[10];
        ArrayList<Integer> uniqueNums = new ArrayList<>();
        int counter = 0; //loop variable
        //introduction message 
        
        //while loop
        while (counter < numbers.length){
            System.out.println("Enter an integer value "+ (counter + 1) + ": ");
            numbers[counter] = input.nextInt();
            //adds unique numbers (had to look this one up had no idea how to do it)
            if(!uniqueNums.contains(numbers[counter])){
                uniqueNums.add(numbers[counter]);
            }
            counter++; //loop increase 
        }
        //Displaying the info (it's a lot)
        System.out.println("The count of the integers is : "+ numbers.length);
        int arraySum = sum(numbers);
        System.out.println("The sum of the integers is : " + arraySum);
        System.out.println("The average of integers is : "+ (double) arraySum / numbers.length);
        //displaying unqiue numbers
        System.out.println("\n The count of unique integers is:  "+ uniqueNums.size());
        int listSum = sum(uniqueNums);
        System.out.println("The sum of unique integers is : "+ listSum);
        System.out.println("The average of unique integers is : "+ (double) listSum / uniqueNums.size());
    }
    public static int sum(int[] arr) {
        int total = 0; 
        int counter = 0;

        while (counter < arr.length){
            total += arr[counter];
            counter++;
        }
        return total;
    }

    //Overloaded method for the unique ones i think
    public static int sum (ArrayList<Integer> list){
        int total = 0; 
        int counter = 0;

        while (counter < list.size()) {
            total += list.get(counter);
            counter++;
        }
        return total;
    }

}
