package Arrays.src;

import java.util.Random;
import java.util.Arrays;
import java.util.Collections;

public class Main {

  public static void main(String[] args) {
    
    Integer[] arr = new Integer[5];
    Random randomInt = new Random();
    
    for(int i = 0; i < arr.length; i++){

      arr[i] = randomInt.nextInt(100);
    }

    System.out.println(Arrays.toString(arr));

    Arrays.sort(arr);

    Integer[] arr2 = Arrays.copyOf(arr, arr.length);

    for(int j = arr2.length - 1; j >= 0; j--){
      arr[j] = arr2[arr2.length - 1 - j]; 
    }

    System.out.println("First Reverse Sort: ");
    System.out.println(Arrays.toString(arr));

    Arrays.sort(arr, Collections.reverseOrder());
    System.out.println("Second Reverse Sort: ");
    System.out.println(Arrays.toString(arr));
  }
  
}
