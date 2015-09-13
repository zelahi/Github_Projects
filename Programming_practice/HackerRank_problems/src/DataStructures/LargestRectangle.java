package DataStructures;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by zuhayrelahi1 on 6/21/15.
 */
public class LargestRectangle {

    public static int calcLargestArea(int[] height){
        Stack<Integer> building = new Stack<Integer>();
        int maxArea = 0;



        for(int i = 0; i < height.length; i++){
            int value = building.pop();
        }
        return maxArea;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numOfBuildings = sc.nextInt();

        //add items to the array
        int[] height = new int[numOfBuildings];
        for(int i = 0; i < numOfBuildings; i++){
            height[i] = sc.nextInt();
        }

        //print out the max Area
        int maxArea = calcLargestArea(height);
        System.out.println(maxArea);
    }
}
