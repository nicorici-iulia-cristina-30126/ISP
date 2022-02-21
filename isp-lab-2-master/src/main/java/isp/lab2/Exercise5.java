package isp.lab2;

import java.util.Random;

public class Exercise5 {

    public static int[] generateRandomNumbers() {
        int random[] = new int[20];
        Random r = new Random();
        for(int i = 0; i < 20; i++)
        {
            random[i] = r.nextInt(1000 + 1000)-1000;
        }
        return random;
    }

    
    public static int[] getSortedNumbers(int[] randomNumbers) {
        int i, j, aux;
        for(i = 0; i < 20; i++)
        {
            for(j = i + 1; j < 20; j++)
            {
                if(randomNumbers[i] > randomNumbers[j])
                {
                    aux = randomNumbers[i];
                    randomNumbers[i] = randomNumbers[j];
                    randomNumbers[j] = aux;
                }
            }
        }
        return randomNumbers;
    }

    public static void main(String[] args) {
        // display the random generated numbers
        int[] randomNumbers = generateRandomNumbers();
        System.out.println("The random generated numbers are:");
        for (int i = 0; i < randomNumbers.length; i++) {
            if(i == randomNumbers.length - 1)
                System.out.print(randomNumbers[i] + ". ");
            else
                System.out.print(randomNumbers[i] + ", ");
        }
        int[] sortedNumbers = getSortedNumbers(randomNumbers);
        // display the sorted numbers
        System.out.println("\nThe sorted numbers are:");
        for (int i = 0; i < sortedNumbers.length; i++) {
            if(i == sortedNumbers.length - 1)
                System.out.print(sortedNumbers[i] + ".");
            else
                System.out.print(sortedNumbers[i] + ", ");
        }
    }
}
