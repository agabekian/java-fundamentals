/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
public class Library {
    public int[] rollDice(int n) {
        Random rand = new Random();
        int[] res = new int[n];
        int i = 0;
        while (i < n) {
            res[i] = rand.nextInt(7);//the only way to reassign
            i += 1;
        }
        return res;
    }

    public boolean containsDuplicates(Integer[] arr) {
        return new HashSet<Integer>(Arrays.asList(arr)).size() != arr.length;
    }

    public boolean containsDuplicates2(int[] arr) { //brute force
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) return true;
            }
        }
        return false;
    }

    public float calculateAverage(int[] arr){
        float sum = 0f;
        for (int t: arr) {
            sum+=t;
        }
        return sum/arr.length;
    }

    public float arrayOfArrays(int[][] arrse){
        float[] averages = new float[arrse.length];
        for(int i =0; i < arrse.length; i++){
            float avg = calculateAverage(arrse[i]);
            System.out.println("curr= average"+avg);
            averages[i]=avg;
        }
        System.out.println(averages);
        float min = averages[0];
        System.out.println("start min"+min);
        for(int j = 0; j < averages.length; j++){
            if(averages[j]< min){
                min = averages[j];
            }
        }
        System.out.println("Min is"+ min);
        return min;
    }
}
