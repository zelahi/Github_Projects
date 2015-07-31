package Sorting;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by zuhayrelahi1 on 6/20/15.
 */
public class Quicksort {

    /** Partitions the array such that elements smaller than p are on the left and
     *  elements larger than p are on the right
     *
     * @param arr - input array containing values to be sorted
     * @param pivotValue - pivot value we use to compare
     * @return ArrayList with values sorted
     */
    public static Integer[] partition(int[] arr, int pivotValue){
        ArrayList<Integer> smaller = new ArrayList<Integer>();
        ArrayList<Integer> larger = new ArrayList<Integer>();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < pivotValue){
                smaller.add(arr[i]);
            }else {
                larger.add(arr[i]);
            }
        }

        ArrayList<Integer> res = new ArrayList<Integer>();
        res.addAll(smaller);
        res.addAll(larger);

        Integer[] sorted = new Integer[res.size()];
        sorted = res.toArray(sorted);
        return sorted;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numOfElements = sc.nextInt();

        //add elements to the array
        int[] arr = new int[numOfElements];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        Integer[] results = partition(arr,arr[0]);

        //print out the results after the sort
        for(int i = 0; i < results.length; i++){
            System.out.print(results[i]);
        }
    }
}
