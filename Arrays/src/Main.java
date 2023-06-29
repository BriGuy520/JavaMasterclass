package Arrays.src;

import java.util.Random;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    
    int[] arr = new int[5];
    Random randomInt = new Random();
    
    for(int i = 0; i < arr.length; i++){

      arr[i] = randomInt.nextInt(100);
    }

    System.out.print(Arrays.toString(arr));
    Arrays.sort(arr);
    System.out.println();
    System.out.print(Arrays.toString(arr));
  }
  
}
