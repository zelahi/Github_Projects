package Sorting;

import java.util.Scanner;

/**
 * Created by elahiz on 4/28/2015.
 */
public class InsertionSort1 {

    /** insert the value at the end of the array into its sorted position in the array
     *
     * @param values - sorted array of integers
     */
    public static void insertSort(int[] values){
        int unsorted = values[values.length - 1];
        boolean sorted = false;

        //iterate through the array
        for(int i = values.length - 2; i > -1; i--){
            //shift the value over one to the right if the value is greater than unsorted
            if(values[i] > unsorted){
                values[i+1] = values[i];
                printArray(values);
            } else if (values[i] <= unsorted){
                values[i+1] = unsorted;
                sorted = true;
                break;
            }
        }


        //check if the last value was unsorted
        if(sorted == false) {
            values[0] = unsorted;
        }

        printArray(values);
    }

    /** Print out the values in the array
     *
     * @param values - array which we need to print
     */
    public static void printArray(int[] values){
        for(int num : values){
            System.out.print(num + " " );
        }

        //print a blank line
        System.out.println(" ");
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();

        int[] values = new int[arraySize];

        //enter values into the array
        for(int i=0; i < arraySize; i++){
            values[i] = sc.nextInt();
        }

        insertSort(values);

    }
}
