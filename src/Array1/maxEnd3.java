package Array1;

public class maxEnd3 {
  /*  Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.


    maxEnd3([1, 2, 3]) → [3, 3, 3]
    maxEnd3([11, 5, 9]) → [11, 11, 11]
    maxEnd3([2, 11, 3]) → [3, 3, 3]   */


    public static void main(String[] args) {

    }



    public int[] maxEnd3(int[] nums) {

       //  int[] b = new int[a.length];
      //  int[] newArr =  new int [nums.length];

        if (nums[0] > nums[2]) {

          return  new int[] {nums[0], nums[0], nums[0]};


        }  else {

        return new int[] {nums[2], nums[2], nums[2]};
    }


    }







}
