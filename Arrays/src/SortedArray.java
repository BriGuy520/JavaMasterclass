package Arrays.src;

import java.util.Scanner;
import java.util.Arrays;

public class SortedArray {

  
  public static int[] getIntegers(int size){

    int[] arr = new int[size];
    
    for(int i = 0; i < arr.length; i++){

      System.out.printf("Add Value: ");
  
      Scanner number = new Scanner(System.in);
  
      arr[i] = number.nextInt();
    }

    System.out.print(Arrays.toString(arr));

    return arr;
  }

  public static int[] sortIntegers(int[] array){

    int[] sortedArray = Arrays.copyOf(array, array.length);

    Arrays.sort(sortedArray);

    return sortedArray;

  }

  public static void printArray(int[] arr){


    System.out.print(Arrays.toString(arr));

    // for(int i = 0; i < arr.length; i++){

    //   System.out.printf("Elements %d contents %d%n", i, arr[i]);
    // }
  }

}
