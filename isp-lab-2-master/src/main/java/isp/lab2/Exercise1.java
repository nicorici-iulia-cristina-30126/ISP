package isp.lab2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise1 {

    /**
     * This method should generate an random number between 2 and 10 then
     * should ask user to enter that amount of numbers from keyboard and
     * store the numbers in an int array which should be returned
     *
     * @return the array of numbers read from keyboard
     */
    private static int[] getUserNumbers(int n) {
        //throw new UnsupportedOperationException();
        int v[] = new int[n];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the element of the array: ");
        for(int i = 0; i < n; i++)
        {
            v[i] = s.nextInt();
        }
        return v;
    }

    /**
     * This method should compute the arithmetical mean of the given numbers
     *
     * @param userNumbers the numbers used to calculate the arithmetical mean
     * @param n
     * @return the arithmetical mean of the given numbers
     */
    protected static double computeTheArithmeticalMean(int[] userNumbers) {
        double result = 0;
        for(int i = 0; i < userNumbers.length; i++)
        {
            result = result + userNumbers[i];
        }
        return (result/userNumbers.length);
    }

    public static void main(String[] args) {
        Random r = new Random();
        int low = 2;
        int high = 10;
        int n = r.nextInt(high-low) + low;
        System.out.println("n = " +n);
        
        int[] userNumbers = getUserNumbers(n); 
        System.out.println("Contents of the array are: "+Arrays.toString(userNumbers));
        System.out.println("Mean number is: " +computeTheArithmeticalMean(userNumbers));
    }


}
