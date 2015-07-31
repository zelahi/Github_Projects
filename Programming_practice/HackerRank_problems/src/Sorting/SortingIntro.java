package Sorting;

import java.util.Scanner;

/**
 * Created by elahiz on 4/28/2015.
 */
public class SortingIntro {

    /** search through array to find a specific value
     *
     * @param valueToBeFound - value which we are trying to find
     * @param values - array of values to be searched
     */
    public static void findValueInArray(int valueToBeFound, int[] values){
        for(int i = 0; i < values.length; i++){
            if(values[i] == valueToBeFound){
                System.out.println(i);
            }
        }

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //get array and values to search
        int valueToBeFound = sc.nextInt();
        int arraySize = sc.nextInt();
        int values[] = new int[arraySize];

        //add values to the array
        for(int i = 0; i < arraySize; i++) {
            values[i] = sc.nextInt();
        }

        findValueInArray(valueToBeFound, values);
    }
}
