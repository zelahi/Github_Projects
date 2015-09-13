package Algorithms.WarmUp.WarmUp;

import java.util.Scanner;

/**
 * Created by zuhayrelahi1 on 4/11/15.
 *
 * Description: Given an integer K, find the maximum number of 1x1 squares,
 *              you can get based on the number of cuts made
 */
public class HalloweenParty {

    /* return maximum # of cuts
     *
     * @param k - number of cuts that can be made
     *
     * @return - number of squares that are cut
     */
    public static long getMaxSquares(int k){
        long numOfSquares = 0;

        // formula - # of cuts/2 * (# of cuts - (# of cuts/2))
        numOfSquares = (long) (k/2) *  (long) (k - (k/2));
        return Math.abs((numOfSquares));
    }

    //test function
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numOfTestCases = sc.nextInt();

        for(int i = 0; i < numOfTestCases; i++){
            Integer k = sc.nextInt();
            System.out.println(getMaxSquares(k));
        }
    }
}
