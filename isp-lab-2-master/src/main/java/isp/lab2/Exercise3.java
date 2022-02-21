package isp.lab2;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Exercise3 {

    public static boolean isPrimeNumber(final int number) {
        boolean flag = true;
        for(int i = 2; i <= number/2; i++)
        {
            if(number % i == 0)
            {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static int calculateSumOfDigits(int number) {
        int sum = 0;
        if(number < 100)
        {
            sum = sum + number %10 + (number/10)% 10;
        }
        else if(number >= 100 && number < 1000){
            sum = sum + number % 10 + (number/10)%10 + (number/100)%10;
        }
        return sum;
    }

   
    public static int[] getPrimeNumbersFromInterval(int a, int b) {
        int i = 0, c = a;
        while(a <= b){
            if(isPrimeNumber(a) && a != 1){
                i++;
            }
            a++;
        }
        int array[] = new int[i];
        i = 0;
        while(c <= b) {
            if(isPrimeNumber(c) && c != 1){
                array[i] = c;
                i++;
            }
            c++;
        }
        return array;
    }

    public static double calculateGeometricMean(int[] primeNumbers) {
        double product = 1;
        for(int i = 0; i < primeNumbers.length; i++)
        {
            product = product * primeNumbers[i];
        }
        double geometric_mean = (double)Math.pow(product, (double)1/primeNumbers.length);
        return geometric_mean;
    }

    public static int numberOfPNWithEvenSumOfDigits(int[] primeNumbers) {
        int i = 0;
        int result = 0;
        while(i < primeNumbers.length)
        {
            if(calculateSumOfDigits(primeNumbers[i]) % 2 == 0){
                result++;
            }
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        int a, b;
        System.out.print("a =  ");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        System.out.print("b =  ");
        b = s.nextInt();
        while(a >= b || a < 1)
        {
            System.out.println("Wrong number(a<b or a>=1)...");
            System.out.print("a =  ");
            a = s.nextInt();
        }
       
        System.out.println("The geometric mean is: " + calculateGeometricMean(getPrimeNumbersFromInterval(a, b)));
        System.out.println("The number of prime numbers which have the sum of digits an even number is: " + numberOfPNWithEvenSumOfDigits(getPrimeNumbersFromInterval(a, b)));
    }
}
