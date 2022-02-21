package isp.lab2;

import java.util.Scanner;

public class Exercise2 {

    /**
     * This method should ask user to enter an int which represent
     * the number of points a team have
     *
     * @return the number of points entered by user
     */
    private static int readNumberOfPoints() {
        int number_points;
        System.out.print("Enter the number of the points: ");
        Scanner s = new Scanner(System.in);
        number_points = s.nextInt();
        return number_points;
    }

    /**
     * This method should return a message according with the specifications
     *
     * @param numberOfPoints the number of points entered by user
     * @return The appropriate message
     */
    public static String messageToUser(int numberOfPoints) {
        System.out.print("The Team: ");
        String Liga;
        switch(numberOfPoints)
        {
            case 49: Liga = "CFR Cluj 49 points\n" ;
                     break;
            case 46: Liga = "Universitatea Craiova 46 points\n";
                     break;
            case 43: Liga = "FCSB 43 points\n";
                     break;
            case 42: Liga = "FC Botosani 42 points\n";
                     break;
            case 40: Liga = "Gaz Metan 40 points\n";
                     break;
            case 39: Liga = "Astra Giurgiu 39 points\n";
                     break;
            default: Liga = "No team from Liga 1 have " + numberOfPoints +" points";
                     break;
            
        }
        return Liga;
    }

    public static void main(String[] args) {
        System.out.println("The message to show to user is:");
        System.out.println(messageToUser(readNumberOfPoints()));
    }
}
