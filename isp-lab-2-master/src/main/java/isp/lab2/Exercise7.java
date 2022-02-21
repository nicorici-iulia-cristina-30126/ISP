package isp.lab2;

import java.util.Random;
import java.util.Scanner;

public class Exercise7 {

    /**
     * This method should generate a random number which
     * represent the position in the given arrays,so
     * the random should be between 0 and 7
     *
     * @return the generated random
     */
    public static int generateARandom() {
        int random;
        Random r = new Random();
        random = r.nextInt(7-0);
        return random;
    }

    public static void main(String[] args) {
        int[] ucl = new int[]{1, 2, 3, 4, 5, 6, 7, 13};
        int[] answers = new int[]{10, 4, 2, 1, 2, 1, 1, 1};
        int times = generateARandom();
        int i;
        System.out.println("times = " + times);
        for(i = 0; i < answers.length; i++)
        {
            if(ucl[times] == answers[i])
            {
                System.out.println("Great, you guessed the number " + ucl[times] + ". You tried " + i + " times");
                break;
            }
            if(ucl[times] < answers[i])
            {
                System.out.println("The number " + answers[i] + " is too big, try again");
            }
            if(ucl[times] > answers[i])
            {
                System.out.println("The number " + answers[i] + " is too small, try again");
            }
        }
        if(i == answers.length)
        {
            System.out.println("You didn't guess the secret number ");
        }
        /*int number = 0, j = 0;
        while(number != ucl[times])
        {
            System.out.print("Enter a number...");
            Scanner s = new Scanner(System.in);
            number = s.nextInt();
            if(ucl[times] < number)
            {
                System.out.println("The number is too big, try again");
                
            }
            if(ucl[times] > number)
            {
                System.out.println("The number is too small, try again");
            }
            j++;
        }
        System.out.println("Great, you guessed the number " + ucl[times] + ". You tried " + j + " times");*/
        
    }
}
