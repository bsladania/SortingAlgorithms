/*
 * Bubble sort works by swapping adjacent elements if they are not in the desired order. This process repeats from the beginning of the array until all elements are in order.
 * Steps: Here are the steps for sorting an array of numbers from least to greatest
 * 4 2 1 5 3
 * ---------
 * 2 4 1 5 3
 * 2 1 4 5 3
 * 2 1 4 3 5 - End of first pass
 * 1 2 4 3 5
 * 1 2 3 4 5 - End of second pass
 * 
 * Worst and Average case: O(n*n), when the array is in reverse order
 * Best case: O(n), when the array is already sorted
 * 
 * It does not require extra space(memory) or even stack space like in the case of merge sort or quick sort.
 */

import java.util.*;
import java.io.*;
import java.sql.Timestamp;

public class BubbleSort
{
 public static void main(String[] args)
 {
   int[] data = {9,8,7,6,5,4,3,2,1,0,9,8,7,6,5,4,3,2,1,0,9,8,7,6,5,4,3,2,1,0,9,8,7,6,5,4,3,2,1,0,9,8,7,6,5,4,3,2,1,0,
     9,8,7,6,5,4,3,2,1,0,9,8,7,6,5,4,3,2,1,0,9,8,7,6,5,4,3,2,1,0,9,8,7,6,5,4,3,2,1,0,9,8,7,6,5,4,3,2,1,0,9,8,7,6,5,4};
   //bubbleSort(data);
   display(bubbleSort(data));
 }
 
 public static int[] bubbleSort(int[] numbers)
 {
   boolean isSorted = false;
   int temp;
   Date date = new Date();
   Timestamp start = new Timestamp(date.getTime());
   System.out.println("Beginning timestamp: " + start);
   while(!isSorted){
     isSorted = true;
     for(int x = 0; x<numbers.length-1; x++)
     {
       if(numbers[x] > numbers[x+1])
       {
         temp = numbers[x];
         numbers[x] = numbers[x+1];
         numbers[x+1] = temp;
         isSorted = false;
       }
     }
 }
   Timestamp end = new Timestamp(date.getTime());
   System.out.println("Finsihed timestamp: " + end);
  return numbers; 
}
 
 public static void display(int[] numbers)
 {
   for(int i=0; i<numbers.length; i++){
     System.out.print(numbers[i] + "\t");
   }
 }
}