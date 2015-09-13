package Algorithms.WarmUp.WarmUp;

import java.util.Scanner;

/**
 * Created by zuhayrelahi1 on 6/17/15.
 */
public class Staircase {

    /** Print a staircase of #
     *
     * @param height - the height of the staircase
     */
    public static void printStairCase(int height){

        for(int i = 0; i <= height; i++){
            for(int j = 0; j < i; j++){
                System.out.printf("#");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();

        printStairCase(height);
    }
}
