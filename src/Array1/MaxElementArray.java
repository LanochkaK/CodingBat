package Array1;

import java.util.Arrays;

public class MaxElementArray {

    public static void main(String[] args) {


        int[] a = {1, 2, 3, 4, 5, 6, 7};

        Integer max = Integer.MIN_VALUE;


        int[] res = new int[a.length];

        for (int i = 0; i < a.length; i++) {

            if(a[i]> max){

                max =a[i];
            }
        }

        System.out.println(max);




    // second part of task:

        for (int i = 0; i < res.length; i++) {

            res[i]= max;
        }


        System.out.println(Arrays.toString(res));















    }
}
