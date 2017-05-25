import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by aishpratap on 3/29/17.
 */
public class NthLargest {

  public static void main(String[] args) {

//    useHeap();
    useQuickSelect();

  }

//  Time complexity is O(nlogK) space complexity is O(k)
  public static void useHeap(){

    Scanner s = new Scanner(System.in);

    int testCases = s.nextInt();

    for(int i = 0; i < testCases ; i ++){

      int tstCaseNo = s.nextInt();

      PriorityQueue<Integer> pqueue = new PriorityQueue<>(3);

      for (int j = 0; j < 10 ; j ++){

        pqueue.offer(s.nextInt());
        if (pqueue.size() > 3){
          pqueue.poll();
        }
      }

      System.out.println(i+1 + " " + pqueue.peek());
    }

  }

//time complexity is avg case O(n) while worst case is O(n^2)
  public static void useQuickSelect(){
    Scanner s  = new Scanner(System.in);
    int testCases = s.nextInt();

    for(int i = 0; i < testCases; i++){
      int testCaseNo = s.nextInt();

      int[] numbers = new int[10];

      for (int j = 0; j < 10; j++){
        numbers[j] = s.nextInt();
      }

      int answer = performQuickSelect(numbers.length - 3 + 1, numbers, 0, numbers.length-1);

      System.out.println(i+1 + " " + answer);

    }
  }

  public static int performQuickSelect(int k, int[] numbers, int begin, int end){

    int pivot = numbers[end];

    int left = begin;
    int right = end;

    while(true){

      while(numbers[left] < pivot && left < right){
        left++;
      }
      while (numbers[right] >= pivot && right > left){
        right--;
      }
      if (left == right){
        break;
      }

      swap(numbers, left, right);
    }

    swap(numbers, left, end);

    if(k == left + 1){
      return pivot;
    }else if(k < left + 1){
      return performQuickSelect(k, numbers, begin, left - 1);
    }else{
      return performQuickSelect(k, numbers, left + 1, end);
    }

  }

  public static void swap(int[] nums, int left, int right){
    int temp = nums[left];
    nums[left] = nums[right];
    nums[right] = temp;
  }
}
