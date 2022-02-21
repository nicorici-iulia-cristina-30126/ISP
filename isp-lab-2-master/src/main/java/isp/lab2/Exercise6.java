package isp.lab2;

import java.util.Scanner;

public class Exercise6 {

    public static int[] generateVector(int n) {
        int sum;
        int vector[] = new int[n];
        vector[0] = 1;
        vector[1] = 2;
        for(int i = 2; i < n; i++)
        {
            sum = vector[i - 2] * vector[i - 1];
            vector[i] = sum;
        }
        return vector;
        
    }

    /**
     * This method should generate the required vector recursively
     *
     * @param n the length of teh generated vector
     * @return the generated vector
     */
    public static int[] generateRandomVectorRecursively(int n) {
        throw new UnsupportedOperationException();
        
    }

    public static void main(String[] args) {
        int n;
        System.out.print("n = ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        while(n < 8)
        {
            System.out.println("Incorrect number, n >= 8 ...");
            System.out.print("n = ");
            n = s.nextInt();
        }
        int vector_nonrecursively[] = generateVector(n);
        System.out.println("Generated vector in non-recursive method: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(vector_nonrecursively[i] + " ");
        }
        
        /* int vector_recursively[] = generateRandomVectorRecursively(n);
        System.out.println("Generated vector inrecursive method: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(vector_recursively[i] + " ");
        }*/
      }
}
