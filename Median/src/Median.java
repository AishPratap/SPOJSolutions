/**
 * Created by aishpratap on 5/23/17.
 */


/**
 * Needs to be corrected, Incorrect solution
 */



public class Median {

  public static void main(String[] args){

    int[] nums1 = new int[0];
    int[] nums2 = new int[]{3,4};
    System.out.println(getMedian(nums1, nums2));

  }

  public static double getMedian(int[] nums1, int[] nums2){

    int l1 = nums1.length;
    int l2 = nums2.length;
    int smallest;
    int largest;

    if (l1 == 0 && l2 > 0){
      smallest = nums2[0];
      largest = nums2[l2-1];
    }else if (l2 == 0 && l1 > 0){
      smallest = nums1[0];
      largest = nums1[l1-1];
    }else if (l1 == 0 && l2 == 0){

      return 0;
    }else{

      smallest = nums1[0]>nums2[0]?nums2[0]:nums1[0];
      largest = nums1[l1-1]>nums2[l2-1]?nums1[l1-1]:nums2[l2-1];
    }

    return (double)(smallest + largest)/2;

  }

}
