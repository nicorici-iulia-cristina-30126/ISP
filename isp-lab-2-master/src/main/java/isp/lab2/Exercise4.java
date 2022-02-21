package isp.lab2;

public class Exercise4 {

    
    public static boolean isPrimeNumber(final int number) {
        boolean flag = true;
        for(int i = 2; i <= number/2; i++)
        {
            if(number % i == 0){
                flag = false;
                break;
            }
        }
        return flag;
    }

   
    public static int firstOdd(int[] someNumbers) {
        int i, result = 0;
        for(i = 0; i < someNumbers.length; i++)
        {
            if(someNumbers[i] % 2 != 0){
                System.out.println("The position of first odd number from vector is: " + i);
                result = someNumbers[i];
                break;
            }
        }
        return result;
    }

    
    public static int firstEven(int[] someNumbers) {
        int i, result = 0;
        for(i = 0; i < someNumbers.length; i++)
        {
            if(someNumbers[i] % 2 == 0){
                System.out.println("The position of first even number from vector is: " + i);
                result = someNumbers[i];
                break;
            }
        }
       
        return result;
    }

    
    public static int firstPrime(int[] someNumbers) {
        int result = 0;
        int i;
        for(i = 0; i < someNumbers.length; i++)
        {
            if(isPrimeNumber(someNumbers[i])){
                System.out.println("The position of first prime number from vector is: " + i);
                result = someNumbers[i];
                break;
            }
        }
        
        return result;
    }

    
    public static void main(String[] args) {
        int[] someNumbers = new int[]{15, 18, 13, 22, 21, 11, 57, 141, 563, 16};

        System.out.println("First odd number: " + firstOdd(someNumbers));
        System.out.println("First even number: " + firstEven(someNumbers));
        System.out.println("First prime number: " + firstPrime(someNumbers));
    }
}
