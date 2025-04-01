package Collection;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        int []arr  = {11, 21, 41, 12};

        System.out.println(arr.length);
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
        System.out.println("Start 2D array");
    int [][]brr={{1,2,3},
                {4,5,6}};


    for(int i=0;i<brr.length;i++){
        for(int j=0;j<brr[i].length;j++){
            System.out.print(brr[i][j] +" ");
        }
       System.out.println();

    }


}}
