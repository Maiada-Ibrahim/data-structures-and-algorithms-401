/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge;

import java.util.Arrays;

public class App {

        public static void main (String[]args){
            int[] arr = {8, 4, 23, 42, 16, 15};
            QuickSort(arr, 0, arr.length - 1);
            System.out.println(Arrays.toString(arr));
        }

        public static void QuickSort ( int[] arr, int left, int right){
            if (left < right) {

                int position = Partition(arr, left, right);
//                System.out.println(position);
//                System.out.println("left"+left);
//                System.out.println("right"+right);
//                System.out.println("stop");

                QuickSort(arr, left, position - 1);
                  System.out.println(position);
                System.out.println("left"+left);
                System.out.println("right"+right);
                System.out.println("stops");
                QuickSort(arr, position + 1, right);
//                System.out.println(position);
//                System.out.println("left"+left);
//                System.out.println("right"+right);
//                System.out.println("stopth");
            }
        }

        public static int Partition ( int[] arr, int left, int right){
            int pivot = arr[right];
            int low = left - 1;
            for (int i = left; i < right; i++) {
                if (arr[i] <= pivot) {
                    low++;
                    Swap(arr, i, low);
                }
            }
            Swap(arr, right, low + 1);
            return low + 1;
        }

        public static void Swap ( int[] arr, int i, int low){
            int temp;
            temp = arr[i];
            arr[i] = arr[low];
            arr[low] = temp;
        }

    }
