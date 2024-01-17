package org.example;

import java.util.Arrays;


public class Solutions {
    public static void main(String[] args) {

        int[] array = {1,0,0,1,0,0,1,1,0,0,0,1,1,0,1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else
                array[i] = 1;
        }
        System.out.println(Arrays.toString(array));



        int[] array_2 = new int [100];
        for (int i = 0; i < array_2.length; i++){
            array_2[i] = i+1;
        }
        System.out.println(Arrays.toString(array_2));



       int[] array_3 = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0; i < array_3.length; i++){
            if (array_3[i] < 6){
                array_3[i] = (array_3[i] * 2);
            }
        }
        System.out.println(Arrays.toString(array_3));



        int[][] array_4 = new int [9][9];
        for (int i = 0; i < array_4.length; i++){
            for (int j = 0; j < array_4[i].length; j++)
            {
             if (i == j || i == (8-j)){
                 array_4[i][j] = 1;
             }
             System.out.print(array_4[i][j]);
            }
             System.out.println();
        }


    }

}