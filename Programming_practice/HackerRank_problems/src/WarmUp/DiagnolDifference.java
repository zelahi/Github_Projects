package WarmUp;

import java.util.Scanner;

/**
 * Purpose : calculate the difference between the sum of two diagnols
 *
 * Description : there are two solutions avaliable.  The bottleneck is calculating the sum
 *               The first solution is done in O(n^2) time while the second solution is done
 *               in O(n) time
 */
public class DiagnolDifference {

    /** Calculates the difference between the sums of the diagnols in O(n^2) time
     *
     * @param values - array which contains the numbers we want to sum
     * @return difference between the sums of the diagnols
     */
    public static int calcDiff(int[][] values){
        int firstDiagSum = 0;
        int secondDiagSum = 0;

        for(int i = 0; i < values.length; i++) {
            for(int j = 0; j < values.length; j++) {
                //increase sum of first diagnol
                if(i == j){
                    firstDiagSum += values[i][j];
                }

                //increase sum of second diagnol
                if(i + j == values.length-1){
                    secondDiagSum += values[i][j];
                }
            }
        }
        System.out.println("Sum of the elements in the first diagnol: " + firstDiagSum);
        System.out.println("Sum of the elements in the second diagnol: " + secondDiagSum);

        return Math.abs(firstDiagSum - secondDiagSum);
    }

    /** calculates the difference of the diagnols in O(n) time
     *
     * @param values - array of integers which contains the values that need to be summed
     * @return the difference between the sum of the values at two diagnols
     */
    public static int calcDiffBetter(int[][] values){
        int firstDiagSum = 0;
        int secondDiagSum = 0;

        for(int i = 0; i < values.length; i++){
            //increase sum of the first diagnol
            firstDiagSum += values[i][i];
            secondDiagSum += values[i][values.length-i-1];
        }

        return Math.abs(firstDiagSum - secondDiagSum);

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sizeOfMatrix = sc.nextInt();

        //create a new 2D array
        int[][] values = new int[sizeOfMatrix][sizeOfMatrix];

        //create 2D array
        for(int i = 0; i < values.length; i++){
            for(int j = 0; j < values.length; j++){
                values[i][j] = sc.nextInt();
            }
        }

        //Calculate and print out the difference of the diagnols
        System.out.println(calcDiff(values));
        System.out.println(calcDiffBetter(values));



    }
}
