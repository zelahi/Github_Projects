package Algorithms.WarmUp.Implementation;

import java.util.Scanner;

/**
 * Created by zuhayrelahi1 on 9/12/15.
 *
 * Problem Statement: The professor is conducting a course on Discrete Mathematics to a class of N students.
 * He is angry at the lack of their discipline, and he decides to cancel the class if there are fewer than K students
 * present after the class starts.  Given the arrival time of each student, your task is to find out if the class gets
 * cancelled or not.
 *
 * Space: O(1)
 * Runtime: O(n)
 */
public class AngryProfessor {

    /** Prints Yes or No based on the number of students and if class is cancelled
     *
     * @param arrivals - the arrival times of the students
     * @param K - the number of students that must appear for class to start
     */
    public static void isClassCancelled(int[] arrivals, int K){
        int noOfStudents = 0;

        //check if # of students arrive
        for(int i = 0; i < arrivals.length; i++){
            if(arrivals[i] <= 0){
                noOfStudents = noOfStudents + 1;
            }

        }

        //Print YES or NO if class starts
        if(noOfStudents < K){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //add number of test cases
        int numOfTestCases = sc.nextInt();

        //get the N and K values
        for(int j = 0; j < numOfTestCases; j++) {
            int[] values = new int[2];
            for (int i = 0; i < values.length; i++) {
                values[i] = sc.nextInt();
            }
            int N = values[0];
            int K = values[1];

            //store the arrival times
            int[] arrivals = new int[N];
            for (int i = 0; i < arrivals.length; i++) {
                arrivals[i] = sc.nextInt();
            }

            isClassCancelled(arrivals, K);
        }
    }
}
