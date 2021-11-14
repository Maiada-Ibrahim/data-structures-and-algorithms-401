/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challange;

import java.util.Arrays;

public class Library {
    public static void main(String[] args) {

        int[] array1 = {8,4,23,42,16,15};
        insertionSort(array1);
        System.out.println(Arrays.toString(array1));



        int[] array2 = {20,18,12,8,5,-2};
        insertionSort(array2);
        System.out.println(Arrays.toString(array2));



        int[] array3 = {5,12,7,5,5,7};
        insertionSort(array3);
        System.out.println(Arrays.toString(array3) );



        int[] array4 = {2,3,5,7,13,11};
        insertionSort(array4);
        System.out.println(Arrays.toString(array4) );
    }

    public static void insertionSort(int[] array){
        for (int i = 1; i<array.length; i++){
            int j = i-1;
            int temp = array[i];

            while (j>=0 && temp < array[j]){
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = temp;
        }


    }

    }
